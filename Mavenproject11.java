/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject11;

/**
 *
 * @author DELL
 */
import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
public class Mavenproject11 {

    public static void main(String[] args) throws IOException, UnsupportedAudioFileException, LineUnavailableException {
      MusicPlayerProject m1=new MusicPlayerProject();
      m1.setSize(500, 500);
      m1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      m1.setVisible(true);
      
    }
}
