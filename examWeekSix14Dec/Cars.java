package excercise01.examWeekSix14Dec;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Cars extends Car{

    public Cars(String brand, String type) {
        super(brand, type);
    }

    public Car getNextCar(String brand) {
            AutomaticCar automaticCar = new AutomaticCar(brand,getType());
            ManualCar manualCar = new ManualCar(brand,getType());

            List<Car> carsKind = Arrays.asList(automaticCar, manualCar);


            Integer size = carsKind.size();
            Random random = new Random();
            int randomCar = random.nextInt(size);
            return carsKind.get(randomCar);
        }

    @Override
    public void drive() {

    }
}

