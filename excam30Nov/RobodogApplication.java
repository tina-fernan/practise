package excam30Nov;

import excercise26Nov.excercise01.excercise11.HappinesRecord;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class RobodogApplication {

    public static void main(String[] args) {


        FileReader fileReader = new FileReader();

        List<String> lines = fileReader.getLines(" excam30Nov/robodogtxt.txt");
        readRobogagApplicatin(lines);


    }
    private static void readRobogagApplicatin(List<String> lines) {

        List<RobodogApplication> robodogs = doRead(lines);

        System.out.println(robodogs);

        for (int times = 0; times < 5; times++) {
            RobodogApplication robodogApplication = robodogs.get(times);
            System.out.println(robodogs.getInstruction()+
                    " | " + robodogs.getUnique();
        }
    }

        private static List<RobodogApplication> doRead(List<String> lines) {

        List<RobodogApplication> robodogs = new ArrayList<>();
        for (String line : lines) {
            RobodogApplication robodogApplication = read(line);
            robodogs.add(robodogApplication);
        }
        return robodogs;
    }

    private static RobodogApplication read(String line) {
        String[] split = line.split(";");

        String instruction = split[0];
        Integer unique = Integer.valueOf(split[1]);

        return new RobodogApplication();


    }

    private static String getInstruction(){
        return;
    }


}
