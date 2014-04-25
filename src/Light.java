/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pieter.mels
 */
public class Light {
    
    private String plaats;
    
    public Light(String plaats) {
        this.plaats = plaats;
    }
    
    public void on() {
        System.out.println(plaats + "verlichting is aan");
    }
    
    public void off() {
        System.out.println(plaats + "verlichting is uit");
    }
    
}
