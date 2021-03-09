package Praktik;

public class TVku {
    int channel;
    int volumeLevel;
    boolean on;
    
    
    public TVku(){
        channel = 1;
        volumeLevel = 1;
        on = false;
    }
    
    public void turnOn(){
        on = true;
    }
    
    public void turnOff(){
        on = false;
    }
    
    public void setChannel(int newChannel){
        if (channel <=120 && channel >= 1) {
            channel = newChannel;
        }
        else {
            System.out.println(" ERROR ");
        }
    }
    
    public void setVolume(int newVolumeLevel){
        volumeLevel = newVolumeLevel;
    }
    
    public void channelUp(){
        channel++;
    }
    
    public void channelDown(){
        channel--;
    }
    
    public void volumeUp(){
        volumeLevel++;
    }
    
     public void volumeDown(){
        volumeLevel--;
    }

  
}
