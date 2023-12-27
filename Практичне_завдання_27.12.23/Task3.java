import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        /*
          < - менше
          > - більше
          <= - менше або дорівнює
          >= - більше або дорівнює
          == - дорівнює
          != - не дорівнює
         */
        Scanner scanner = new Scanner(System.in);
        int numbers = scanner.nextInt();
        int numbers_2 = scanner.nextInt();
        System.out.println(numbers < numbers_2);
        System.out.println(numbers > numbers_2);
        System.out.println(numbers <= numbers_2);
        System.out.println(numbers >= numbers_2);
        System.out.println(numbers == numbers_2);
        System.out.println(numbers != numbers_2);
    }
}
