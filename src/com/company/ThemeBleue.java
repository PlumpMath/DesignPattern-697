package com.company;

import javax.swing.*;

/**
 * Created by Netoun on 04/01/2017.
 */
public class ThemeBleue implements IThemeFactory {

    @Override
    public String getName() {
        return "Bleue";
    }

    public JButton createButton(String text)
    {
        return new ButtonBleue(text);
    }
}
