import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        System.out.println((N == 1 ? 1L : (long) (N - 2)) * (M == 1 ? 1L : (long) (M - 2)));
    }

}

