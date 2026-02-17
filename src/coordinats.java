import java.util.Scanner;
public class coordinats {
    public static void main(String[] args){
        int step = 0;
        int personX = 3;
        int personY = 1;
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        // personX == 3, personY == 1
        if (x != personX && y != personY) {
            System.out.println("Некорректный ход");
        }  else if (Math.abs(x - personX) == 1){
            personX = x;
            step += 1;
        }   else if (Math.abs(y - personY) == 1 ){
            personY = y;
            step += 1;
        }
            else  {
                    System.out.println("корды не изменены");
            }
        }

    }

