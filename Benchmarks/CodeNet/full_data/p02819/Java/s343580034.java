import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long number = scanner.nextLong();
        boolean found = false;
        if (number == 2) {
            System.out.println(2);
        } else {
            do {
                for (int i = 2; i < number; i++) {
                    if (number % i == 0) {
                        break;
                    }
                    if (i == number - 1) {
                        found = true;
                    }
                }
                number++;
            } while (!found);
            System.out.println(number - 1);
        }
    }
}
