package bank.management.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup  extends JFrame implements ActionListener {
    JRadioButton r1,r2,r3,m1,m2,m3;
    JButton next;
    JTextField textName,textFname,textEmail,textAdd,textCity,textPin,textstate;
    JDateChooser dateChooser;

    Random ran=new Random();
    long First4 =(ran.nextLong() % 9000l)+1000l;
    String first=""+Math.abs(First4);

    Signup(){
        super("APPLICATION FORM");
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2=i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(25,10,100,100);
        add(image);

        JLabel label1=new JLabel("APPLICATION FORM NO."+first);
        label1.setBounds(160,20,600,40);
        label1.setFont(new Font("Raleway",Font.BOLD,38));
        add(label1);

        JLabel label2=new JLabel("Page 1");
        label2.setFont(new Font("Raleway",Font.BOLD,22));
        label2.setBounds(375,70,600,30);
        add(label2);

        JLabel label3=new JLabel("Personal Details");
        label3.setFont(new Font("Raleway",Font.BOLD,22));
        label3.setBounds(330,90,600,30);
        add(label3);

        JLabel labelName=new JLabel("Name :");
        labelName.setFont(new Font("Raleway",Font.BOLD,20));
        labelName.setBounds(100,160,100,30);
        add(labelName);

        textName=new JTextField();
        textName.setFont(new Font("Raleway",Font.BOLD,14));
        textName.setBounds(300,160,400,30);
        add(textName);

        JLabel labelfName=new JLabel("Father's Name :");
        labelfName.setFont(new Font("Raleway",Font.BOLD,20));
        labelfName.setBounds(100,210,200,30);
        add(labelfName);

        textFname=new JTextField();
        textFname.setFont(new Font("Raleway",Font.BOLD,14));
        textFname.setBounds(300,210,400,30);
        add(textFname);

        JLabel DOB=new JLabel("Date Of Birth :");
        DOB.setFont(new Font("Raleway",Font.BOLD,20));
        DOB.setBounds(100,310,200,30);
        add(DOB);

        dateChooser=new JDateChooser();
        dateChooser.setForeground(new Color(105,105,105));
        dateChooser.setBounds(300,310,400,30);
        add(dateChooser);

        JLabel labelG=new JLabel("Gender");
        labelG.setFont(new Font("Raleway",Font.BOLD,20));
        labelG.setBounds(100,260,200,30);
        add(labelG);

        r1=new JRadioButton("Male");
        r1.setFont(new Font("Raleway",Font.BOLD,14));
        r1.setBackground(new Color(222,255,228));
        r1.setBounds(300,260,60,30);
        add(r1);

        r2=new JRadioButton("Female");
        r2.setFont(new Font("Raleway",Font.BOLD,14));
        r2.setBackground(new Color(222,255,228));
        r2.setBounds(450,260,90,30);
        add(r2);

        r3=new JRadioButton("Other");
        r3.setFont(new Font("Raleway",Font.BOLD,14));
        r3.setBackground(new Color(222,255,228));
        r3.setBounds(635,260,120,30);
        add(r3);

        ButtonGroup buttonGroup=new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);
        buttonGroup.add(r3);

        JLabel labelEmail=new JLabel("Email Address:");
        labelEmail.setFont(new Font("Raleway",Font.BOLD,20));
        labelEmail.setBounds(100,355,200,30);
        add(labelEmail);

        textEmail=new JTextField();
        textEmail.setFont(new Font("Raleway",Font.BOLD,14));
        textEmail.setBounds(300,355,400,30);
        add(textEmail);

        JLabel labelMs=new JLabel("Marital Status:");
        labelMs.setFont(new Font("Raleway",Font.BOLD,20));
        labelMs.setBounds(100,400,200,30);
        add(labelMs);

        m1=new JRadioButton("Married");
        m1.setFont(new Font("Raleway",Font.BOLD,14));
        m1.setBackground(new Color(222,255,228));
        m1.setBounds(300,400,100,30);
        add(m1);

        m2=new JRadioButton("Unmarried");
        m2.setFont(new Font("Raleway",Font.BOLD,14));
        m2.setBackground(new Color(222,255,228));
        m2.setBounds(450,400,100,30);
        add(m2);

        m3=new JRadioButton("Other");
        m3.setFont(new Font("Raleway",Font.BOLD,14));
        m3.setBackground(new Color(222,255,228));
        m3.setBounds(635,400,100,30);
        add(m3);

        ButtonGroup buttonGroup1=new ButtonGroup();
        buttonGroup1.add(m1);
        buttonGroup1.add(m2);
        buttonGroup1.add(m3);

        JLabel labelAdd=new JLabel("Address :");
        labelAdd.setFont(new Font("Raleway",Font.BOLD,20));
        labelAdd.setBounds(100,450,200,30);
        add(labelAdd);

        textAdd=new JTextField();
        textAdd.setFont(new Font("Raleway",Font.BOLD,14));
        textAdd.setBounds(300,450,400,30);
        add(textAdd);

        JLabel labelCity=new JLabel("City :");
        labelCity.setFont(new Font("Raleway",Font.BOLD,20));
        labelCity.setBounds(100,500,200,30);
        add(labelCity);


        textCity=new JTextField();
        textCity.setFont(new Font("Raleway",Font.BOLD,14));
        textCity.setBounds(300,500,400,30);
        add(textCity);

        JLabel labelPin=new JLabel("Pin Code :");
        labelPin.setFont(new Font("Raleway",Font.BOLD,20));
        labelPin.setBounds(100,550,200,30);
        add(labelPin);


        textPin=new JTextField();
        textPin.setFont(new Font("Raleway",Font.BOLD,14));
        textPin.setBounds(300,550,400,30);
        add(textPin);

        JLabel labelstate=new JLabel("State :");
        labelstate.setFont(new Font("Raleway",Font.BOLD,20));
        labelstate.setBounds(100,600,200,30);
        add(labelstate);


        textstate=new JTextField();
        textstate.setFont(new Font("Raleway",Font.BOLD,14));
        textstate.setBounds(300,600,400,30);
        add(textstate);

        next=new JButton("Next");
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(620,650,80,30);
        next.addActionListener(this);
        add(next);


        getContentPane().setBackground(new Color(222,255,228));
        setLayout(null);
        setSize(850,850);
        setLocation(300,5);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
      String formno=first;
      String name=textName.getText();
      String fname=textFname.getText();
      String dob=((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
      String gender=null;
      if(r1.isSelected()){
          gender="Male";
      } else if (r2.isSelected()) {
          gender="Female";
      }else if (r3.isSelected()) {
          gender = "Others";
      }
      String email=textEmail.getText();
      String marital=null;
      if (m1.isSelected()){
          marital="Married";
      } else if (m2.isSelected()) {
          marital="Unmarried";
      } else if (m3.isSelected()) {
          marital="Other";
      }
        String address=textAdd.getText();
        String city=textCity.getText();
        String pincode=textPin.getText();
        String state=textstate.getText();

        try{
            if (textName.getText().equals("")){
                JOptionPane.showMessageDialog(null,"FILL all the field");
            }else{
                Conn conn1=new Conn();
                String q="insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+pincode+"','"+state+"')";
                conn1.statement.executeUpdate(q);
                new Signup2(first);
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
