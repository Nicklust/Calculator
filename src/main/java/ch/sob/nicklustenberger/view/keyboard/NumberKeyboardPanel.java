package main.java.ch.sob.nicklustenberger.view.keyboard;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NumberKeyboardPanel  {
    public JPanel numberKeyboard;

    public NumberKeyboardPanel() {
        numberKeyboard = new JPanel();


        String[] buttonLabels = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};


        ActionListener buttonListener = e -> {
            JButton source = (JButton) e.getSource();
            System.out.println("Button " + source.getText());
        };


        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            button.addActionListener(buttonListener);
            numberKeyboard.add(button);
            button.setBackground(Color.LIGHT_GRAY);
        }

        numberKeyboard.setVisible(true);
        numberKeyboard.setLayout(new GridLayout(3, 3));
        numberKeyboard.setBounds(0, 0, 400, 400);


    }

    public JPanel getNumberKeyboardPanel() {
        return numberKeyboard;
    }
}
