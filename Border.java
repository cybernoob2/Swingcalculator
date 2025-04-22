import java.awt.BorderLayout;
import javax.swing.*;

public class Border {
    public static void main (String[] args){
        JFrame frame = new JFrame("Border Layout");
        JButton l1 = new JButton("North");
        JButton l2 = new JButton("South");
        JButton l3 = new JButton("East");
        JButton l4 = new JButton("West");
        JButton l5 = new JButton("Centre");

        frame.add(l1, BorderLayout.NORTH);
        frame.add(l2, BorderLayout.SOUTH);
        frame.add(l3, BorderLayout.EAST);
        frame.add(l4, BorderLayout.WEST);
        frame.add(l5, BorderLayout.CENTER);
        frame.setSize(300,200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
