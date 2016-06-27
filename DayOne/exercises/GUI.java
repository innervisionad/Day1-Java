package exercises;

import java.awt.*;
import javax.swing.*;


public class GUI {
    //GUI components
    JFrame mainFrame;
    JPanel panel;
    JButton btnValidate;
    JTextArea usernameText;

    boolean result;

    public GUI()
    {
        mainFrame = new JFrame("Username Validation");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(400,100);
        mainFrame.setResizable(false);
        mainFrame.setLayout(new FlowLayout());
        mainFrame.setLocationRelativeTo(null);

        panel = new JPanel();
        panel.setSize(400,100);

        usernameText = new JTextArea("", 1, 16);

        btnValidate = new JButton("Validate");
        btnValidate.addActionListener( event -> {
            result = checkRegularExpression(usernameText.getText());
            if (result) JOptionPane.showMessageDialog(null, "Your username met the requirements!");
            else JOptionPane.showMessageDialog(null, "Your username did not meet the requirements!");
        } );

        mainFrame.add(panel);
        panel.add(usernameText, BorderLayout.WEST);
        panel.add(btnValidate, BorderLayout.EAST);

        mainFrame.setVisible(true);
    }

    public static boolean check(String username)
    {
        int length = 0;
        int letters = 0;
        int digits = 0;
        int symbols = 0;
        int spaces = 0;

        for (char ch : username.toCharArray()) {
            if (Character.isLetter(ch)) {
                letters++;
            } else if (Character.isDigit(ch)) {
                digits++;
            } else if (ch == '@' || ch == '#' || ch == '*' || ch == '=') {
                symbols++;
            } else if (Character.isSpaceChar(ch)) {
                spaces++;
            }
            length++;
        }

        if ((length >= 5 && length <= 10) && letters > 0 && digits > 0
                && symbols > 0 && spaces == 0) {
            return true;
        }
        return false;
    }

    public static boolean checkRegularExpression(String password)
    {
        String pattern = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}";
        return password.matches(pattern);

        /**
         (?=.*[0-9])       # a digit must occur at least once
         (?=.*[a-z])       # a lower case letter must occur at least once
         (?=.*[A-Z])       # an upper case letter must occur at least once
         (?=.*[@#$%^&+=])  # a special character must occur at least once
         (?=\S+$)          # no whitespace allowed in the entire string
         .{8,}             # anything, at least eight places though
        */
    }

    public static void main(String[] args)
    {
        new GUI();
    }

}
