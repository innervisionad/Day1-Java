package dayOne;

import java.awt.*;
import javax.swing.*;
/**
 * Created by student on 27-Jun-16.
 */
public class ValidatePassword {

    JFrame mainFrame;
    JPanel panel;
    JButton btnValidate;
    JTextArea passwordTxt;

    boolean result;

    public ValidatePassword() {
        mainFrame = new JFrame("Password validation");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(400,100);
        mainFrame.setResizable(false);
        mainFrame.setLayout(new FlowLayout());
        mainFrame.setLocationRelativeTo(null);

        panel = new JPanel();
        panel.setSize(400,100);

        //add components to panel
        passwordTxt = new JTextArea("",1,15);
        panel.add(passwordTxt, BorderLayout.WEST);

        btnValidate = new JButton("Validate");
        btnValidate.addActionListener(event -> {
            result = validate(passwordTxt.getText());
            if(result) JOptionPane.showMessageDialog(null, "Your password meets the requirements");
            else JOptionPane.showMessageDialog(null, "Your password does not meet the requirements");
        });

        panel.add(btnValidate, BorderLayout.EAST);
        mainFrame.add(panel);
        mainFrame.setVisible(true);



       // btnValidate = new JButton("Validate");
       // btnValidate.addActionListener(new ActionListener(){
       //      @Override
       //     public void actionPerformed(ActionEvent e) {
       //
       //     }
       // });

    }

    static boolean validate(String password){

        boolean hasNumber = false;
        boolean hasLower = false;
        boolean hasUpper = false;
        boolean passLength;

        for(char c : password.toCharArray()){
            if(Character.isDigit(c)){
                hasNumber = true;
            }
            if(Character.isLowerCase(c)){
                hasLower = true;
            }
            if(Character.isUpperCase(c)){
                hasUpper = true;
            }

        }
         passLength = (password.length() > 8);
        return hasNumber == true && hasLower == true && hasUpper == true && passLength == true;
        }



    public static void main(String [] args){
        new ValidatePassword();
    }
}
