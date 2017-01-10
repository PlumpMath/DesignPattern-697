package com.company;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Netoun on 04/01/2017.
 */
public class ButtonBleue extends JButton implements IButton{


    @Override
    public JButton createButton() {
        JButton buttonBleue = new JButton("Bleue");
        buttonBleue.setBackground(Color.blue);
        return buttonBleue;
    }
}
