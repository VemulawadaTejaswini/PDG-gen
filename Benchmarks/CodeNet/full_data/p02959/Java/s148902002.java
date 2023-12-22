import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n+1];
        long[] b = new long[n];
        for(int i = 0; i <= n; i++){
            a[i] = sc.nextLong();
            
        }
        for(int i = 0; i < n; i++){
            b[i] = sc.nextLong();
        }
        long ans = 0;
        for(int i = 0; i < n; i++){
            if(a[i] <= 0){
                if(a[i+1] <= b[i]){
                    ans += a[i+1];
                    a[i+1] = 0;
                }else{
                    ans += b[i];
                    a[i+1] -= b[i];
                }
            }else if(a[i] < b[i]){
                b[i] -= a[i];
                ans += a[i];
                if(a[i+1] <= b[i]){
                    ans += a[i+1];
                    a[i+1] = 0;
                }else{
                    ans += b[i];
                    a[i+1] -= b[i];
                }
            }else{
                ans += b[i];
            }
        }
        System.out.println(ans);
    }
}
