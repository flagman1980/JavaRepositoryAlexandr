public class Task3 {
    public static void main(String[] args) {
        int number = 9;
        int number_2 = 20;
        int number_3 = 2;
        int number_4 = 1;

        if (number < number_2 && number < number_4 && number_3 > number) {
            System.out.println(number + " - найменше.");


        }
        if (number_2 < number && number_2 < number_3 && number_4 > number_2) {
            System.out.println(number_2 + " - найменше.");

        }
        if (number_3 < number_2 && number_3 < number_4 && number > number_3) {
            System.out.println(number_3 + " - найменше.");


        }
        if (number_4 < number_2 && number_4 < number && number_3 > number_4) {
            System.out.println(number_4 + " - найменше.");
        }
    }
}
