import java.awt.*;
import java.awt.event.*;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
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
        panel.setSize(25,20);
        
        ActionListener numberListener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String currentText = t.getText(); // get what's already in the field
                JButton clickedButton = (JButton) e.getSource(); // get the button that was clicked
                String buttonText = clickedButton.getText(); // get its label (e.g. "3")
                t.setText(currentText + buttonText); // append it to the text field
            }
        };

        
        b1.addActionListener(numberListener);
        b2.addActionListener(numberListener);
        b3.addActionListener(numberListener);
        b4.addActionListener(numberListener);
        b5.addActionListener(numberListener);
        b6.addActionListener(numberListener);
        b7.addActionListener(numberListener);
        b8.addActionListener(numberListener);
        b9.addActionListener(numberListener);
        b10.addActionListener(numberListener);
        b11.addActionListener(numberListener);
        b12.addActionListener(numberListener);
        b13.addActionListener(numberListener);
        b15.addActionListener(numberListener);
        b16.addActionListener(numberListener);
        b17.addActionListener(numberListener);
        b18.addActionListener(numberListener);
        b19.addActionListener(numberListener);
        b20.addActionListener(numberListener);
        
        b14.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    // Create the engine
                    ScriptEngineManager mgr = new ScriptEngineManager();
                    ScriptEngine engine = mgr.getEngineByName("JavaScript");

                    // Get the expression
                    String expression = t.getText();

                    // Evaluate it
                    Object result = engine.eval(expression);

                    // Show result
                    t.setText(result.toString());
                } catch (Exception ex) {}
            }
    });

        
        
        frame.add(t, BorderLayout.NORTH);
        frame.add(panel, BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(300,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}