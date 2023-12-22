import java.util.*;

public class Main {

    long INF = Long.MAX_VALUE;
    long[] change = new long[10];
    String[] C = new String[9];
    char[][] c = new char[9][9];

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        Arrays.fill(change, INF);
        for (int i = 0; i < 9; i++) {
            C[i] = sc.next();
        }
        for (int i = 0; i < 9; i++) {
            c[i] = C[i].toCharArray();
        }
        String[] a = new String[H];
        for (int i = 0; i < H; i++) {
            a[i] = sc.next();
        }
        char[][] A = new char[H][W];
        for (int i = 0; i < H; i++) {
            A[i] = a[i].toCharArray();
        }
        System.out.println("1");

    }

    int dfs(int n, int m) {
        
        return 0;
    }
}