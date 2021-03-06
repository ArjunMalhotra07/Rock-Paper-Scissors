import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.plaf.ComponentInputMapUIResource;

import java.awt.Font;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent; 
import java.awt.event.MouseAdapter;


// this is our stone paper scissors game
class Game extends JFrame{

    JLabel result, computerChoice, compScore, playerScore, x;
    int comp_Score=0; int player_Score=0;


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
        
       computerChoice = new JLabel();
       computerChoice.setHorizontalTextPosition(JLabel.CENTER);
       computerChoice.setVerticalTextPosition(JLabel.BOTTOM);
       computerChoice.setBounds(250,90,100,100);

       result= new JLabel();
       result.setFont(new Font("Serif",Font.ITALIC,20));
       result.setBounds(250,450,100,100);

       JLabel score= new JLabel("SCORE");
       score.setBounds(500,0,100,100);

       compScore= new JLabel();
       compScore.setText( "Computer:0");
       compScore.setBounds(500,15,100,100);

       playerScore=new JLabel();
       playerScore.setText("Player:0");
       playerScore.setBounds(500,30,100,100);

       x=new JLabel();
       x.setText("Let's see ur Stone, Paper, Scissor Skills");
       x.setBounds(150,50,400,400);
        
       

       // Adding Mouse Listener to frames
       label_rock.addMouseListener(new MouseAdapter(){
           public void mouseClicked(MouseEvent e)
           {calculate(label_rock.getText());}
       });

       label_paper.addMouseListener(new MouseAdapter(){
        public void mouseClicked(MouseEvent e)
        {calculate(label_paper.getText());}
    });


    label_scissor.addMouseListener(new MouseAdapter(){
        public void mouseClicked(MouseEvent e)
        {calculate(label_scissor.getText());}
    });

       //Adding Components in Frame
       add(label_paper);
       add(label_rock);
       add(label_scissor);
       add(computerChoice);
       add(result);
       add(score);
       add(compScore);
       add(playerScore);
       add(x);
       setLayout(null);
    }

public void calculate(String player){
     String[] list={"Rock","Paper","Scissor"};
     int rndm= (int)((Math.random()*10)%3);
     String comp=list[rndm];
     computerChoice.setText(comp); 

     if(rndm==0){
         computerChoice.setIcon(image_rock); 
     }
     else if(rndm==1){
        computerChoice.setIcon(image_paper); 
     }
     else{
     computerChoice.setIcon(image_scissor); 
    }

    String res="";
    if(player.equals(comp)){
        res="DRAW";
    }
    else if(player.equals("Rock")){
        if(comp.equals("Paper")){
            res="You Lose!";
            comp_Score++;
        }
        else{
            res="You Win";
            player_Score++;
        }

    }
    else if(player.equals("Paper")){
        if(comp.equals("Scissor")){
            res="You Lose!";
            comp_Score++;
        }
        else{
            res="You Win";
            player_Score++;
        }

    }
    else if (player.equals("Scissor")){
        if(comp.equals("Rock")){
            res="You Lose!";
            comp_Score++;
        }
        else{
            res="You Win";
            player_Score++;
        }

    }
    result.setText(res);
    playerScore.setText("Player:"+player_Score);
    compScore.setText(("Computer:"+comp_Score));
}
public static void main(String[] args){
    Game g =new Game();

    //Creating Frame
    g.setTitle("ROCK, PAPER, SCISSOR");
    g.setBounds(200,200,600,600);
    g.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    g.getContentPane().setBackground(Color.WHITE);
    g.setup();
    g.setResizable(true);
    g.setVisible(true);

//hello
   }
}


