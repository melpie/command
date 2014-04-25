/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pieter.mels
 */
public class RemoteLoader {
    
    public static void main(String[] args) {
        
        RemoteControl remoteControl = new RemoteControl();
        
        Light livingRoomLight = new Light("Woonkamer");
        Light kitchenLight = new Light("Keuken");
        CeilingFan ceilingFan = new CeilingFan("Woonkamer");
        Stereo stereo = new Stereo("Woonkamer");
        
        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);
        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);
        CeilingFanHighCommand ceilingFanHigh = new CeilingFanHighCommand(ceilingFan);
        CeilingFanMediumCommand ceilingFanMedium = new CeilingFanMediumCommand(ceilingFan);
        StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);
        
        remoteControl.setCommand(0,livingRoomLightOn,livingRoomLightOff);
        remoteControl.setCommand(1,kitchenLightOn,kitchenLightOff);
        remoteControl.setCommand(2,ceilingFanHigh,ceilingFanOff);
        remoteControl.setCommand(3,ceilingFanMedium,ceilingFanOff);
        remoteControl.setCommand(4,stereoOnWithCD,stereoOff);
        
        System.out.println(remoteControl);

        remoteControl.onButtonWaspushed(0);
        remoteControl.offButtonWaspushed(0);
        remoteControl.undoButtonWasPushed();
        remoteControl.onButtonWaspushed(1);
        remoteControl.offButtonWaspushed(1);
        remoteControl.undoButtonWasPushed();
        remoteControl.onButtonWaspushed(2);
        remoteControl.offButtonWaspushed(2);
        remoteControl.undoButtonWasPushed();
        remoteControl.onButtonWaspushed(3);
        remoteControl.offButtonWaspushed(3);
        remoteControl.undoButtonWasPushed();
        remoteControl.onButtonWaspushed(4);
        remoteControl.offButtonWaspushed(4);
        remoteControl.undoButtonWasPushed();
        remoteControl.onButtonWaspushed(5);
        remoteControl.offButtonWaspushed(5);
        remoteControl.undoButtonWasPushed();
        remoteControl.onButtonWaspushed(6);
        remoteControl.offButtonWaspushed(6);
        remoteControl.undoButtonWasPushed();
        
    }
    
}
