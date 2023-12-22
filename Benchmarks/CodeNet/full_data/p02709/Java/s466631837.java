import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }
        int l = 0, r = n-1;
        long ans =0L;
        for (int i = 0; i < n; i++) {
            long t = 0L;
            int ti = 0;
            int tl = l, tr = r;
            for (int j = 0; j < n; j++) {
                if(a[j] < 0)continue;
                long tt = Math.max(Math.abs(l-j), Math.abs(r-j));
                if(t < tt*a[j]){
                    t = tt*a[j];
                    ti = j;
                    if(Math.abs(l-j) < Math.abs(r-j)) {
                        tr = r-1; tl = l;
                    }else{
                        tl = l+1; tr = r;
                    }
                }
            }
            ans += t;
            a[ti] = -1;
            l = tl; r = tr;
        }
        System.out.println(ans);
        sc.close();

    }

}
