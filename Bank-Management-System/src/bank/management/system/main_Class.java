package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class main_Class extends JFrame implements ActionListener{
    JButton b1,b2,b3,b4,b5,b6,b7;
    String pin;
    main_Class(String pin){
        this.pin=pin;


        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1350,700,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0,0,1050,690);
        add(l3);

        JLabel label1 = new JLabel("Please Select Your Transaction");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("System", Font.BOLD, 18));
        label1.setBounds(260,130,400,35);
        l3.add(label1);

        b1 = new JButton("DEPOSIT");
        b1.setForeground(Color.WHITE);
        b1.setBackground(new Color(65,125,128));
        b1.setBounds(205,223,145,30);
        b1.addActionListener(this);
        l3.add(b1);

        b2 = new JButton("CASH WITHDRAWAL");
        b2.setForeground(Color.WHITE);
        b2.setBackground(new Color(65,125,128));
        b2.setBounds(447,223,145,30);
        b2.setFont(new Font("Arial", Font.BOLD, 11)); // ↓↓↓ Small text size
        b2.addActionListener(this);
        l3.add(b2);


        b3 = new JButton("FAST CASH");
        b3.setForeground(Color.WHITE);
        b3.setBackground(new Color(65,125,128));
        b3.setBounds(205,263,145,30);
        b3.addActionListener(this);
        l3.add(b3);

        b4 = new JButton("MINI STATEMENT");
        b4.setForeground(Color.WHITE);
        b4.setBackground(new Color(65,125,128));
        b4.setBounds(447,263,145,30);
        b4.addActionListener(this);
        l3.add(b4);

        b5 = new JButton("PIN CHANGE");
        b5.setForeground(Color.WHITE);
        b5.setBackground(new Color(65,125,128));
        b5.setBounds(205,303,145,30);
        b5.addActionListener(this);
        l3.add(b5);

        b6 = new JButton("BALANCE ENQUIRY");
        b6.setForeground(Color.WHITE);
        b6.setBackground(new Color(65,125,128));
        b6.setBounds(447,303,145,30);
        b6.addActionListener(this);
        l3.add(b6);

        b7 = new JButton("EXIT");
        b7.setForeground(Color.WHITE);
        b7.setBackground(new Color(65,125,128));
        b7.setBounds(447,343,145,30);
        b7.addActionListener(this);
        l3.add(b7);



        setLayout(null);
        setSize(950,750);
        setLocation(275,5);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==b1){
            new Deposit(pin);
            setVisible(false);
        } else if(e.getSource()==b7) {
            System.exit(0);
        } else if(e.getSource()==b2) {
            new Withdrawal(pin);
            setVisible(false);
        } else if (e.getSource()==b6) {
            new BalanceEnquiry(pin);
            setVisible(false);
        }else if(e.getSource()==b3){
            new FastCash(pin);
            setVisible(false);
        } else if (e.getSource()==b5) {
            new Pin(pin);
            setVisible(false);
        } else if (e.getSource()==b4) {
            new mini(pin);

        }
    }

    public static void main(String[] args) {
        new main_Class("");
    }
}

