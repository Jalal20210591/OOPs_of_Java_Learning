class TestCar {
    public static void main(String[] args) {
        
        Car auto = new Car();
        Car cng = new Car();
        Car micro = new Car();
        Car truck = new Car();

        auto.car_name = "Auto"; auto.number_of_door = 4;
        cng.car_name = "CNG"; cng.brand = "NEW";
        micro.car_name = "Private Car"; micro.brand = "NOHA";
        truck.car_name = "Big track"; truck.number_of_door = 2; truck.brand = "Big & heavy weight";

        System.out.println(auto.car_name + " --> " + auto.number_of_door);
        System.out.println(cng.car_name + " --> " + cng.brand);
        System.out.println(micro.car_name + " --> " + micro.brand);
        System.out.println(truck.car_name + " --> " + truck.brand + " --> " + truck.number_of_door);

    }
}