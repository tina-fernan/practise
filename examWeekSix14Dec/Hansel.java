package excercise01.examWeekSix14Dec;

public class Hansel extends Car {


    public Hansel(String brand, String type) {
        super(brand, type);
    }

    @Override
    public void drive() {

    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public String getBrand() {
        return super.getBrand();
    }

    public void haveATry(String car){
        System.out.println("I love this <car kind> <brand> ");

    }
    //The Hansel class has the haveATry method that
    // receives a Car and drives it to display the following message “I love this <car kind> <brand>”.
}
