import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    static final int MAX = 100100;
    InputStream in = System.in;
    PrintStream out = System.out;
    // static int dp[][] = new int[MAX][MAX];

    public void _main(String[] args) {
        Scanner sc = new Scanner(in);
        int L = sc.nextInt();
        int R = sc.nextInt();
        int M = Math.min(R,L+6000);
        long res = 1001000;
        for (long i=L;i<=M;i++) {
            for (long j=i+1;j<=M;j++) {
                res = Math.min(res, (i*j)%2019));
            }
        }
        out.println(res);
    }

    public static void main(String[] args) {
        new Main()._main(args);
    }
}
