import java.util.Scanner;

public class Task4
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if (age < 0) {
            System.out.println("Вам не може бути менше 0");
         }
        else if (age < 7) { // false
            System.out.println("Проїзд безкоштовний.");
        } else {
            System.out.println("Вам більше 7 років.");
        }
    }
}
