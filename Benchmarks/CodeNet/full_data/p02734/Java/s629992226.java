import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int s = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i <n ; i++) {
            a[i] = sc.nextInt();
        }

        long res = 0;
        long mod = 998244353;

        for(int l=0; l<n; l++) {
            if(a[l] == s) {
                res += (l+1) * (n-l);
                res %= mod;
                continue;
            }
            if(a[l] > s) continue;
            int ub = s - a[l];
            int[] b = new int[ub];
            b[0] = 1;
            for(int r = l+1; r<n; r++) {
                if(ub - a[r] >= 0) {
                    res += b[ub-a[r]] * (l+1) * (n-r);
                    res %= mod;
                }
                int[] next = new int[ub];
                for(int i=0; i<ub; i++) {
                    next[i] += b[i];
                    if(i+a[r] < ub) {
                        next[i+a[r]] += b[i];
                    }
                }
                b = next;
            }
        }
        System.out.println(res);
    }

}