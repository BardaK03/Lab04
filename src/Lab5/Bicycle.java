package Lab5;
public class Bicycle extends Vehicle {
    @Override
    public void speedUp() {
        int currentSpeed = getSpeed();
        setSpeed(currentSpeed + 5);
        System.out.println("Bicycle: Speed increased by 5. Current speed: " + getSpeed());
    }
}