package com.company;

import javax.swing.*;

/**
 * Created by Netoun on 04/01/2017.
 */
public class ThemeRouge implements IThemeFactory {
    @Override
    public String getName() {
        return "Rouge";
    }

    public JButton createButton(String text)
    {
        return new ButtonRouge(text);
    }
}
