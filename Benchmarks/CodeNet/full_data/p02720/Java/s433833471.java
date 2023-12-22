import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long inputInt = scanner.nextLong();

        long counter = 0;
        long current = 1;
        while (true) {
            if (current <= 12) {
                counter++;
            } else {
                boolean fit = isLunLun(current);
                if (fit) {
                    counter++;
                }
            }
            if (counter == inputInt) {
                break;
            }
            current++;
        }
        System.out.println("Answer:" + current);
    }

    private static boolean isLunLun(long number) {
        long lastDigit = number % 10;
        boolean fit = true;
        do {
            number /= 10;
            if (number > 0) {
                long nextDigit = number % 10;
                long difference = nextDigit - lastDigit;
                if (difference != 0 && difference != 1 && difference != -1) {
                    fit = false;
                    break;
                }
                lastDigit = nextDigit;
            }
        } while (number > 9);
        return fit;
    }
}
