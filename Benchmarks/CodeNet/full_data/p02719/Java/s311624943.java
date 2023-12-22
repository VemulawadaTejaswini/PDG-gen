import java.io.*;
import java.util.*;

public class Main {
    static PrintWriter out = new PrintWriter(System.out);
    static Scanner sc = new Scanner(System.in);
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int[] size; // size of subtree, including self
    List<Integer>[] graph;
    long[] dp,ans;
    final long mod = 1000000000+7;
    long[] frac,inv; // inv[i] = the inversion of i! mod M
    public static void main(String[] args) throws IOException {
        Main main = new Main();
//        main.solve();
//        out.flush();
        System.out.println(main.solve());
    }
    long solve() throws IOException{
        long n = sc.nextLong(), k = sc.nextLong();
        if(n<=k){
            return Math.min(n,k-n);
        }
        long dif = n-k;
        long time = dif/k;
        n -= time*k;
        if(n>k) n -= k;
        return Math.min(n,k-n);
//        return 0;
    }
}

