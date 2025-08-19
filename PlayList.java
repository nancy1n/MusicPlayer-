/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject11;

/**
 *
 * @author DELL
 */
public class PlayList {
    private String Name;
    private Song[] songs; 
    private int arraysize;
    private int size;

    public PlayList(String Name, int arraysize) {
        this.Name = Name;
        this.arraysize = arraysize;
        songs = new Song[arraysize];
        size = 0;
    }

    public String getName() {
        return Name;
    }

    public void addSong(Song song) {
        if (size < arraysize) {
            songs[size++] = song;
            System.out.println("New Song " + song.getTitle() + " "+ Name + " ");
        }
         else {
            System.out.println("Playlist is full");
        }
    }
    

    public int getSize() {
        return size;
    }

}
