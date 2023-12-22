import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int t = 1, y = 1;
        String S[][] = new String[500][500];
        for (int i = 0; i < 250; i++) {
            for (int j = 0; j < 500; j++) {
                S[i][j] = "#";
            }
        }
        for (int i = 250; i < 500; i++) {
            for (int j = 0; j < 500; j++) {
                S[i][j] = ".";
            }
        }
        while (A-- > 0) {
            S[t][y] = ".";
            y += 2;
            if (y > 500) {
                t += 2;
                y = 1;
            }
        }
        t = 251;
        y = 1;
        while (B-- > 0) {
            S[t][y] = "#";
            y += 2;
            if (y > 500) {
                t += 2;
                y = 1;
            }
        }
        for (int i = 0; i < 500; i++) {
            for (int j = 0; j < 500; j++) {
                System.out.print(S[i][j]);
            }
            System.out.println();
        }
    }

}