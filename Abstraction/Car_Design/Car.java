package Abstraction.Car_Design;

public class Car {

    private void move_Break_Pads() {

    }
    private void change_Piston_Speed() {

    }
    private void create_spark() {

    }

    public void turn_on_car() {
        create_spark();
    }
    public void accelerate() {
        change_Piston_Speed();
    }
    public void brake() {
        move_Break_Pads();
    }

}
