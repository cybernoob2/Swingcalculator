import java.awt.*;
import javax.swing.*;

class test{
   public static void main(String[] args){
      JFrame frame = new JFrame("Tip Calculator");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(350,200);

      JPanel panel = new JPanel();
      panel.setLayout(new GridLayout(3,2,10,10));
      panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

      JLabel l1 = new JLabel("Bill:");
      JLabel l2 = new JLabel("suggested tip:");
      JTextField t1 = new JTextField();
      JTextField t2 = new JTextField();

      panel.add(l1);
      panel.add(t1);
      panel.add(l2);
      panel.add(t2);
      frame.add(panel);
      frame.setVisible(true);
   }
 }

