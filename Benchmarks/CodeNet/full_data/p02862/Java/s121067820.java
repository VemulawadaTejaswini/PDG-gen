import java.io.PrintWriter;
import java.util.*;

public class Main {
    PrintWriter out = new PrintWriter(System.out);
    final long mod = 1000000000+7;
    int maxn;
    long[] frac;
    long[] inv;

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.solve());
    }

    long solve() {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt(), Y = sc.nextInt();

        if((X+Y)%3!=0) return 0;
        X_p = X - (X+Y)/3;
        Y_p = Y - (X+Y)/3;
        if(X_p<0 || Y_p<0) return 0;

        ans = main.combination(X_p+Y_p, X_p);

        return ans;
    }

    long combination(int n, int k) {
        return kaijo(n)/(kaijo(k)*kaijo(n-k))
    }
    long kaijo(int n) {
        n==0 ? 1 : n * kaijo(n-1)
    }
}

