import java.io.PrintWriter;
import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {

        long n = sc.nextLong();
        long k = sc.nextLong();

        if (k==0) {
            out.print(n*n);
            out.flush();
            return;
        }

        long ans = 0;

        for (long b=k+1; b<=n; b++) {
            long base = b-k;
            long div = n/b;
            long remain = n%b;
            ans += base*div;
            if (remain>=k) {
                ans += remain-k+1;
            }
        }

        out.print(ans);

        out.flush();

    }

}
