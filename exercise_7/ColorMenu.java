import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import java.awt.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;


public class ColorMenu extends JFrame {

     private String [] colorNameArray = {"GRAY", "LIGHT_GRAY", "WHITE", "BLACK"};
     private Color [] colorListArray = {Color.GRAY, Color.LIGHT_GRAY, Color.WHITE, Color.BLACK};

     JList colorList;

     ColorMenu(){
 
         
         JLabel label = new JLabel();
         label.setText("Choose your color: ");
         label.setFont(new Font("Calibri", Font.BOLD, 25));
         this.add(label);
 
        
         colorList = new JList(colorNameArray);
         colorList.setFont(new Font("Calibri", Font.BOLD, 25));
         
         colorList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
         EventHandler handler = new EventHandler();
         colorList.addListSelectionListener(handler);
       
         this.add(colorList);
    
         this.setLayout(new FlowLayout());         
         this.setTitle("Snake Game");        
         this.setDefaultCloseOperation(EXIT_ON_CLOSE);         
         this.setSize(250, 500);    
         this.setLocationRelativeTo(null);      
         this.setVisible(true);
         this.setResizable(false);
         this.getContentPane().setBackground(Color.MAGENTA);
     }
     
     private class EventHandler implements ListSelectionListener{
 
         public void valueChanged(ListSelectionEvent event){
             GamePanel gp = new GamePanel();
             gp.gameBGColor = colorListArray[colorList.getSelectedIndex()];
 
             new GameFrame();
          
             dispose();
         }
     }
 
 }
