package weekSix.exercise01.exercise05;

public abstract class CreditCard {

    private Integer number;
    private String name;

    public CreditCard(Integer number, String name) {
        this.number = number;
        this.name = name;
    }


    public Integer getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }
}
