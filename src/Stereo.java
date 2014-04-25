/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pieter.mels
 */
public class Stereo {
    
    private String plaats;
    
    public Stereo(String plaats) {
        this.plaats = plaats;
    }
    
    public void on() {
        System.out.println(plaats + "stereo is aan");
    }
    
    public void setCd() {
        System.out.println(plaats + "stereo is ingesteld voor CD input");
    }
    
    public void setDvd() {
        System.out.println(plaats + "stereo is ingesteld voor DVD input");
    }
    
    public void setRadio() {
        System.out.println(plaats + "stereo is ingesteld voor Radio input");
    }
    
    public void setVolume(int volume) {
        System.out.println(plaats + "stereo volume ingesteld op " + volume);
    }
    
    public void off() {
        System.out.println(plaats + "stereo is uit");
    }
    
}
