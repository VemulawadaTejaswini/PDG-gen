import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] rail = new int[m + 1];
        int[] d = new int[m + 1];

        for (int i = 0; i < n; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            int w = r - l + 1;

            rail[1]++;
            if (w < m){
                rail[w + 1]--;
                rail[Math.max(l, w + 1)]++;
            } else {
                rail[l]++;
            }
            if (r < m) rail[r + 1]--;

            for (int j = 1; j <= Math.sqrt(r); j++) {
                if (j <= w) {
                    int tmp = ((l / j) + ((l % j == 0) ? 0 : 1)) * j;
                    while (l <= tmp && tmp <= r) {
                        int k = tmp / j;
                        if (w < k && k < l) d[k]++;
                        tmp += j;
                    }
                } else {
                    if (l % j == 0 || l % j > r % j) {
                        d[j]++;
                        if ((r / j) != j && (r / j) < l) d[r / j]++;
                    }
                }
            }
        }

        for (int i = 1; i <= m; i++) {
            rail[i] += rail[i - 1];
            System.out.println((d[i] + rail[i]));
        }
    }
}
