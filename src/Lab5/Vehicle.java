package Lab5;

public abstract class Vehicle {
    private int speed;
    private String brand;

    public Vehicle() {
        this.speed = 0;
        this.brand = "Volvo"
    }

    public abstract void speedUp();
    public abstract void brandName();

    public int getSpeed() {
        return speed;
    }
    public int getBrand() {
        return brand;
    }

    protected void setSpeed(int speed) {
        this.speed = speed;
    }

    protected void setBrand(String brand) {
        this.brand = brand;
    }
}