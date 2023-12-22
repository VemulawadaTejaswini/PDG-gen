import java.io.*;
import java.util.*;

public class Main {
    PrintWriter out = new PrintWriter(System.out);
    long mod = 1000000000+7;
    int maxN;
    long[] frac, inv;
    public static void main(String[] args) throws Exception {
        Main main = new Main();
//        main.solve();
        System.out.println(main.solve());
    }
    long solve(){
        // it's all about implementation
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        this.maxN = n+50;
        ini();
        for(int i=1;i<=k;i++){
            long cur = helper(i,n,k);
            out.println(cur);
        }
        out.flush();
        System.exit(0);
        return 0;
    }
    long helper(int i, int n, int k){
        // split k blue balls into i parts
        if(i>n-k+1) return 0;
        long ans = frac[k-1]*inv[i-1]%mod*inv[k-i]%mod;
        int red = n-k-(i-1); // first take i-1 read balls to split
        int pos = i+1;
        ans = ans*frac[pos+red-1]%mod*inv[pos-1]%mod;
        ans = ans*inv[red]%mod;
        return ans;
    }
    void ini(){
        frac = new long[maxN+1];
        inv = new long[maxN+1]; // inv[i] means the inverse of frac[i] in sense of mod
        frac[0] = 1;
        for(int i=1;i<=maxN;i++) frac[i] = i*frac[i-1]%mod;
        inv[maxN] = power(frac[maxN], mod-2);
        inv[0] = 1;
        for(int i=maxN-1;i>=1;i--){
            inv[i] = (i+1)*inv[i+1]%mod;
        }

    }
    long power(long base, long p){
        long ans = 1;
        while(p>0){
            if(p%2==1) ans = ans*base%mod;
            base = base*base%mod;
            p /= 2;
        }
        return ans;
    }
}

