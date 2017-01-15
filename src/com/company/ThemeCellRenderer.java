package com.company;

import javax.swing.*;
import java.awt.*;

public class ThemeCellRenderer extends JLabel implements ListCellRenderer<Object> {
    public ThemeCellRenderer() {
        setOpaque(true);
    }

    public Component getListCellRendererComponent(JList<?> list,
                                                  Object theme,
                                                  int index,
                                                  boolean isSelected,
                                                  boolean cellHasFocus) {
        setText(((IThemeFactory) theme).getName());
        return this;
    }
}