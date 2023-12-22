import java.util.Arrays;
import java.util.Scanner;

public class Main {
    Scanner   sc   = new Scanner(System.in);

    void run() {
        int N = sc.nextInt();
        long[] A = new long[N];
        for (int i = 0; i < N; i++) A[i] = sc.nextLong();
        Arrays.sort(A);
        int cnt = 1;
        long w = A[0];
        for (int i = 0; i < N - 1; i++) {
            if (w * 2 >= A[i + 1]) cnt++;
            else cnt = 1;
            w +=  A[i + 1];
        }
        System.out.println(cnt);
    }

    public static void main(String[] args) {
        new Main().run();
    }
}