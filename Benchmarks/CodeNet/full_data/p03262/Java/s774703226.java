import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long X = sc.nextLong();
        long[] x = new long[n+1];
        long[] y = new long[n+1];
        x[0] = 0;
        y[0] = 0;
        for(int i=1; i<=n; i++){
            x[i] = sc.nextLong();
            y[i] = Math.abs(X - x[i]);
        }
        long min = y[1];
        for(int i=1; i<n; i++){
            if(min>y[i+1]){
                min = y[i+1];
            }
        }
        long ans = min;
        for(int i=1; i<=n; i++){
            if((y[i]%min)!=0L){
                ans = 1L;
                break;
            }
        }
        System.out.println(ans);
    }
}