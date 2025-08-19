/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject11;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;


/**
 *
 * @author DELL
 */
public class MusicControls {
    private File[] playlist;
    Clip c1;
    int index;
    FloatControl Volume;
    
    public  MusicControls (int size){
        playlist=new File[size];
        index=0;
        c1=null;
        Volume=null;
    }
    public void pause(){
        if(c1!=null && c1.isRunning()){
            c1.stop();
        }
    }
    
  public void play() {
        if (c1 != null && !c1.isRunning()) {
            c1.start();
     
        }
    }
      
  
  public void volumeUp(){
    if(Volume !=null){
          float CurrentVolume=Volume.getValue();
          
          float Maxvalue= Volume.getMaximum();
          float Minvalue=Volume.getMinimum();
          float vRange=(Maxvalue-Minvalue)/10;
          float newVolume=Math.min(CurrentVolume+vRange, Maxvalue);
          
Volume.setValue(newVolume);

      
       System.out.print("vUo"+" "+ newVolume);
      }
  }
  
  
  
 public void volumeDown(){
     if(Volume !=null){
          float CurrentVolume=Volume.getValue();
          float Minvalue= Volume.getMinimum();
          float Maxvalue=Volume.getMaximum();
   float vRange=(Maxvalue-Minvalue)/10;
   float newVolume=Math.max(CurrentVolume-vRange, Minvalue);
          
Volume.setValue(newVolume);
     
     System.out.print("vdown"+" "+newVolume);
 }
 }
     
   

   public void skipSong()  {
        
if (index < playlist.length - 1) {
            index++;
             play();
        } else {
            System.out.println("No more songs in the playlist.");
        }
        System.out.println("skipSong executed.");
    }
   
   public void loadPlaylist(File [] songFiles) {
        for (int i = 0; i < songFiles.length; i++) {
            playlist[i] = songFiles[i];
        }
        index = 0; 
        if (playlist.length > 0) {
            try {
                loadSong(playlist[index]);
            } catch (IOException | LineUnavailableException | UnsupportedAudioFileException e) {
            }
        }
    }

   public void loadSong(File songFile) throws IOException, UnsupportedAudioFileException, LineUnavailableException {
        if (c1 != null && c1.isOpen()) {
            c1.close();
        }

        AudioInputStream audioStream = AudioSystem.getAudioInputStream(songFile);
        AudioFormat format = audioStream.getFormat();
        DataLine.Info info = new DataLine.Info(Clip.class, format);
        c1 = (Clip) AudioSystem.getLine(info);
        c1.open(audioStream);
        Volume = (FloatControl) c1.getControl(FloatControl.Type.MASTER_GAIN);

        System.out.println("Loaded song name: " + songFile.getName());
    }

}

              
         
         
    

