package bank.management.system.Login;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;
import java.text.SimpleDateFormat;


public class SignUpone extends JFrame implements ActionListener {
    
    long random;
    JTextField nameT, fnameT, emailT, addT, cityT, sT, pinT;
    JButton next;
    JRadioButton male, female, other, ma, unma;
    JDateChooser datechooser;

    SignUpone() {
        setLayout(null);

        Random ran = new Random();
        random = Math.abs((ran.nextLong() % 900L) + 1000L);

        JLabel formno = new JLabel("APPLICATION FORM No. " + random);
        formno.setFont(new Font("Raleway", Font.BOLD, 38));
        formno.setBounds(140, 20, 600, 40);
        add(formno);
                
        JLabel personDetails = new JLabel("Page 1: Personal Details");
        personDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        personDetails.setBounds(290, 80, 400, 30);
        add(personDetails);
                
        JLabel name = new JLabel("Name:");
        name.setFont(new Font("Raleway", Font.BOLD, 20));
        name.setBounds(100, 140, 100, 30);
        add(name);
         
        nameT = new JTextField();
        nameT.setFont(new Font("Raleway", Font.BOLD, 14));
        nameT.setBounds(300, 140, 400, 30);
        add(nameT);
         
        JLabel fname = new JLabel("Father's Name:");
        fname.setFont(new Font("Raleway", Font.BOLD, 20));
        fname.setBounds(100, 190, 200, 30);
        add(fname);
         
        fnameT = new JTextField();
        fnameT.setFont(new Font("Raleway", Font.BOLD, 14));
        fnameT.setBounds(300, 190, 400, 30);
        add(fnameT);
         
        JLabel dob = new JLabel("Date Of Birth:");
        dob.setFont(new Font("Raleway", Font.BOLD, 20));
        dob.setBounds(100, 240, 200, 30);
        add(dob);
         
        datechooser = new JDateChooser();
        datechooser.setBounds(300, 240, 400, 30);
        datechooser.setForeground(new Color(105, 105, 105));
        add(datechooser);
                
        JLabel gender = new JLabel("Gender:");
        gender.setFont(new Font("Raleway", Font.BOLD, 20));
        gender.setBounds(100, 290, 200, 30);
        add(gender);
         
        male = new JRadioButton("Male");
        male.setBounds(300, 290, 60, 30);
        add(male);
         
        female = new JRadioButton("Female");
        female.setBounds(450, 290, 120, 30);
        add(female);
         
        ButtonGroup gendergroup = new ButtonGroup();
        gendergroup.add(male);
        gendergroup.add(female);
         
        JLabel email = new JLabel("Email Address:");
        email.setFont(new Font("Raleway", Font.BOLD, 20));
        email.setBounds(100, 340, 200, 30);
        add(email);
         
        emailT = new JTextField();
        emailT.setFont(new Font("Raleway", Font.BOLD, 14));
        emailT.setBounds(300, 340, 400, 30);
        add(emailT);
         
        JLabel marital_status = new JLabel("Marital Status:");
        marital_status.setFont(new Font("Raleway", Font.BOLD, 20));
        marital_status.setBounds(100, 390, 200, 30);
        add(marital_status);
         
        ma = new JRadioButton("Married");
        ma.setBounds(300, 390, 100, 30);
        add(ma);
         
        unma = new JRadioButton("Unmarried");
        unma.setBounds(450, 390, 100, 30);
        add(unma);
         
        other = new JRadioButton("Other");
        other.setBounds(630, 390, 100, 30);
        add(other);
         
        ButtonGroup maritalgroup = new ButtonGroup();
        maritalgroup.add(ma);
        maritalgroup.add(unma);
        maritalgroup.add(other);
         
        JLabel add = new JLabel("Address:");
        add.setFont(new Font("Raleway", Font.BOLD, 20));
        add.setBounds(100, 440, 200, 30);
        add(add);
         
        addT = new JTextField();
        addT.setFont(new Font("Raleway", Font.BOLD, 14));
        addT.setBounds(300, 440, 400, 30);
        add(addT);
         
        JLabel city = new JLabel("City:");
        city.setFont(new Font("Raleway", Font.BOLD, 20));
        city.setBounds(100, 490, 200, 30);
        add(city);
         
        cityT = new JTextField();
        cityT.setFont(new Font("Raleway", Font.BOLD, 14));
        cityT.setBounds(300, 490, 400, 30);
        add(cityT);
         
        JLabel State = new JLabel("State:");
        State.setFont(new Font("Raleway", Font.BOLD, 20));
        State.setBounds(100, 530, 200, 30);
        add(State);
         
        sT = new JTextField();
        sT.setFont(new Font("Raleway", Font.BOLD, 14));
        sT.setBounds(300, 530, 400, 30);
        add(sT);
                
        JLabel pin = new JLabel("Pin Code:");
        pin.setFont(new Font("Raleway", Font.BOLD, 20));
        pin.setBounds(100, 570, 200, 30);
        add(pin);
         
        pinT = new JTextField();
        pinT.setFont(new Font("Raleway", Font.BOLD, 14));
        pinT.setBounds(300, 570, 400, 30);
        add(pinT);
         
        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBounds(620, 660, 80, 30);
        next.addActionListener(this);
        add(next);
                
        getContentPane().setBackground(Color.WHITE);
        
        setSize(850, 800);
        setLocation(350, 10);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        String formno = "" + random;
        String name = nameT.getText();
        String fname = fnameT.getText();
        
        
        //String dob = ((JTextField) datechooser.getDateEditor().getUiComponent()).getText();
        String dob = "";
        Date dobDate = datechooser.getDate();

        if (dobDate != null) {
           SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
              dob = sdf.format(dobDate);  // Format date as YYYY-MM-DD
}
        String gender = null;
        if(male.isSelected()) {
            gender = "Male";
        } else if(female.isSelected()) {
            gender = "Female";
        }
        String email = emailT.getText();
        String marital_status = null;
        if(ma.isSelected()) {
            marital_status = "Married";
        } else if(unma.isSelected()) {
            marital_status = "Unmarried";
        } else if(other.isSelected()) {
            marital_status = "Other";
        }
        String address = addT.getText();
        String city = cityT.getText();
        String state = sT.getText();
        String pin = pinT.getText();
        
        try {
            if(name.equals("")) {
                JOptionPane.showMessageDialog(null, "Name is required");
            } else {
                Conn c = new Conn();
                String query = "INSERT INTO signup (formno, name, father_name, dob, gender, email, marital_status, address, city, pin, state) " +
               "VALUES ('" + formno + "','" + name + "','" + fname + "','" + dob + "','" + gender + "','" + email + "','" + marital_status + "','" + address + "','" + city + "','" + pin + "','" + state + "')";
                c.s.executeUpdate(query);
                
                setVisible(false);
                new SignUptwo(formno).setVisible(true);

            }
        } catch(Exception e) {
            System.out.println(e);
        }
    }
    
    public static void main(String args[]) {
        new SignUpone();
    }
}
