import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n+1];
        long[] b = new long[n];
        for (int i = 0; i < n+1; i++) {
            a[i] = sc.nextLong();
        }
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextLong();
        }
        long ans = 0l;
        for (int i = 0; i < n/2 +1; i++) {
            if(b[i] <= a[i]){
                ans += b[i];
                a[i] -= b[i];
                b[i] = 0;
            }else{
                ans += a[i];
                b[i] -= a[i];
                a[i] = 0;
                if(b[i] <= a[i+1]){
                    ans += b[i];
                    a[i+1] -= b[i];
                    b[i] = 0;
                }else{
                    ans += a[i+1];
                    b[i] -= a[i+1];
                    a[i+1] = 0;
                }
            }
            if(i < n - 1 - i){
                if(b[n - 1 - i] <= a[n - i]){
                    ans += b[n - 1 - i];
                    a[i] -= b[n - 1 - i];
                    b[n - 1 - i] = 0;
                }else{
                    ans += a[n - i];
                    b[n - 1 - i] -= a[n - i];
                    a[n-i] = 0;
                    if(b[n - 1 - i] <= a[n - i - 1]){
                        ans += b[n - 1 - i];
                        a[n - i -1] -= b[n - 1 - i];
                        b[n - 1 - i] = 0;
                    }else{
                        ans += a[n-i-1];
                        b[n - 1 - i] -= a[n-i-1];
                        a[n-i-1] = 0;
                    }
                }
            }
        }

        System.out.println(ans);
        sc.close();

    }

}
