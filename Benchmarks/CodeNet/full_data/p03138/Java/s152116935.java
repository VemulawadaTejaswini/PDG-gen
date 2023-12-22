import java.util.*;
import java.awt.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] $) {
        Scanner sc = new Scanner(in);
        int n = sc.nextInt();
        long k = sc.nextLong();
        long[] a = new long[n];
        int[][] bit = new int[n][40];
        int[] bitK=new int[40];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }
        for (int i = 0; i < n; i++) {
            int c=0;
            while (a[i]>0) {
                bit[i][c++]=(int)a[i]%2;
                a[i]/=2;
            }
        }
        int c=0;
        long t=k;
        while (t>0){
            bitK[c++]=(int)t%2;
            t/=2;
        }
        long[] cnt=new long[40];
        for (int i = 0; i < 40; i++) {
            for (int j = 0; j < n; j++) {
                cnt[i]+=bit[j][i];
            }
        }
      
        long ans=0;
        long temp=0;
        for (int l = 39 ; l >= 0 ; l--) {
            if(bitK[l]==1){
                ans=max(ans,temp+power(2,l)*cnt[l]+greedy(cnt,l-1,n));
                temp+=power(2,l)*(n-cnt[l]);
            }else {
                temp+=power(2,l)*cnt[l];
            }
        }

         ans=max(ans,temp);
         out.println(ans);
    }
    static long greedy(long[] cnt,int i,int n){
        if(i<0)return 0;
        long t=0;
        for (int j = i; j >= 0; j--) {
            if(cnt[j]>n-cnt[j]){
                t+=cnt[j]*power(2,j);
            }else {
                t+=(n-cnt[j])*power(2,j);
            }
        }
        return t;
    }
    static long power(long x,int n){
        if(n==0)return 1;
        else if(n%2==0){
            long e=power(x,n/2);
            return e*e;
        }else {
            return x*power(x,n-1);
        }
    }
}