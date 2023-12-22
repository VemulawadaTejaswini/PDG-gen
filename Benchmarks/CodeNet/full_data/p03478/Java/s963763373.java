import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            int A = in.nextInt();
            int B = in.nextInt();

            int sum2 = 0;
            for (int i = 1; i <= N; i++) {
                int sum = sum(i);
                if (sum >= A && sum <= B) {
                    sum2 += i;
                }
            }

            System.out.println(sum2);
        }
    }

    private static int sum(int n) {
        int sum = 0;
        for (; n > 0;) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
