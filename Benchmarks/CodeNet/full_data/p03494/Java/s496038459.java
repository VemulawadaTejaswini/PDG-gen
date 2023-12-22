import java.util.Scanner;

/**
 *
 * @author psygn
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        long[] numbers = new long[num];
        long count = 0;

        for (int i = 0; i < num; i++) {
            numbers[i] = scanner.nextLong();
        }

        while (true) {
            if (!allEven(numbers)) {
                break;
            }
            for (int i = 0; i < num; i++) {
                if (numbers[i] % 2 == 0) {
                    numbers[i] = numbers[i] / 2;
                }
            }
            count++;
        }
        
        System.out.println(count);

    }

    public static boolean allEven(long[] numbers) {
        for (long l : numbers) {
            if (l % 2 != 0) {
                return false;
            }
        }
        return true;
    }

}