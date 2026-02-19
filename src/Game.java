import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        double a = 4.0;
        double b = 6.0;



        double summ1 = a + b;
        double summ2 = a - b;
        double summ3 = b - a;
        double summ4 = a * b;
        double summ5 = a / b;
        double summ6 = a % b;
        double summ7 = b / a;
        double summ8 = b % a;
        System.out.println("a + b = " + summ1);
        System.out.println("a - b = " + summ2);
        System.out.println("b - a = " + summ3);
        System.out.println("a * b = " + summ4);
        System.out.println("a / b = " + summ5);
        System.out.println("a % b = " + summ6);
        System.out.println("b / a = " + summ7);
        System.out.println("b % a = " + summ8);
}
}