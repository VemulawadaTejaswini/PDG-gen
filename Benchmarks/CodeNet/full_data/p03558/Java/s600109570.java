import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int K = sc.nextInt();

        System.out.println(solve(K));

        sc.close();
    }

    static int solve(int K) {
        int result = Integer.MAX_VALUE;
        long multiple = K;
        for (int i = 0; i < 10_000_000; ++i) {
            int digitSum = 0;
            long v = multiple;
            while (v != 0) {
                digitSum += v % 10;
                v /= 10;
            }
            result = Math.min(result, digitSum);

            multiple += K;
        }

        return result;
    }
}