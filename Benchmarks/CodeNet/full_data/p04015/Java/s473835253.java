import java.util.*;

public class Main {
    public static void main(String[] args) {
        solve(new Scanner(System.in));
//        solve(new Scanner(ex));
    }

    private static final String ex = "16 3\n" +
            "3 3 3 3 3 3 3 3 3 3 3 3 3 3 3 3";
//    private static final String ex = "33 3\n" +
//            "3 3 3 3 3 3 3 3 3 3 3 3 3 3 3 3 3 3 3 3 3 3 3 3 3 3 3 3 3 3 3 3 3";
//    private static final String ex = "8 5\n" +
//            "3 6 2 8 7 6 5 9";
//    private static final String ex = "4 8\n" +
//            "7 9 8 9";

    private static void solve(Scanner scanner) {
        String[] split = scanner.nextLine().split(" ");
        int N = Integer.parseInt(split[0]);
        int A = Integer.parseInt(split[1]);

        int[] x = new int[N];
        split = scanner.nextLine().split(" ");
        for (int i = 0; i < N; i++) x[i] = Integer.parseInt(split[i]);

        long count = 0;
        for (long i = 1; i < (1L << N); i ++) {
            if (selectAndAverage(x, i) == A) count ++;
        }

        System.out.println(count);
    }

    private static int selectAndAverage(int[] x, long selection) {
        int N = x.length;
        int sum = 0;
        int count = 0;
        for (int i = 0; i < N; i ++) {
            if (((1 << i) & selection) != 0) {
                sum += x[i];
                count ++;
            }
        }
        if (sum % count != 0) return -1;
        return sum / count;
    }
}

