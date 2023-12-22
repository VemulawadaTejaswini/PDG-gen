import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            solve(in);
        }
    }

    static void solve(Scanner in) {
        int N = in.nextInt();
        int K = in.nextInt();

        long ans = K;
        for (int i = 1; i < N; i++)
            ans *= (K - 1);
        System.out.println(ans);
    }
}