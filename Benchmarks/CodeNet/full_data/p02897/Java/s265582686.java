import java.util.Scanner;

/**
 * Odds of Oddness
 */
public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();

            System.out.println((double) ((N + 1) / 2) / N);
        }
    }

}
