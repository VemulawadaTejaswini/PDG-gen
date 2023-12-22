import java.util.*;

public class Main {
    public static void main(String[] args) {
        solve(new Scanner(System.in));
//        solve(new Scanner(ex));
    }

    private static final String ex = "10 8";

    private static void solve(Scanner scanner) {
        String[] split = scanner.nextLine().split(" ");
        int N = Integer.parseInt(split[0]);
        int K = Integer.parseInt(split[1]);

        int ret = K;
        for (int i = 1; i < N; i ++) {
            ret *= (K - 1);
        }

        System.out.println(ret);
    }
}

