import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainMenu extends JFrame{
    MainMenu(){


        JLabel imageLabel = new JLabel();
        ImageIcon dragonImage = new ImageIcon("tenor.gif");
        imageLabel.setIcon(dragonImage);

        JButton start = new JButton();
        start.setText("Start Game");
        start.setFont(new Font("Calibri" , Font.BOLD , 25));
        EventHandler handler = new EventHandler();
        start.addActionListener(handler);
    

        this.add(imageLabel);
        this.add(start);

        this.setLayout(new FlowLayout());
        this.setTitle("Snake Game");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(250,500);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setResizable(false);
        this.getContentPane().setBackground(Color.ORANGE);

    }
    private class EventHandler implements ActionListener{

        public void actionPerformed(ActionEvent event){
        new ColorMenu();
        dispose();
        }
    }
}
