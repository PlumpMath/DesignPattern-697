package com.company;

import javafx.event.EventHandler;
import javafx.scene.control.ComboBox;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.*;

public class Main extends JFrame{

    private static final long serialVersionUID = 1L;
    public JButton button;

    public Main() {

        // set flow layout for the frame
        this.getContentPane().setLayout(new FlowLayout());
        Object[] elements = new Object[]{"Bleue", "Rouge"};
        JLabel label1 = new JLabel("Changer le theme");

        getContentPane().add(label1);



        final JComboBox comboBox = new JComboBox(elements);
        getContentPane().add(comboBox);
        button = new ThemeBleue().createButton();
        add(button);
        comboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JComboBox comboBox = (JComboBox) e.getSource();
                Object selected = comboBox.getSelectedItem();

                getContentPane().remove(button);
                if (selected.equals("Rouge")) {
                    button = new ThemeRouge().createButton();
                } else {
                    button = new ThemeBleue().createButton();
                }
                getContentPane().add(button);           }
        });
    }

    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:

        //creating and showing this application's GUI.

        javax.swing.SwingUtilities.invokeLater(new Runnable() {

            public void run() {

                JFrame frame = new Main();
                //Display the window.
                frame.pack();
                //frame.setSize(200, 200);
                frame.setVisible(true);


            }

        });

	// write your code here
    }
}
