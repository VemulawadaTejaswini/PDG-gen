import java.io.PrintWriter;
import java.util.Scanner;

class C {
    public static void main(String... args) {
        final Scanner sc = new Scanner(System.in);
        final int H = sc.nextInt();
        final int W = sc.nextInt();
        final int K = sc.nextInt();
        final char[][] s = new char[H][];
        for (int i = 0; i < H; i++)
            s[i] = sc.next().toCharArray();
        final int[][] ans = new int[H][W];
        for (int c = 0, i = 0; i < H; i++) {
            int first = 0;
            while (first < W && s[i][first] != '#')
                first++;
            if (first == W) {
                if (i > 0)
                    System.arraycopy(ans[i - 1], 0, ans[i], 0, W);
            } else {
                for (int j = 0; j < first; j++)
                    ans[i][j] = c + 1;
                for (int j = first; j < W; j++) {
                    if (s[i][j] == '#')
                        c++;
                    ans[i][j] = c;
                }
            }
        }
        for (int i = H - 1; i > 0; i--)
            for (int j = 0; j < W; j++)
                if (ans[i - 1][j] == 0)
                    ans[i - 1][j] = ans[i][j];
        final PrintWriter pw = new PrintWriter(System.out);
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++)
                if (j > 0) {
                    pw.print(' ');
                    pw.print(ans[i][j]);
                } else
                    pw.print(ans[i][j]);
            pw.println();
        }
        pw.close();
    }
}
public class Main {
    public static void main(String... args) {
        C.main();
    }
}
