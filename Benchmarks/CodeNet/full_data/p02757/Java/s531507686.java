import java.io.*;
import java.util.*;

public class Main {
    static PrintWriter out = new PrintWriter(System.out);
    static Scanner sc = new Scanner(System.in);
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//    long mod = 1000000000+7;
    int cnt2 = 0;
    ArrayList<Integer>[] graph;
    public static void main(String[] args) throws IOException {
        Main main = new Main();
        out.println(main.solve());
        out.flush();
    }
    long solve() throws IOException {
        int n = sc.nextInt(), mod = sc.nextInt();
        char[] s = sc.next().toCharArray();
        if(mod==2||mod==5) return helper(n,s,mod);
        // otherwise, the real thing
        int[] power = new int[n+1];
        power[0] = 1;
        for(int i=1;i<=n;i++) power[i] = power[i-1]*10%mod;
        int[] rec = new int[mod];
        rec[0] = 1;
        int prev = 0;
        long ans = 0;
        for(int i=n-1;i>=0;i--){
            int cur = s[i]-'0';
            prev += cur*power[n-i-1]%mod;
            prev %= mod;
            ans += rec[prev];
            rec[prev] ++;
        }
        return ans;
    }
    long helper(int n, char[] a, int mod){
        long ans = 0;
        for(int i=0;i<n;i++){
            int num = a[i]-'0';
            if(num%mod==0){
                ans += i+1;
            }
        }
        return ans;
    }

}