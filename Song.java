/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject11;

/**
 *
 * @author DELL
 */
public class Song {

private String Title ;
private String Singer ;
private String Album ;
private int Time ; 

public Song( String t,String s,String Al,int T){
    Title=t;
    Singer=s;
    Album=Al;
    Time=0;
}



public String getTitle(){
return Title ;
}
public String getSinger(){
return Singer;
}
public String getAlbum (){
return Album;
}
public int getTime (){
return Time;
}

    
}
