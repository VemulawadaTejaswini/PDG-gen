import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    static final int MAX = 100100;
    InputStream in = System.in;
    PrintStream out = System.out;
    // static int dp[][] = new int[MAX][MAX];
    static int a[] = new int[MAX];

    public void _main(String[] args) {
        Scanner sc = new Scanner(in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++) a[i] = sc.nextInt();

        int x1 = 0;
        for (int i=0;i<n;i++) {
            if ((i&1)==0) x1+=a[i];
            else x1 -= a[i];
        }
        out.printf("%d ", x1);
        int last=x1;
        for (int i=0;i<n-2;i++) {
            last = 2*a[i] - last;
            out.printf("%d ", last);
        }
        out.println(2*a[n-1]-x1);
    }

    public static void main(String[] args) {
        new Main()._main(args);
    }
}
