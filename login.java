import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Login extends JFrame implements ActionListener {

    JLabel l1, l2;
    JTextField tf1;
    JPasswordField pf;
    JButton b1, b2;

    Login() {
        setTitle("Login Form");
        setVisible(true);
        setSize(400, 300);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        l1 = new JLabel("Username:");
        l1.setBounds(50, 50, 100, 30);
        add(l1);

        tf1 = new JTextField();
        tf1.setBounds(150, 50, 150, 30);
        add(tf1);

        l2 = new JLabel("Password:");
        l2.setBounds(50, 100, 100, 30);
        add(l2);

        pf = new JPasswordField();
        pf.setBounds(150, 100, 150, 30);
        add(pf);

        b1 = new JButton("Login");
        b1.setBounds(50, 150, 100, 30);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("Cancel");
        b2.setBounds(200, 150, 100, 30);
        b2.addActionListener(this);
       add(b2); 
    }

    public void actionPerformed(ActionEvent e) {
       if (e.getSource() == b1) {
            String username = tf1.getText();
            String password = pf.getText();

            if (username.equals("admin") && password.equals("admin123")) {
                JOptionPane.showMessageDialog(this,"Login Successful!");
            } else {
                JOptionPane.showMessageDialog(this,"Invalid Username or Password!");
            }
        } else if (e.getSource() == b2) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new Login();
    }
}