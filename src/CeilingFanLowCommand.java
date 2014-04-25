/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pieter.mels
 */
public class CeilingFanLowCommand {
    
    CeilingFan ceilingfan;
    int prevSpeed;
    
    public CeilingFanLowCommand(CeilingFan ceilingfan) {
        this.ceilingfan = ceilingfan;
    }
    
    public void execute() {
        prevSpeed = ceilingfan.getSpeed();
        ceilingfan.low();
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
