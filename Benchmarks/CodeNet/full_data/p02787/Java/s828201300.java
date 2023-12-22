import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int n = sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[n];
        ArrayList<Pair> l = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            l.add(new Pair(a[i], b[i]));
        }
        Collections.sort(l);
        int dp[][] = new int[n][h + 20000];
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < h + 20000; j++) {
                dp[i][j] = 1000000000;
            }
        }

        int s = l.get(0).key;
        int v = l.get(0).value;
        for (int i = 0; i * s < h + 20000; i++) {
            dp[0][i * s] = v * i;
        }
        for (int i = 1; i < n; i++) {
            Pair newP = l.get(i);
            for (int j = 0; j < h + 20000; j++) {
                dp[i][j] = dp[i - 1][j];
                if (j - newP.key < 0) {
                    continue;
                }
                if (dp[i - 1][j - newP.key] + newP.value < dp[i][j]) {
                    dp[i][j] = dp[i - 1][j - newP.key] + newP.value;
                } else {
                }
            }
        }
        int min = 1000000000;
        for (int i = h; i < h + 20000; i++) {
            min = Math.min(min, dp[n - 1][i]);
        }
        System.out.println(min);
        sc.close();

    }

    public static long pow(long a, long n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return a;
        }
        if (n % 2 == 0) {
            return pow(a * a, n / 2);
        } else {
            return a * pow(a * a, (n - 1) / 2);
        }
    }

}

class Pair implements Comparable<Pair> {
    // key , value 昇順ソート
    int key;
    int value;

    Pair(int key, int value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public int compareTo(Pair other) {
        if (this.key == other.key) {
            return this.value - other.value;
        }
        // return this.value - other.value;
        return this.key - other.key;
    }
}
