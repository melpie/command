/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pieter.mels
 */
public class NoCommand implements Command {
    
    public NoCommand() {}
    
    public void execute() {
        System.out.println("Ik doe niets.");
    }
    
    public void undo() {
        System.out.println("Ik doe niets.");
    }
    
}
