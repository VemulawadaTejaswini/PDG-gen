import java.io.PrintWriter;
import java.util.*;

public class Main {

    private static Scanner in = new Scanner(System.in);
    private static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        solve();
        out.flush();
    }

    private static void solve() {
        int n = in.nextInt();
        int[] d = new int[n];
        for (int i=0; i < n; i++)
            d[i] = in.nextInt();

        Arrays.sort(d);

        out.println(d[n/2] - d[n/2-1]);
    }

}
