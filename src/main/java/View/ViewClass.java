package View;

import Model.Worker;

import javax.swing.*;
import java.awt.*;

public class ViewClass {
    public static JButton Cut = new JButton("Пилить");
    public static JButton Chip = new JButton("Стругать");
    public static JButton Screwdriver = new JButton("Раскрутить");
    public static JButton ReadyStatus = new JButton("Проверить готовность");

    public static String getCut(){
        return Cut.getText();
    }

    public static String getChip(){
        return Chip.getText();
    }

    public static String getScrewdriver(){
        return Screwdriver.getText();
    }

    public  void addComponentsToPane(Container pane) {
        pane.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();


        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 0;
        pane.add(Cut, c);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.02;
        c.gridx = 0;
        c.gridy = 1;
        pane.add(Chip, c);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.0025;
        c.gridx = 0;
        c.gridy = 2;
        pane.add(Screwdriver, c);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.0025;
        c.gridx = 0;
        c.gridy = 3;
        pane.add(ReadyStatus, c);


    }
}
