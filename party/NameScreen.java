package weekSeven.exercise01.party;

import java.util.Arrays;
import java.util.List;

public class NameScreen {

   private String names;
    private Integer numbers;

   public List<Integer> numberlist= Arrays.asList(1,2,3,4,5,6,7,8,9);

    public NameScreen(String names, Integer numbers, List<Integer> numberlist) {
        this.names = names;
        this.numbers = numbers;
        this.numberlist = numberlist;
    }

    @Override
    public String toString() {
        return names+" | "+" numbers: " +numbers;
    }

    public String getNames() {
        return names;
    }

    public Integer getNumbers() {
        return numbers;
    }

    public List<Integer> getNumberlist() {
        return numberlist;
    }
}
