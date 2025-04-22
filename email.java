import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class email{
    public static void main(String[] args) {
        // Create the main frame
        JFrame frame = new JFrame("Login Form");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350, 200);
        frame.setLayout(new BorderLayout());

        // Create a panel to hold the form elements
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2, 10, 10)); // rows, cols, hgap, vgap
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20)); // padding

        // Username
        JLabel userLabel = new JLabel("Username:");
        JTextField userField = new JTextField();

        // Password
        JLabel passLabel = new JLabel("Password:");
        JPasswordField passField = new JPasswordField();

        // Login Button
        JButton loginButton = new JButton("Login");

        // Add components to panel
        panel.add(userLabel);
        panel.add(userField);
        panel.add(passLabel);
        panel.add(passField);
        panel.add(new JLabel()); // empty cell
        panel.add(loginButton);

        // Add panel to frame
        frame.add(panel, BorderLayout.CENTER);

        // Make frame visible
        frame.setVisible(true);

        // Action listener for the login button
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = userField.getText();
                String password = new String(passField.getPassword()); // Get password safely

                // You can add validation here
                System.out.println("Username: " + username);
                System.out.println("Password: " + password);
            }
        });
    }
}