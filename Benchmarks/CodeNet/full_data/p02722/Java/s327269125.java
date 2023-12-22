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
        long n = sc.nextLong();
        if(n==2) return 1;
        long res1 = helper(n-1).size();
        Set<Long> set = helper(n);
        long res2 = 0;
        for(long div:set){
            // test whether k can be div
            long backup = n;
            while(backup%div==0) backup /= div;
            if(backup%div==1L) res2 ++;
        }
        return res1+res2;
    }
    Set<Long> helper(long n){
        // returns all the divisors except 1
        Set<Long> ans = new HashSet<>();
        for(long i=1;i*i<=n;i++){
            if(n%i==0){
                ans.add(i); ans.add(n/i);
            }
        }
        ans.remove(1L);
        return ans;
    }
}

