import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class prog1 extends JFrame implements ActionListener {
    JFrame f;
    JButton label_button;
    JButton color_button;
    JLabel label;


    public void go() {
        f = new JFrame("Color Change");
        f.setSize(700, 400);
        color_button = new JButton("click here to change color");
        label_button = new JButton("Click here to change label");
        label = new JLabel("I am just a label");
        f.getContentPane().add(BorderLayout.WEST, label);
        f.getContentPane().add(BorderLayout.SOUTH, color_button);
        color_button.addActionListener(this);
        f.getContentPane().add(BorderLayout.EAST, label_button);
        label_button.addActionListener(this);
        paint p = new paint();
        f.getContentPane().add(BorderLayout.CENTER, p);
        f.setVisible(true);
        //f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == color_button)
            f.repaint();
        else
            label.setText("That hurts");
    }

    public class paint extends JPanel {
        public void paintComponent(Graphics g) {
            Graphics2D g2d = (Graphics2D) g;
            int red = (int) (Math.random() * 256);
            int blue = (int) (Math.random() * 256);
            int green = (int) (Math.random() * 256);
            int yellow = (int) (Math.random() * 256);
            Color start = new Color(red, blue, green, yellow);
            red = (int) (Math.random() * 256);
            blue = (int) (Math.random() * 256);
            green = (int) (Math.random() * 256);
            yellow = (int) (Math.random() * 256);
            Color end = new Color(red, blue, green, yellow);
            GradientPaint gradient = new GradientPaint(140, 140, start, 340, 340, end);
            g2d.setPaint(gradient);
            g2d.fillOval(140, 100, 100, 100);
        }
    }
}

