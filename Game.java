import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent; 
import java.awt.event.MouseAdapter;

class Game extends JFrame{

    ImageIcon image_rock, image_scissor, image_paper;
    public void setup(){
       image_rock= new ImageIcon(new ImageIcon("rock.png").getImage().getScaledInstance(80, 80, Image.SCALE_DEFAULT));

       image_scissor= new ImageIcon(new ImageIcon("scissor.png").getImage().getScaledInstance(80, 80, Image.SCALE_DEFAULT));
       
       image_paper= new ImageIcon(new ImageIcon("paper.png").getImage().getScaledInstance(80, 80, Image.SCALE_DEFAULT));

       JLabel label_rock = new JLabel();
       label_rock.setText("Rock");
       label_rock.setIcon(image_rock);
       label_rock.setHorizontalTextPosition(JLabel.CENTER);
       label_rock.setVerticalTextPosition(JLabel.BOTTOM);
       label_rock.setBounds(150,300,100,100);

       JLabel label_scissor = new JLabel();
       label_scissor.setText("Scissor");
       label_scissor.setIcon(image_scissor);
       label_scissor.setHorizontalTextPosition(JLabel.CENTER);
       label_scissor.setVerticalTextPosition(JLabel.BOTTOM);
       label_scissor.setBounds(250,300,100,100);

       JLabel label_paper = new JLabel();
       label_paper.setText("Paper");
       label_paper.setIcon(image_paper);
       label_paper.setHorizontalTextPosition(JLabel.CENTER);
       label_paper.setVerticalTextPosition(JLabel.BOTTOM);
       label_paper.setBounds(350,300,100,100);


       add(label_paper);
       add(label_rock);
       add(label_scissor);
       setLayout(null);
    }


public static void main(String[] args){
    Game g =new Game();
    g.setTitle("ROCK, PAPER, SCISSOR");
    g.setBounds(200,200,600,600);
    g.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    g.getContentPane().setBackground(Color.WHITE);
    g.setup();
    g.setResizable(true);
    g.setVisible(true);


   }
}


