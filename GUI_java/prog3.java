import javax.swing.*;
import java.awt.*;

public class prog3 extends JPanel{
        public void paintComponent(Graphics g)
        {
            g.setColor(Color.RED);
            int []x={100,160,180,120};
            int []y={100,100,80,80};
            int n=4;
            g.fillPolygon(x,y,n);
            int []x1={160,160,180,180};
            int []y1={100,160,140,80};
            g.fillPolygon(x1,y1,n);
            int []x2={100,160,160,100};
            int []y2={100,100,160,160};
            g.fillPolygon(x2,y2,n);
            g.setColor(Color.BLACK);
            g.drawPolygon(x,y,n);
            g.drawPolygon(x1,y1,n);
            g.drawPolygon(x2,y2,n);
            g.setColor(Color.LIGHT_GRAY);
            int []x3={101,161,142,80};
            int []y3={160,161,180,180};
            g.fillPolygon(x3,y3,n);
        }

    void go() {
        prog3  m = new prog3();
        JLabel l= new JLabel("The light source is behind");
        JFrame  f  =  new JFrame();
        f.getContentPane().add(BorderLayout.CENTER,l);
        f.setSize(500,600);
        f.setVisible(true);
        f.add(m);
    }
}
