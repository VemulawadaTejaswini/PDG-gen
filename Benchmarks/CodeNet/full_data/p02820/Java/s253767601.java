import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        new Main().solve(System.in, System.out);
    }

    public void solve(InputStream in, PrintStream out) {
        Scanner sc = new Scanner(in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int r = sc.nextInt();
        int s = sc.nextInt();
        int p = sc.nextInt();
        int[] point = {r, s, p};
        char[] t = sc.next().toCharArray();
        char[] h = "spr".toCharArray();

        long res = 0;
        for(int i=0; i<k; i++) {
            int[] prev = {0, 0, 0};
            for(int j=0; i+j*k<n; j++) {
                int pos = i+j*k;
                int[] next = new int[3];
                for(int l=0; l<3; l++) {
                    for (int q = 0; q < 3; q++) {
                        if (l == q) continue;
                        if (t[pos] == h[q]) {
                            next[q] = Math.max(next[q], prev[l] + point[q]);
                        } else {
                            next[q] = Math.max(next[q], prev[l]);
                        }
                    }
                }
                prev = next;
            }
            Arrays.sort(prev);
            res += prev[2];
        }
        out.println(res);
    }
}
