import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
//    private static final String ex = "1\n" +
//            "10\n" +
//            "2";
//    private static final String ex = "2\n" +
//            "9\n" +
//            "3 6";
//    private static final String ex = "5\n" +
//            "20\n" +
//            "11 12 9 17 12";

    public static void main(String[] args) {
        System.out.println(solve(new Scanner(System.in)));
//        System.out.println(solve(new Scanner(ex)));
    }

    private static int solve(Scanner scanner) {
        int N = Integer.parseInt(scanner.nextLine());
        int K = Integer.parseInt(scanner.nextLine());
        int[] X = new int[N];
        String[] split = scanner.nextLine().split(" ");
        for (int i = 0; i < N; i ++) {
            X[i] = Integer.parseInt(split[i]);
        }

        int sum = 0;
        for (int i = 0; i < N; i ++) {
            if ((K - X[i]) > X[i]) sum += X[i];
            else sum += Math.abs(K - X[i]);
        }

        return sum * 2;
    }
}
