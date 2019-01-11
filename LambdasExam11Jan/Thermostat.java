package LambdasExam11Jan;

import java.util.function.Function;
import java.util.function.Predicate;

public class Thermostat {



    public String getTriggered(Integer number){
        return sence(number -> number== -1)
    }

    public String displayMessage(Integer number){
        return sence(number -> number.)
    }


    private String sence(Integer number, Predicate<Integer>triggerCondition, Function<Integer,String>display){
        Integer doubleNumber=new double[int];
        if (triggerCondition.test(doubleNumber)){
            String message=display.apply(number);
            return message;
        }




    }
}
