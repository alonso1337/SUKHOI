
import java.util.Scanner;

public class test {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in, "UTF-8");
        System.out.println("Привет! Ты готов начать играть в игру? (Напиши: ДА или НЕТ)");
        String answer = scanner.nextLine();
        if (answer.equalsIgnoreCase("ДА")) {
            // первый блок
            System.out.println("Ехала!");
        } else if (answer.equalsIgnoreCase("НЕТ")) {
            // второй блок
            System.out.println("Как так то?");
        } else {
            System.out.println("Есть всего два ответа");

        }
    }

}
