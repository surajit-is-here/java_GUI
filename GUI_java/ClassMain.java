import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClassMain extends JFrame implements ActionListener {
    JButton  b1= new JButton("1.Click to run swing program");
    JButton b2 =  new JButton("2.Click here to run Stack program");
    JButton b3 = new JButton("3.Click  here to run 3D cube");
    JButton b4 = new JButton("4.Click here to merge sort program");
    JButton b5 = new JButton("5.Click here to multiply complex matrix");
    JButton b6 = new JButton("6.Click here to change background & reset");
    JButton b7 = new JButton("7.Click here to open Button click counting program");
    JButton b8 = new JButton("8.Click here to calculate (p1/q1)+(p2/q2)");
    JPanel p = new JPanel();
    @Override

    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1)
        {
            b1.setText("Button 1 clicked");
            prog1 p1 = new prog1();
            p1.go();
            b2.setText("2.Click here to run Stack program");
            b3.setText("3.Click  here to run 3D cube");
            b4.setText("4.Click here to merge sort program");
            b5.setText("5.Click here to multiply complex matrix");
            b7.setText("7.Click here to open Button click counting program");
            b8.setText("8.Click here to calculate (p1/q1)+(p2/q2)");
        }
        else if(e.getSource()==b2)
        {
            b2.setText("Button 2 clicked");
            prog2 p2 =  new prog2();
            p2.go();
            b3.setText("3.Click  here to run 3D cube");
            b4.setText("4.Click here to merge sort program");
            b5.setText("5.Click here to multiply complex matrix");
            b7.setText("7.Click here to open Button click counting program");
            b8.setText("8.Click here to calculate (p1/q1)+(p2/q2)");
            b1.setText("1.Click to run swing program");
        }
        else if(e.getSource()==b3)
        {
            b3.setText("Button 3 clicked");
            prog3 p3 = new prog3();
            p3.go();
            b4.setText("4.Click here to merge sort program");
            b5.setText("5.Click here to multiply complex matrix");
            b7.setText("7.Click here to open Button click counting program");
            b8.setText("8.Click here to calculate (p1/q1)+(p2/q2)");
            b1.setText("1.Click to run swing program");
            b2.setText("2.Click here to run Stack program");
        }
        else if(e.getSource()==b4)
        {
            b4.setText("Button 4 clicked");
            prog4 p4= new prog4();
            p4.go();
            b5.setText("5.Click here to multiply complex matrix");
            b7.setText("7.Click here to open Button click counting program");
            b8.setText("8.Click here to calculate (p1/q1)+(p2/q2)");
            b1.setText("1.Click to run swing program");
            b2.setText("2.Click here to run Stack program");
            b3.setText("3.Click  here to run 3D cube");
        }
        else if(e.getSource() ==b5)
        {
            b5.setText("Button 5 clicked");
            prog5 p5 = new prog5();
            p5.go();
            b7.setText("7.Click here to open Button click counting program");
            b8.setText("8.Click here to calculate (p1/q1)+(p2/q2)");
            b1.setText("1.Click to run swing program");
            b2.setText("2.Click here to run Stack program");
            b3.setText("3.Click  here to run 3D cube");
            b4.setText("4.Click here to merge sort program");
        }
        else if(e.getSource()==b7)
        {
            b7.setText("Button 7 clicked");
            new prog6("Button Counting");
            b8.setText("8.Click here to calculate (p1/q1)+(p2/q2)");
            b1.setText("1.Click to run swing program");
            b2.setText("2.Click here to run Stack program");
            b3.setText("3.Click  here to run 3D cube");
            b4.setText("4.Click here to merge sort program");
            b5.setText("5.Click here to multiply complex matrix");
        }
        else if(e.getSource()==b8)
            {
                b8.setText("Button 8 clicked");
                prog7 p7= new prog7();
                p7.go();
                b1.setText("1.Click to run swing program");
                b2.setText("2.Click here to run Stack program");
                b3.setText("3.Click  here to run 3D cube");
                b4.setText("4.Click here to merge sort program");
                b5.setText("5.Click here to multiply complex matrix");
                b7.setText("7.Click here to open Button click counting program");
            }
        else
        {
            p.setBackground(Color.CYAN);
            b1.setText("1.Click to run swing program");
            b2.setText("2.Click here to run Stack program");
            b3.setText("3.Click  here to run 3D cube");
            b4.setText("4.Click here to merge sort program");
            b5.setText("5.Click here to multiply complex matrix");
            b7.setText("7.Click here to open Button click counting program");
            b8.setText("8.Click here to calculate (p1/q1)+(p2/q2)");
        }
    }

    public ClassMain()
    {
        p.add(BorderLayout.CENTER,b1);
        p.add(BorderLayout.AFTER_LAST_LINE,b2);
        p.add(BorderLayout.AFTER_LAST_LINE,b3);
        p.add(BorderLayout.AFTER_LAST_LINE,b4);
        p.add(BorderLayout.AFTER_LAST_LINE,b5);
        p.add(BorderLayout.AFTER_LAST_LINE,b6);
        p.add(BorderLayout.AFTER_LAST_LINE,b7);
        p.add(BorderLayout.AFTER_LAST_LINE,b8);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);

        getContentPane().add(p);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(150,150,400,500);
    }
}
