import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] p = new int[n];
        int[] a = new int[n+1];
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            p[i] = x;
            a[x] = i;
        }
        long ans = 0L;
        TreeSet<Integer> set = new TreeSet<>();
        set.add(a[n]);
        for (int i = n-1; i > 0 ; i--) {
            Integer l1, l2, r1, r2;
            l1 = set.lower(a[i]);
            r1 = set.higher(a[i]);
            if(l1 == null) l1 = -1;
            if(r1 == null) r1 = n;
            if(l1 == -1){
                l2 = -1;
            }else{
                l2 = set.lower(l1);
                if(l2 == null) l2 = -1;
            }
            if(r1 == n){
                r2 = n;
            }else{
                r2 = set.higher(r1);
                if(r2 == null) r2 = n;
            }
            ans += (long) i * ((l1 - l2)*(r1 - a[i]) + (a[i] - l1)*(r2 - r1));
            set.add(a[i]);
        }
        System.out.println(ans);
        sc.close();

    }

}
