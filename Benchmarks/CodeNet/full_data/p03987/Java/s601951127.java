import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            int[] A = new int[N];

            for (int i = 0; i < N; i++) {
                A[i] = in.nextInt();
            }

            System.out.println(solve(0, A.length - 1, new RMQ(A)));
        }
    }

    private static long solve(int l, int r, RMQ rmq){
        if (l > r)
            return 0;

        if (l == r)
            return rmq.queryValue(l, r);

        int p = rmq.queryPosition(l, r);
        int key = rmq.queryValue(l, r);

        return (long)key * (p - l + 1) * (r - p + 1) + solve(l, p - 1, rmq) + solve(p + 1, r, rmq);
    }
}
