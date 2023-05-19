import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class prog6 extends JFrame{
    private static String lableprefix="number of button clicks";
    private int numclicks=0;
    JLabel lable = new JLabel(lableprefix+ "0 ");
    public prog6(String title)
    {
        super(title);
        JButton button =new JButton("click here");
        button.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        lable.setText(lableprefix+ " : "+ ++numclicks);
                    }
                }
        );
        JPanel panel = new JPanel();
        panel.add(button);
        panel.add(lable);
        setSize(300,400);
        getContentPane().add(panel);
        setVisible(true);
    }
}
