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


            if (w + 1 < l) {
                for (int j = 2; j <= Math.min(Math.sqrt(r), l - 1); j++) {
                    if (j <= w) {
                        int s = (l / j) + ((l % j == 0) ? 0 : 1);
                        int e = r / j;
                        if (w < s && s < l) {
                            e = Math.min(l - 1, e);
                            rail[s]++;
                            rail[e + 1]--;
                        } else if (w < e && e < l) {
                            s = Math.max(w + 1, s);
                            rail[s]++;
                            rail[e + 1]--;
                        } else if (s <= w && l <= e) {
                            s = w + 1;
                            e = l - 1;
                            rail[s]++;
                            rail[e + 1]--;
                        }
                    } else {
                        if ((r / j) * j >= l) {
                            d[j]++;
                            if ((r / j) != j && (r / j) < l) d[r / j]++;
                        }
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
