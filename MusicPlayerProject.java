/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject11;

/**
 *
 * @author DELL
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;


public class MusicPlayerProject extends JFrame  implements ActionListener{
    JButton b1,b2,b3,b4,b5,b6;
    JLabel l1,l2,l3;
    JPanel p1,p2,base,p3,p4;
  
 MusicControls c;
    
    public MusicPlayerProject() throws IOException, UnsupportedAudioFileException, LineUnavailableException{
        base=new JPanel();
        base.setLayout(new BoxLayout(base,BoxLayout.PAGE_AXIS));
        b1=new JButton("PLay");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.PINK);
        b1.addActionListener(this);
        
         b2=new JButton("Pause");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.PINK);
        b2.addActionListener(this);
        
         b3=new JButton("Skip");
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.PINK);
        b3.addActionListener(this);
        
         b4=new JButton("Shuffle");
        b4.setBackground(Color.BLACK);
        b4.setForeground(Color.PINK);
        b4.addActionListener(this);
        p1=new JPanel();
        p1.setPreferredSize(new Dimension(100,200));
        p1.setLayout(new FlowLayout(FlowLayout.CENTER));
        p1.add(b1);
        p1.add(b2);
         p1.add(b3);
          p1.add(b4);
          base.add(p1);
          
          
          p2=new JPanel();
          p2.setPreferredSize(new Dimension(100,200));
          p2.setLayout(new FlowLayout(FlowLayout.LEFT));
          b5=new JButton("V.UP");
          b5.setBackground(Color.white);
          b5.setForeground(Color.PINK);
          b5.addActionListener(this);
          
          b6=new JButton("V.DOWN");
          b6.setBackground(Color.white);
          b6.setForeground(Color.PINK);
          p2.add(b5);
          p2.add(b6);
          base.add(p2);
           b6.addActionListener(this);
          p3=new JPanel();
          p3.setPreferredSize( new Dimension(100,200));
         l1=new JLabel("Artist_name");
         l2=new JLabel("Song_name");
         p3.add(l1);
         p3.add(l2);
         base.add(p3);
          this.add(base);
    c=new MusicControls(3);
      
  File file1 = new File("C:\\Users\\DELL\\Downloads\\music\\Apocalyptic Echoes - Jimena Contreras.wav");
        File file2 = new File("C:\\Users\\DELL\\Downloads\\music\\Espeluznante - Luna Cantina.wav");
        File file3 = new File("C:\\Users\\DELL\\Downloads\\music\\Masquerade - Luna Cantina.wav"); 

 
        File[] files={file1,file2,file3};
 c.loadPlaylist(files);
        
      
      
       
        p4=new JPanel();
      l3=new JLabel();
      ImageIcon image=new ImageIcon("C:\\Users\\DELL\\Downloads\\Retro.jfif");
     
      l3.setIcon(image);
      p4.add(l3);
     
      base.add(p4,BorderLayout.WEST);
     
        
        
    }
     

    @Override
    public void actionPerformed(ActionEvent e) {
        
    if(e.getSource()==b1){
        Song  s=new Song( "Apcalyptic Echoes"," Jieman contreras"," freefall",2 );
        
        String title = s.getTitle();
        String singer = s.getSinger();
   
      l1.setText("Singer"+" "+singer);

      l2.setText(" Song"+" "+title);
       
            c.play();
        }
      

    else if (e.getSource() == b2) {
            c.pause();
            
        } else if (e.getSource() == b5) {
            
            
            c.volumeUp();
            
        } else if (e.getSource() == b6) {
            c.volumeDown();
        }
        else if(e.getSource()==b3){
           c.skipSong() ;
        }
        else if(e.getSource()==b4)
        {
            
        }
    }
    }
   
    
    

