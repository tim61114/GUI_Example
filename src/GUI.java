import com.sun.tools.javac.Main;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI {

    private JPanel MainPanel;
    private JButton loginButton;
    private JButton createNewAccountButton;
    private JPasswordField passwordPasswordField;
    private JTextField usernameTextField;
    private JLabel loginError;

    public GUI() {
        loginButton.addActionListener(e -> JOptionPane.showMessageDialog(null,"Hello, " + usernameTextField.getText()));
        createNewAccountButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(usernameTextField.getText().isEmpty()){
                    loginError.setVisible(true);
                }
                else {
                    JOptionPane.showMessageDialog(null, "Hello, new user " + usernameTextField.getText());
                    loginError.setVisible(false);
                }
            }
        });
    }

    public static void main(String args[]){
        JFrame frame = new JFrame("APP");
        frame.setContentPane(new GUI().MainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);// Adds Button to content pane of frame
    }


}
