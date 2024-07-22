

package bank.management.system.Login;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;


public class SignUptwo extends JFrame implements ActionListener {
    
   
    JTextField panT , adharT;
    JButton next;
    JRadioButton syes , sno , eyes , eno;
    
    JComboBox religion , category,income, Occupation, education;
    String formno;

    SignUptwo(String formno) {
        this.formno=formno;
        setLayout(null);

        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE2");
       
        JLabel additionalDetails = new JLabel("Page 2: Additional Details");
        additionalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        additionalDetails.setBounds(290, 80, 400, 30);
        add(additionalDetails);
                
        JLabel name = new JLabel("Religion:");
        name.setFont(new Font("Raleway", Font.BOLD, 20));
        name.setBounds(100, 140, 100, 30);
        add(name);
        String valReligion[] ={"Hindu","Muslim","Sikh","Christiana","Other" };
         religion = new JComboBox(valReligion);
         religion.setBounds(300, 140, 400, 30);
         religion.setBackground(Color.WHITE);
        add(religion);
        
         
        JLabel fname = new JLabel("Category:");
        fname.setFont(new Font("Raleway", Font.BOLD, 20));
        fname.setBounds(100, 190, 200, 30);
        add(fname);
         
        String valCategory[]={"General","OBC","SC","ST","OTHER"};
         category = new JComboBox(valCategory);
        category.setBounds(300, 190, 400, 30);
        category.setBackground(Color.WHITE);
        add(category);
         
        JLabel dob = new JLabel("Income:");
        dob.setFont(new Font("Raleway", Font.BOLD, 20));
        dob.setBounds(100, 240, 200, 30);
        add(dob);
        
        String incomeCategory[]={"null","<1,50,000","<2,50,000","<5,00,000","upto 10,00,000"};
         income = new JComboBox(incomeCategory);
        income.setBounds(300, 240, 400, 30);
        income.setBackground(Color.WHITE);
        add(income);
        
        
        JLabel gender = new JLabel("Educational:");
        gender.setFont(new Font("Raleway", Font.BOLD, 20));
        gender.setBounds(100, 290, 200, 30);
        add(gender);
         
        
        JLabel email = new JLabel("Qualification:");
        email.setFont(new Font("Raleway", Font.BOLD, 20));
        email.setBounds(100, 315, 200, 30);
        add(email);
         
          String educationValues[]={"Non-graduation","Graduate","Post-Graduate","Doctorate","Other"};
         education= new JComboBox(educationValues);
        education.setBounds(300, 315, 400, 30);
        education.setBackground(Color.WHITE);
        add(education);
        
        
        
         
        JLabel marital_status = new JLabel("Occupation:");
        marital_status.setFont(new Font("Raleway", Font.BOLD, 20));
        marital_status.setBounds(100, 390, 200, 30);
        add(marital_status);
        
         String OccupationalValues[]={"Salaried","Self-Employed","Bussiness","Student","Retired","Other"};
        Occupation= new JComboBox(OccupationalValues);
        Occupation.setBounds(300, 390, 400, 30);
        Occupation.setBackground(Color.WHITE);
        add(Occupation);
         
     
         
        JLabel pan = new JLabel("Pan No:");
        pan.setFont(new Font("Raleway", Font.BOLD, 20));
        pan.setBounds(100, 440, 200, 30);
        add(pan);
         
        panT = new JTextField();
        panT.setFont(new Font("Raleway", Font.BOLD, 14));
        panT.setBounds(300, 440, 400, 30);
        add(panT);
         
        JLabel adhar = new JLabel("Adhaar NO:");
        adhar.setFont(new Font("Raleway", Font.BOLD, 20));
        adhar.setBounds(100, 490, 200, 30);
        add(adhar);
         
        adharT = new JTextField();
        adharT.setFont(new Font("Raleway", Font.BOLD, 14));
        adharT.setBounds(300, 490, 400, 30);
        add(adharT);
         
        JLabel State = new JLabel("Senior Citizen:");
        State.setFont(new Font("Raleway", Font.BOLD, 20));
        State.setBounds(100, 540, 200, 30);
        add(State);
         
        syes = new JRadioButton("yes");
        syes.setBounds(300, 540, 100, 30);
        add(syes);
         
       sno = new JRadioButton("No");
        sno.setBounds(450, 540, 100, 30);
        add(sno);
         
       
         
        ButtonGroup Senior = new ButtonGroup();
       Senior.add(syes);
        Senior.add(sno);
       
                
        JLabel Exist = new JLabel("Existing Account:");
        Exist.setFont(new Font("Raleway", Font.BOLD, 20));
        Exist.setBounds(100, 590, 200, 30);
        add(Exist);
         
          eyes = new JRadioButton("yes");
        eyes.setBounds(300, 590, 100, 30);
        add(eyes);
         
       eno = new JRadioButton("No");
        eno.setBounds(450, 590, 100, 30);
        add(eno);
         
       
         
        ButtonGroup Existgroup = new ButtonGroup();
        Existgroup.add(eyes);
        Existgroup.add(eno);
       
         
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
        
        
        String sreligion = (String)religion.getSelectedItem();// type cast due to it givees in object form
        
         String scategory = (String)category.getSelectedItem();
        
          String sincome = (String)income.getSelectedItem();
          
           String seducation = (String)education.getSelectedItem();
           
            String soccupation = (String)Occupation.getSelectedItem();
        
        
        String seniorcitizen = null;
        if (syes.isSelected()) {
           seniorcitizen="Yes";
        }else if(eno.isSelected()) {
            seniorcitizen = "No";
        }
        
        String existingaccount = null;
        if(eyes.isSelected()) {
            existingaccount= "Yes";
        } else if(eno.isSelected()) {
           existingaccount = "No";
        }
        
        String span = panT.getText();
        String sadhar = adharT.getText();
        
        try {
           
                Conn c = new Conn();
                String query = "INSERT INTO signuptwo (formno, religion, category, income, education, occupation, pan, aadhar, seniorcitizen, existingaccount) " +
               "VALUES ('" + formno + "','" + sreligion + "','" + scategory + "','" + sincome + "','" + seducation + "','" + soccupation + "','" + span + "','" + sadhar + "','" + seniorcitizen + "','" + existingaccount + "')";

                c.s.executeUpdate(query);

                //Signup3 object
                setVisible(false);
                new SignupThree(formno).setVisible(true);
        } catch(Exception e) {
            System.out.println(e);
        }
    }
    
    public static void main(String args[]) {
        new SignUptwo("");
    }
}
