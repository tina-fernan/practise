package excercise01.examWeekSix14Dec;

public abstract class Car {
    //There are two kinds of car: manual and automatic.
    //A car has a brand.
    //A car can drive. When it does, it returns a message saying “<car kind> <brand>”.

    //The Car class must be abstract. It has a brand that is given with the constructor.
    private String brand;

    private String type;

    public Car(String brand, String type) {
        this.brand = brand;
        this.type = type;
    }
    // It has the drive method.

    public  void drive(){
        System.out.println("I drive " + getBrand());
    }


    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    public String getBrand() {
        return brand;
    }

    public String getType() {
        return type;
    }
}
