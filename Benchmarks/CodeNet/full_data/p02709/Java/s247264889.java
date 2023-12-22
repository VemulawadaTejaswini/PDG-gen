import java.util.*;

public class Main {

    static long mod = 1000000007;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        List<P> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            list.add(new P(i, a[i]));
        }
        Collections.sort(list);
        long[][] memo = new long[n+1][n+1];
        for(int i=0 ;i<n; i++) {
            P p = list.get(i);
            for(int j=0; j<=i; j++) {
                int lpos = j;
                int rpos = n-1-(i-j);
                memo[i+1][j] = Math.max(memo[i+1][j], memo[i][j] + Math.abs(rpos-p.pos) * p.num);
                memo[i+1][j+1] = Math.max(memo[i+1][j+1], memo[i][j] + Math.abs(lpos-p.pos) * p.num);
            }
        }
        long res = 0;
        for(int i=0 ;i<=n; i++) {
            res = Math.max(res, memo[n][i]);
        }

        System.out.println(res);
    }

    static class P implements Comparable<P>{
        int pos;
        long num;
        P(int pos, long num) {
            this.pos = pos;
            this.num = num;
        }
        public int compareTo(P p) {
            return Long.compare(p.num, num);
        }


    }


}