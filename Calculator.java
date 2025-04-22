import java.awt.*;
import javax.swing.*;

class Calculator{
    public static void main(String[] args){
        JFrame frame = new JFrame("Calculator");
        frame.setLayout(new BorderLayout());
        JTextField t =new JTextField();

        JButton b1 =new JButton("1");
        JButton b2 =new JButton("2");
        JButton b3 =new JButton("3");
        JButton b4 =new JButton("4");
        JButton b5 =new JButton("5");
        JButton b6 =new JButton("6");
        JButton b7 =new JButton("7");
        JButton b8 =new JButton("8");
        JButton b9 =new JButton("9");
        JButton b10 =new JButton("+");
        JButton b11 =new JButton("-");
        JButton b12 =new JButton("/");
        JButton b13 =new JButton("*");
        JButton b14 =new JButton("=");
        JButton b15 =new JButton("(");
        JButton b16 =new JButton(")");
        JButton b17 =new JButton("%");
        JButton b18 =new JButton("AC");
        JButton b19 =new JButton("0");
        JButton b20 =new JButton(".");


        JPanel panel = new JPanel();

        panel.add(b15);
        panel.add(b16);
        panel.add(b17);
        panel.add(b18);
        panel.add(b1);
        panel.add(b2);
        panel.add(b3);
        panel.add(b11);
        panel.add(b4);
        panel.add(b5);
        panel.add(b6);
        panel.add(b13);
        panel.add(b7);
        panel.add(b8);
        panel.add(b9);
        panel.add(b12);
        panel.add(b19);
        panel.add(b20);
        panel.add(b14);
        panel.add(b10);
        panel.setLayout(new GridLayout(5,4));
        panel.setBackground(Color.lightGray);
        panel.setSize(250,250);
        
        
        frame.add(t, BorderLayout.NORTH);
        frame.add(panel, BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(300,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}