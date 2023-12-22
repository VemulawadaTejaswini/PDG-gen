import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int a[] = new int[N];
        int color[] = new int[9];
        Arrays.fill(color, 0);
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        for (int i = 0; i < N; i++) {
            if (a[i] > 0 && a[i] < 400) {
                color[0]++;
                continue;
            }
            if (a[i] > 399 && a[i] < 800) {
                color[1]++;
                continue;
            }
            if (a[i] > 799 && a[i] < 1200) {
                color[2]++;
                continue;
            }
            if (a[i] > 1199 && a[i] < 1600) {
                color[3]++;
                continue;
            }
            if (a[i] > 1599 && a[i] < 2000) {
                color[4]++;
                continue;
            }
            if (a[i] > 1999 && a[i] < 2400) {
                color[5]++;
                continue;
            }
            if (a[i] > 2399 && a[i] < 2800) {
                color[6]++;
                continue;
            }
            if (a[i] > 2799 && a[i] < 3200) {
                color[7]++;
                continue;
            }
            color[8]++;
        }
        int ans = 0;
        for (int i = 0; i < 8; i++) {
            if (color[i] > 0) {
                ans++;
            }
        }
        if (ans == 0) {
            System.out.print("1 ");
        } else {
            System.out.print(ans + " ");
        }
        System.out.println(ans + color[8]);
    }

}
