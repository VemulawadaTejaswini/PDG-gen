import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by hikigineer on 2017/03/04.
 */
public class Main {
    static Scanner in;
    static PrintWriter out;
    static String INPUT = "";

    public static void main(String[] args) throws Exception
    {
        in = INPUT.isEmpty() ? new Scanner(System.in) : new Scanner(INPUT);
        out = new PrintWriter(System.out);
        int N = ni();
        int[] a = new int[3 * N];
        int i;
        long result = 0L;
        for(i = 0; i < 3 * N; i++) a[i] = ni();
        Arrays.sort(a);
        for(i = 3 * N - 2; i >= N; i -= 2) result += a[i];

        out.println(result);
        out.flush();
    }

    static int ni() {
        return Integer.parseInt(in.next());
    }
}