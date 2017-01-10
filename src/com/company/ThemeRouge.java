package com.company;

import javax.swing.*;

/**
 * Created by Netoun on 04/01/2017.
 */
public class ThemeRouge implements IThemeFactory {

    public JButton createButton()
    {
        return(new ButtonRouge().createButton());
    }
}
