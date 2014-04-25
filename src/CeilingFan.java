/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pieter.mels
 */
public class CeilingFan {
    
    private String plaats;
    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    int speed;
    
    public CeilingFan(String plaats) {
        this.plaats = plaats;
        speed = OFF;
    }
    
    public void high() {
        speed = HIGH;
        System.out.println(plaats + " plafondventilator is aan hoog");
    }
    
    public void medium() {
        speed = MEDIUM;
        System.out.println(plaats + " plafondventilator is aan medium");
    }
    
    public void low() {
        speed = LOW;
        System.out.println(plaats + " plafondventilator is aan laag");
    }
    
    public void off() {
        speed = OFF;
        System.out.println(plaats + " plafondventilator is uit");
    }
    
    public int getSpeed() {
        return speed;
    }
    
}
