package weekSix.exercise01.exercise02;

public class CupIceCream extends IceCream {


    public CupIceCream(String flavor, String topping) {
        super(flavor, topping);
    }

    @Override
    public String eat() {
        return "The " + getFlavor() + " ice-cream with " + getTopping() + " is eaten with a spoon";

    }


}
