/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pieter.mels
 */
public class CeilingFanHighCommand implements Command {
    
    CeilingFan ceilingfan;
    int prevSpeed;
    
    public CeilingFanHighCommand(CeilingFan ceilingfan) {
        this.ceilingfan = ceilingfan;
    }
    
    public void execute() {
        prevSpeed = ceilingfan.getSpeed();
        ceilingfan.high();
    }
    
    public void undo() {
        if (prevSpeed == CeilingFan.HIGH) {
            ceilingfan.high();
        } else if (prevSpeed == CeilingFan.MEDIUM) {
            ceilingfan.medium();
        } else if (prevSpeed == CeilingFan.LOW) {
            ceilingfan.low();
        } else if (prevSpeed == CeilingFan.OFF) {
            ceilingfan.off();
        }        
    }
    
}
