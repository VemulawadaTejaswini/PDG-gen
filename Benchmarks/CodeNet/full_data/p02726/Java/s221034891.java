import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int[][] a;

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        int n = in.nextInt(), x = in.nextInt() - 1, y = in.nextInt() - 1, b[] = new int[n + 1];
        a = new int[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(a[i], n);
            a[i][i] = 0;
        }
        for (int i = 0; i < n - 1; i++) {
            a[i][i + 1] = 1;
            a[i + 1][i] = 1;
        }
        a[x][y] = 1;
        a[y][x] = 1;
        for (int k = 0; k < n; k++)
            for (int i = 0; i < n; i++)
                for (int j = i + 1; j < n; j++) {
                    a[i][j] = Math.min(a[i][j], a[i][k] + a[k][j]);
                }
        for (int i = 0; i < n; i++)
            for (int j = i + 1; j < n; j++) {
                b[a[i][j]]++;
            }
        for (int i = 1; i < n; i++)
            out.println(b[i]);
        out.flush();

    }
}
