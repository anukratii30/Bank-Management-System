package bank.management.system.Login;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener {
    
    JButton login, signup, clear;
    JTextField cardT;
    JPasswordField pinT;

    Login() {
        setTitle("AUTOMATED TELLER MACHINE");
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(70, 20, 100, 100);
        add(label);
        
        JLabel text = new JLabel("Welcome to ATM");
        text.setFont(new Font("Osward", Font.BOLD, 38));
        text.setBounds(200, 40, 400, 40);
        add(text);
        
        JLabel Cardno = new JLabel("Card No");
        Cardno.setFont(new Font("Raleway", Font.BOLD, 28));
        Cardno.setBounds(120, 150, 150, 40);
        add(Cardno);
        
        cardT = new JTextField();
        cardT.setBounds(300, 150, 230, 30);
        cardT.setFont(new Font("Arial", Font.BOLD, 28));
        add(cardT);
        
        JLabel PIN = new JLabel("PIN");
        PIN.setFont(new Font("Raleway", Font.BOLD, 28));
        PIN.setBounds(120, 220, 250, 30);
        add(PIN);
        
        pinT = new JPasswordField();
        pinT.setBounds(300, 220, 230, 30);
        pinT.setFont(new Font("Arial", Font.BOLD, 14));
        add(pinT);
        
        login = new JButton("SIGN IN");
        login.setBounds(300, 300, 100, 30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        add(login);
        
        clear = new JButton("CLEAR");
        clear.setBounds(430, 300, 100, 30);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);
        clear.addActionListener(this);
        add(clear);
        
        signup = new JButton("SIGN UP");
        signup.setBounds(300, 350, 230, 30);
        signup.setBackground(Color.BLACK);
        signup.setForeground(Color.WHITE);
        signup.addActionListener(this);
        add(signup);
        
        getContentPane().setBackground(Color.white);
        setSize(960, 560);
        setVisible(true);
        setLocation(350, 200);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == clear) {
            cardT.setText("");
            pinT.setText("");
        } else if (ae.getSource() == login) {
            Conn conn = new Conn();
            String cardnumber = cardT.getText();
            String pinnumber = pinT.getText();
            String query = "SELECT * FROM login1 WHERE cardnumber = '" + cardnumber + "' AND pinnumber = '" + pinnumber + "'";

            try {
                ResultSet rs = conn.s.executeQuery(query);
                if (rs.next()) {
                    setVisible(false);
                    new Transaction(pinnumber).setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Incorrect card or pin number");
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        } else if (ae.getSource() == signup) {
            setVisible(false);
            new SignUpone().setVisible(true);
        }
    }

    public static void main(String[] args) {
        new Login();
    }
}

