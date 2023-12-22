import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        String S = scan.next();
        int[][] d = new int[26][3];
        for (int i = 0; i < 26; i++) {
            d[i][0] = 0;
            d[i][1] = Integer.MAX_VALUE;
            d[i][2] = Integer.MIN_VALUE;
        }
        char[] list = S.toCharArray();
        for (int i = 1; i <= list.length; i++) {
            int x = list[i-1] - 'a';
            d[x][0] += 1;
            d[x][1] = Math.min(d[x][1], i);
            d[x][2] = Math.max(d[x][2], i);
        }
        for (int i = 0; i < 26; i++) {
            if (list.length / 2 <= d[i][0]) {
                System.out.printf("%d %d\n",d[i][1], d[i][2]);
                return;
            }
        }
        System.out.printf("%d %d\n",-1, -1);
    }
}
