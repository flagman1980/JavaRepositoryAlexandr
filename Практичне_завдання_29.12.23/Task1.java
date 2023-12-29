public class Task1 {
    public static void main(String[] args) {
        int number = 10;
        int i = 0;
        while (i <= number) {
            System.out.println(i);
            i = i + 1; // i++; i += 1
        }
        for (int j = 0; j < number; j+=2) {
            System.out.println(j);
        }
        i = 11;
        do {
            System.out.println(i);
            i++;
        } while (i <= number);
    }
}
