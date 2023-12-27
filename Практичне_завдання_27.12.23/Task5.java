import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number_1;
        double number_2;
        String sign;
        while (true) {
            number_1 = scanner.nextDouble();
            number_2 = scanner.nextDouble();
            sign = scanner.next();
            if (sign.equalsIgnoreCase("exit")) {
                break;
            }
            if (sign.equals("+")) {
                System.out.println(number_1 + number_2);

            } else if (sign.equals("-")) {
                System.out.println(number_1 - number_2);
            } else if (sign.equals("/")) {
                System.out.println(number_1 / number_2);
            } else if (sign.equals("*")) {

                System.out.println(number_1 * number_2);
            }

        }
    }
}
