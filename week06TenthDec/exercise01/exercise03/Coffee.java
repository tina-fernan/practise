package weekSix.exercise01.exercise03;

public class Coffee {

    String madeBy;
    Integer brewedTime;

    public Coffee(String madeBy, Integer brewedTime) {
        this.madeBy = madeBy;
        this.brewedTime = brewedTime;
    }

    public String getMadeBy() {
        return madeBy;
    }

    public Integer getBrewedTime() {
        return brewedTime;
    }
}
