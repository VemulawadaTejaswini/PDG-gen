import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }
        Arrays.sort(a);
        if(n == 3){
            long x = a[1] - a[0] + a[2] - a[0];
            long y = a[2] - a[1] + a[2] - a[0];
            System.out.println(Math.max(x, y));
            sc.close();
            return;
        }
        long[] b = new long[n];
        int h = (n+1)/2;
        for (int i = 0; i < h; i++) {
            int d = h-1;
            if(i % 2 == 0){
                d -= i;
            }else{
                d += i+1;
            }
            b[d] = a[i];
        }
        for (int i = 0; i < n/2; i++) {
            int d = h;
            if(i % 2 == 0){
                d += i;
            }else{
                d -=  i+1;
            }
            b[d] = a[n-1-i];
        }
        long ans = 0L;
        for (int i = 1; i < n; i++) {
            ans += Math.abs(b[i-1] - b[i]);
        }
        System.out.println(ans);
        sc.close();

    }

}
