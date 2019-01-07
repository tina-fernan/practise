package week8SevenJan.exercise01;

import excercise01.FileReader;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class communicationApplication {

    public static void main(String[] args) {
        FileReader reader=new FileReader();
        Sensor sensor=new Sensor();
        Archieve archieve = new Archieve();

       List<String>line=reader.asLines("week8SevenJan/exercise01/robomime.txt ");
       List<String>trick = sensor.decryptTrick(line);

        archieve.getTrick(trick);

    }
}
