import java.util.*;
import java.io.*;
import java.math.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long[] p = new long[n+1];
        long[] ruip = new long[n+1];
        for(int i = 1; i <= n; i++){
            p[i] = sc.nextLong();
            ruip[i] += p[i] + ruip[i-1];  
        }
        long tmp = 0;
        int index = 0;
        for(int i = k; i <= n; i++){
            if(tmp < ruip[i] - ruip[i-k]){
                tmp = ruip[i] - ruip[i-k];
                index = i;
            }
        }
        double ans = 0;
        for(int i = index; i >= index-(k-1); i--){
            ans += calc(p[i]);
        }
        System.out.println(ans);
    }

    public static double calc(long a){
        return 1+(a-1)*0.5;
    }
}