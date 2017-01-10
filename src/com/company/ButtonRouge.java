package com.company;

import com.sun.org.apache.regexp.internal.RE;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Netoun on 04/01/2017.
 */
public class ButtonRouge extends JButton implements IButton  {

    @Override
    public JButton createButton() {
        JButton buttonRouge = new JButton("Rouge");
        buttonRouge.setBackground(Color.red);
        return buttonRouge;
    }
}
