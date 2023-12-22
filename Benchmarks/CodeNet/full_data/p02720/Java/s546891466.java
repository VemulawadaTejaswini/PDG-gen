import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int[] res = new int[20];
        long[] a = new long[1];
        int pos = 0;
        for(int i=1; i<=20; i++) {
            pos = dfs(i, 0, 0, pos, res, a, k);
            if(pos == k) {
                System.out.println(a[0]);
                return;
            }
        }
    }

    static int dfs(int n, int d, int prev, int pos, int[] res, long[] a, int k) {
        if(n == d) {
            //System.out.println(pos + 1 + "" + Arrays.toString(res));
            pos++;
            if(pos == k) {
                long q = 0;
                for(int i=0; i<n; i++) {
                    q *= 10;
                    q += res[i];
                }
                a[0] = q;
            }
            return pos;
        }
        if(d==0) {
            for(int i=1; i<=9; i++) {
                res[d] = i;
                pos = dfs(n, d+1, i, pos, res, a, k);
                if(pos == k) return pos;
            }
        } else {
            for(int i=Math.max(prev-1, 0); i<=Math.min(prev+1, 9); i++) {
                res[d] = i;
                pos = dfs(n, d+1, i, pos, res, a, k);
                if(pos == k) return pos;
            }
        }
        return pos;
    }

}