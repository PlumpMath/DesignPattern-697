package com.company;

import javax.swing.*;

/**
 * Created by Netoun on 04/01/2017.
 */
public class ThemeBleue implements IThemeFactory {

    public JButton createButton()
    {
        return(new ButtonBleue().createButton());
    }
}
