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
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        out.println(Math.min(n*a,b));

    }

    public static void main(String[] args) {
        new Main()._main(args);
    }
}
