package weekSix.exercise01.exercise02;

public class ConeIceCream extends IceCream {


    public ConeIceCream(String flavor, String topping) {
        super(flavor, topping);
    }

    @Override
    public String eat() {
        return "The " + getFlavor() + " ice-cream with " + getTopping() + " is licked";
    }


}
