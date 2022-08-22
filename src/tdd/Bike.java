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
           accelerate();
       }
    }

    private void accelerate(){
        if(gear == 3) increaseSpeedOnGearThree();
        if(gear == 2) {
            speed += 2;
            if(speed >= 31){
                gear++;
            }
        }
        if(gear == 1) increaseSpeedOnGearOne();
    }

    private void increaseSpeedOnGearThree() {
        speed += 3;
    }

    private void increaseSpeedOnGearOne(){
        speed++;
        if(speed > 20) gear++;
    }
}
