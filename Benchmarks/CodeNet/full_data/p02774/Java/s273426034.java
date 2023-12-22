import java.util.*;

public class Main {

    static long[] a;
    static int n;
    static int minus,plus;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        long k = sc.nextLong();
         a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
            if(a[i] < 0) minus++;
            else plus++;
        }
        Arrays.sort(a);
        long l = (long)-Math.pow(10, 18)-1;
        long r = (long)Math.pow(10, 18) + 1;
        while(1 < r-l){
            long m = (r+l)/2;
            long c = cnt(m);
            if(c < k) l = m;
            else r = m;
        }
        System.out.println(l);
        sc.close();

    }

    private static long cnt(long m) {
        long ret = 0;
        for (int i = 0; i < n; i++) {
            long x = a[i];
            if(x < 0){
                int l = -1;
                int r = n-1;
                while(1 < r-l){
                    int mid = (r+l)/2;
                    if(x * a[mid] < m) r = mid;
                    else l = mid;
                }
                int tmp = n-r;
                if(x * x < m) tmp -= 1;
                ret += tmp;
            }else{
                int l = 0;
                int r = n;
                while(1 < r-l){
                    int mid = (r+l)/2;
                    if(x * a[mid] < m) l = mid;
                    else r = mid;
                }
                int tmp = r;
                if(x * x < m) tmp -= 1;
                ret += tmp;
            }
        }
        return ret/2;
    }

}
