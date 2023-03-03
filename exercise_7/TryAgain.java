import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TryAgain extends JFrame {
    TryAgain(){


        JButton exit = new JButton();
        exit.setFont(new Font("Calibri" , Font.BOLD , 25));
        ExitHandler handler = new ExitHandler();
        exit.addActionListener(handler);
        
        JButton Tryagain = new JButton();
        Tryagain.setFont(new Font("calibri" , Font.BOLD , 25));
        EventHandler handlerr = new EventHandler();
        Tryagain.addActionListener(handlerr);

        exit.setText("Exit Game");
       Tryagain.setText("Play Again");

        this.add(Tryagain);
        this.add(exit);

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
            new MainMenu();
            dispose();
        }
    }

    private class ExitHandler implements ActionListener{

        public void actionPerformed(ActionEvent event){
        
        dispose();
        }
    }
}
