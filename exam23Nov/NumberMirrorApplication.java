package exam23Nov;

import java.util.Scanner;

public class NumberMirrorApplication {

    public static void main(String[] args) {

        NumberMirror numberMirror=new NumberMirror();
        System.out.println("tell me a number");
        Scanner scanner= new Scanner(System.in);
        Integer number= scanner.nextInt();
        numberMirror.backward(number);


    }
}
