package tdd;

public class Bike {
    private boolean isOn;
    private int speed;

    private int gear = 0;
    public void turnOn() {
        if(!isOn){
            isOn = true;
        }
        gear = 1;
        speed = 0;
    }
    public boolean isOn() {
        return isOn;
    }
    public void turnOff() {
        isOn = false;
        gear = 0;
    }
    public int getSpeed() {
        return speed;
    }
    public int getGear() {
        return gear;
    }
    public void increaseSpeed() {
        if(isOn){
            if(gear == 2){
                speed += 2;
            }
            if(gear == 1){
                speed++;
                if(speed > 20){
                    gear++;
                }
            }
        }
    }
}
