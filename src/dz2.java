import java.util.Scanner;

public class dz2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите x:");
        double x = scanner.nextDouble();
        double y;
        if (x > 2){
            y = (x * x - 1) / (x + 2);
        }else if (0 < x) {
            y = (x * x - 1) * (x + 2);
        } else {
            y = x * x *(1 + 2 * x);
        }
        System.out.println("y = " + y);
    }
}
