import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите x: ");
        double x = scanner.nextDouble();

        System.out.print("Введите y: ");
        double y = scanner.nextDouble();

        if (y == 0) {
            System.out.println("Ошибка: деление на ноль!");
            scanner.close();
            return;
        }

        System.out.print("Введите z: ");
        double z = scanner.nextDouble();

       ;
        System.out.println("Результат: " + ((x + 2) * y - z) / y + y * z);
        System.out.println("!");

        scanner.close();
    }
}