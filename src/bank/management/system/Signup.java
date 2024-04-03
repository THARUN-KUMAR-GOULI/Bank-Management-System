package bank.management.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup  extends JFrame implements ActionListener {

    JRadioButton r1, r2, r3, M1, M2, M3;
    JButton next;
    JDateChooser dateChooser;
    JTextField textName, textFname, textEmail, textAdd, textcity, textPin, textState, textCountry;
    Random ran = new Random();
    long first4 = (ran.nextLong() % 9000L) +1000L;

    String first = " " + Math.abs(first4);

    Signup(){
        super("Application Form");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25, 10, 100, 100);
        add(image);

        JLabel label1 = new JLabel("APPLICATION FORM NO: " + first);
        label1.setBounds(160, 20, 600, 40);
        label1.setFont(new Font("Raleway", Font.BOLD, 38));
        add(label1);

        JLabel label2 = new JLabel("Page No:1 ");
        label2.setFont(new Font("Raleway", Font.BOLD, 22));
        label2.setBounds(330, 70, 600, 30);
        add(label2);

        JLabel label3 = new JLabel("Personal Details");
        label3.setFont(new Font("Raleway", Font.BOLD,22));
        label3.setBounds(300, 100, 600, 30);
        add(label3);

        JLabel labelName = new JLabel("Name : ");
        labelName.setFont(new Font("Roleway", Font.BOLD,20));
        labelName.setBounds(100,190,100,30);
        add(labelName);


        textName = new JTextField();
        textName.setFont(new Font("Roleway", Font.BOLD,14));
        textName.setBounds(300,190,400,30);
        add(textName);

        JLabel labelfName = new JLabel("Father`s Name : ");
        labelfName.setFont(new Font("Roleway", Font.BOLD,20));
        labelfName.setBounds(100,240,200,30);
        add(labelfName);


        textFname = new JTextField();
        textFname.setFont(new Font("Roleway", Font.BOLD,14));
        textFname.setBounds(300,240,400,30);
        add(textFname);


        JLabel DOB = new JLabel("Date Of Birth: ");
        DOB.setFont(new Font("Roleway", Font.BOLD, 20));
        DOB.setBounds(100, 340,200,30);
        add(DOB);

        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(105, 105, 105));
        dateChooser.setBounds(300,340,300,30);
        add(dateChooser);


        JLabel labelG = new JLabel("Gender ");
        labelG.setFont(new Font("Roleway", Font.BOLD, 20));
        labelG.setBounds(100,290,200,30);
        add(labelG);


        r1 = new JRadioButton("Male");
        r1.setFont(new Font("Roleway", Font.BOLD,14));
        r1.setBounds(300,290,60,30);
        r1.setBackground(new Color(222,255,228));
        add(r1);

        r2 = new JRadioButton("Female");
        r2.setFont(new Font("Roleway", Font.BOLD,14));
        r2.setBounds(450,290,90,30);
        r2.setBackground(new Color(222,255,228));
        add(r2);

        r3 = new JRadioButton("Other");
        r3.setFont(new Font("Roleway", Font.BOLD,14));
        r3.setBounds(600,290,120,30);
        r3.setBackground(new Color(222,255,228));
        add(r3);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);
        buttonGroup.add(r3);

        JLabel labelEmail = new JLabel("Email: ");
        labelEmail.setFont(new Font("Roleway", Font.BOLD, 20));
        labelEmail.setBounds(100,390,200,30);
        add(labelEmail);

        textEmail = new JTextField();
        textEmail.setFont(new Font("Roleway", Font.BOLD,14));
        textEmail.setBounds(300,390,400,30);
        add(textEmail);

        JLabel labelmarry = new JLabel("Marital Status : ");
        labelmarry.setFont(new Font("Roleway", Font.BOLD, 20));
        labelmarry.setBounds(100,440,200,30);
        add(labelmarry);

        M1 = new JRadioButton("Single");
        M1.setFont(new Font("Raleway", Font.BOLD, 14));
        M1.setBackground(new Color(222,255,228));
        M1.setBounds(300, 440, 150, 30);
        add(M1);

        M2 = new JRadioButton("Married");
        M2.setFont(new Font("Raleway", Font.BOLD, 14));
        M2.setBackground(new Color(222,255,228));
        M2.setBounds(450, 440, 150, 30);
        add(M2);

        M3 = new JRadioButton("Other");
        M3.setFont(new Font("Raleway", Font.BOLD, 14));
        M3.setBackground(new Color(222,255,228));
        M3.setBounds(600, 440, 150, 30);
        add(M3);

        ButtonGroup ms = new ButtonGroup();
        ms.add(M1);
        ms.add(M2);
        ms.add(M3);


        JLabel labeladd = new JLabel("Address : ");
        labeladd.setFont(new Font("Roleway", Font.BOLD, 20));
        labeladd.setBounds(100,490,200,30);
        add(labeladd);

        textAdd = new JTextField();
        textAdd.setFont(new Font("Roleway", Font.BOLD,14));
        textAdd.setBounds(300,490,400,30);
        add(textAdd);

        JLabel labelCity = new JLabel("City : ");
        labelCity.setFont(new Font("Roleway", Font.BOLD, 20));
        labelCity.setBounds(100,540,200,30);
        add(labelCity);

        textcity = new JTextField();
        textcity.setFont(new Font("Roleway", Font.BOLD,14));
        textcity.setBounds(300,540,400,30);
        add(textcity);

        JLabel labelpin = new JLabel("Pin Code :");
        labelpin.setFont(new Font("Roleway", Font.BOLD, 20));
        labelpin.setBounds(100, 590, 200, 30);
        add(labelpin);

        textPin = new JTextField();
        textPin.setFont(new Font("Roleway", Font.BOLD,14));
        textPin.setBounds(300,590,200,30);
        add(textPin);

        JLabel labelState = new JLabel("State :");
        labelState.setFont(new Font("Roleway", Font.BOLD, 20));
        labelState.setBounds(100, 640, 200, 30);
        add(labelState);

        textState = new JTextField();
        textState.setFont(new Font("Roleway", Font.BOLD,14));
        textState.setBounds(300,640,200,30);
        add(textState);

        JLabel labelCountry = new JLabel("Country :");
        labelCountry.setFont(new Font("Roleway", Font.BOLD, 20));
        labelCountry.setBounds(100, 690, 200, 30);
        add(labelCountry);

        textCountry = new JTextField();
        textCountry.setFont(new Font("Roleway", Font.BOLD,14));
        textCountry.setBounds(300,690,200,30);
        add(textCountry);


        next = new JButton("Next");
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(520, 750, 80, 30);
        next.addActionListener(this);
        add(next);


        getContentPane().setBackground(new Color(222, 255, 228));
        setLayout(null);
        setSize(850,850);
        setLocation(360,10);
        setVisible(true);
//        setUndecorated(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String formno = first;
        String name = textName.getText();
        String fname = textFname.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(r1.isSelected()){
            gender = "Male";
        } else if (r2.isSelected()) {
            gender = "Female";
        }

        String email = textEmail.getText();
        String martial = null;

        if(M1.isSelected()){
            martial = "Married";
        } else if(M2.isSelected()){
            martial = "Unmarried";
        } else if (M3.isSelected()) {
            martial = "Other";
        }

        String address = textAdd.getText();
        String city = textcity.getText();
        String pincode = textPin.getText();
        String state = textState.getText();
        String country = textCountry.getText();


        try {
            if(textName.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Fill all the fields");
            }else {
                Conn con1 = new Conn();
                String q = "insert into signup values('"+formno+"', '"+name+"', '"+fname+"', '"+dob+"', '"+gender+"','"+email+"','"+martial+"','"+address+"', '"+city+"','"+pincode+"','"+state+"','"+country+"')";
                con1.stmt.executeUpdate(q);
                new Signup2(formno);
                setVisible(false);
            }

        }catch(Exception E){
            E.printStackTrace();
        }

    }

    public static void main(String[] args) {

        new Signup();
    }
}
