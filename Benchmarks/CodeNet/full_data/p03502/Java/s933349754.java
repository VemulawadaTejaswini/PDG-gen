import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            System.out.println(N % f(N) == 0 ? "Yes" : "No");
        }
    }

    private static int f(int n) {
        int sum = 0;
        for (; n > 0;) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
