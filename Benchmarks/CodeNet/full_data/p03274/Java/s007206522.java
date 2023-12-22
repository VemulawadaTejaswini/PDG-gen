package main;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] X = new int[N];
        int[] x = new int[N + 1];
        int All = Integer.MAX_VALUE;
        int s = 0;
        for (int i = 0; i < N; i++) {
            x[i] = sc.nextInt();
            if (x[i] <= 0 && Math.abs(x[s]) > Math.abs(x[i])) {
                s = i;
            }
        }
        for(int i=0;i<=s;i++){
            if((s+1)-i>K){
                continue;
            }
            int n=K-(s+1)+i;
            int c=Math.abs(x[i])+Math.abs(x[s+n]-x[i]);
            All=Math.min(All,c);
            c=Math.abs(x[s+n])+Math.abs(x[s+n]-x[i]);
            All=Math.min(All,c);
        }
        System.out.println(All);
    }
}
