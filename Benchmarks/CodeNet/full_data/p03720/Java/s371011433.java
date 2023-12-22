import java.util.*;
import java.math.*;

class Main {
    public static void main(String[] args) {
        new Solver().run();
    }
}

class Solver {

    public void run() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] a = new int[M + 1];
        int[] b = new int[M + 1];

        for (int i = 1; i <= M; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }

        int[] r = new int[N + 1];
        for (int i = 1; i <= M; i++) {
            r[a[i]]++;
            r[b[i]]++;
        }

        for (int i = 1; i <= N; i++) {
            System.out.println(r[i]);
        }

        return;
    }

}