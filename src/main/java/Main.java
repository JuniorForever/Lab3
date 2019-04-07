import Controller.ControllerClass;

import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        ControllerClass controller = new ControllerClass();
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(300,200);
        controller.setView(frame);
        frame.setVisible(true);
    }
}