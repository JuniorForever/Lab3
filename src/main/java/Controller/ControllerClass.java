package Controller;

import Model.Hervesting;
import Model.Product;
import Model.Worker;
import Model.setMethodException;
import View.ViewClass;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControllerClass  {

        private ViewClass view = new ViewClass();


    public ControllerClass(){
            view.Screwdriver.addActionListener(new ButtonEventListener());
            view.Chip.addActionListener(new ButtonEventListener1());
            view.Cut.addActionListener(new ButtonEventListener2());
            view.ReadyStatus.addActionListener(new ButtonEventListener3());
    }
    public void setView(Container pane){

        view.addComponentsToPane(pane);
    }


    class ButtonEventListener implements ActionListener {
        public void actionPerformed(ActionEvent e)  {
            if(view.getScrewdriver()=="Раскрутить") {
               try {
                   Worker.Work("Раскрутить");
               }catch(setMethodException el){
                   System.out.println("Рабочий не может выполнинть заданную команду");
               }
                view.Screwdriver.setText("Закрутить");
                JOptionPane.showMessageDialog(null,"Раскручено","Output",JOptionPane.PLAIN_MESSAGE);
            }
            else {
                try {
                    Worker.Work("Раскрутить");
                }catch(setMethodException el){
                    System.out.println("Рабочий не может выполнинть заданную команду");
                }
                view.Screwdriver.setText("Раскрутить");
                JOptionPane.showMessageDialog(null,"Закручено","Output",JOptionPane.PLAIN_MESSAGE);
            }
        }

    }
    class ButtonEventListener1 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                Worker.Work("Стругать");
            }catch(setMethodException el){

            }
            JOptionPane.showMessageDialog(null, Hervesting.Form,"Output",JOptionPane.PLAIN_MESSAGE);
        }
    }
    class ButtonEventListener2 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                Worker.Work("Пилить");
            }catch(setMethodException el){
                System.out.println("Рабочий не может выполнинть заданную команду");
            }
            JOptionPane.showMessageDialog(null,Hervesting.Form,"Output",JOptionPane.PLAIN_MESSAGE);
        }

    }
    class ButtonEventListener3 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Product.checkReady();
            JOptionPane.showMessageDialog(null, Product.readyStatus, "Output", JOptionPane.PLAIN_MESSAGE);
        }
    }
}
