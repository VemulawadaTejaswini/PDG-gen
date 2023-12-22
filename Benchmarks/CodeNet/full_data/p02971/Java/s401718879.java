

import java.util.*;

public class Main {

    long INF = Long.MAX_VALUE;
    long[] dp;
    long n;

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] A= new long[N];
        long f = 0;
        long s = 0;
        int cf = 0;
        int cs = 0;
        for(int i = 0;i< N;i++){
            A[i] = sc.nextLong();
            if(f < A[i]){
                f = A[i];
                cf = i;
            }
        }
        for(int i = 0;i < N;i++){
            if(i == cf){
                continue;
            }
            if(s <= A[i]){
                s = A[i];
            }
        }
        for(int i =0;i < N;i++){
            if(cf == i){
                System.out.println(s);
            }else{
                System.out.println(f);
            }
        }
    }

    int gcd(int m, int n) {
        if (m < n) {
            return gcd(n, m);
        }
        if (n == 0) {
            return m;
        }
        return gcd(n, m % n);
    }
}
