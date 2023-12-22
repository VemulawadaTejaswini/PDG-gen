import java.io.*;
import java.util.*;

public class Main {
    static PrintWriter out = new PrintWriter(System.out);
    static Scanner sc = new Scanner(System.in);
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int k;
    long[] d;
    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.solve();
//        System.out.println(main.solve());
    }
    void solve() throws IOException{
        long n = sc.nextLong(), a = sc.nextLong(), b = sc.nextLong();
        long t = n/(a+b);
        long r = n%(a+b);
        long ans = t*a+Math.min(r,a);
        System.out.println(ans);
    }
}

