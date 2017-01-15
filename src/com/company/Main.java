package com.company;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Main extends JFrame{


    private static final long serialVersionUID = 1L;
    public JButton button;

    private static void resetLookAndFeel() {
        try {
            // Set System L&F
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (UnsupportedLookAndFeelException e) {
            // handle exception
        } catch (ClassNotFoundException e) {
            // handle exception
        } catch (InstantiationException e) {
            // handle exception
        } catch (IllegalAccessException e) {
            // handle exception
        }
    }




    public static void main(String[] args) {
        resetLookAndFeel();
        final ThemeCatalog themes = new ThemeCatalog();

       SwingUtilities.invokeLater(new Runnable() {

            public void run() {

                JDialog dialog = new JDialog();
                dialog.setSize(300, 200);//On lui donne une taille
                dialog.setTitle("Theme boutton"); //On lui donne un titre
                dialog.setVisible(true);//On la rend visible

                JPanel pan = new JPanel();
                pan.setLayout(new FlowLayout());

                dialog.add(pan);

                JComboBox themeSelector = new JComboBox(themes);

                themeSelector.setRenderer(new ThemeCellRenderer());
                JButton button = new ThemeBleue().createButton("Button");


                themeSelector.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        pan.remove(1);
                        IThemeFactory but = (IThemeFactory) themes.getSelectedItem();
                        pan.add(but.createButton("Button"));

                        pan.repaint();
                        pan.revalidate();
                    }
                });


                pan.add(themeSelector);
                pan.add(button);

                dialog.setDefaultCloseOperation(JDialog.EXIT_ON_CLOSE);

            }

        });
    }
}
