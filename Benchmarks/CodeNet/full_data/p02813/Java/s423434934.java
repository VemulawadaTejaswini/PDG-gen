import java.io.*;
import java.util.*;
import static java.lang.System.in;

public class Main {
    public static void main(String[] args) throws Exception {
        Main main = new Main();
        main.solve();
    }
    void solve(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] P = new int[n], Q = new int[n];
        for(int i=0;i<n;i++) P[i]=sc.nextInt();
        for(int i=0;i<n;i++) Q[i]=sc.nextInt();
        int a = help(n,P), b = help(n,Q);
        System.out.println(Math.abs(a-b));
    }
    int help(int n, int[] a){
        // a is a permutation of n
        boolean[] used = new boolean[n+2];
        int ans = 0;
        int[] fac = new int[10];
        fac[0]=1;
        for(int i=1;i<10;i++) fac[i] = i*fac[i-1];
        for(int i=0;i<n;i++){
            int cnt = 0;
            for(int j=1;j<a[i];j++){
                if(!used[j]) cnt++;
            }
            used[a[i]] = true;
            ans += fac[n-1-i]*cnt;
        }
        return ans;
    }
}

