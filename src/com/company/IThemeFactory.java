package com.company;

import javax.swing.*;

/**
 * Created by Netoun on 04/01/2017.
 */
interface IThemeFactory {

    String getName();
    JButton createButton(String text);

}
