import java.io.InputStream;
import java.io.PrintStream;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static final int MAX = 100100;
    InputStream in = System.in;
    PrintStream out = System.out;
    //static int d[] = new int[MAX];
    // static int dp[][] = new int[MAX][MAX];

    public void _main(String[] args) {
        Scanner sc = new Scanner(in);
        int N = sc.nextInt();
        int d[] = new int[N];
        for (int i=0;i<N;i++) d[i] = sc.nextInt();

        Arrays.sort(d);
        if ((N&1)==1) {out.println("0"); return;}
        int mid = N/2;
        out.println(d[mid] - d[mid-1]);
    }

    public static void main(String[] args) {
        new Main()._main(args);
    }
}
