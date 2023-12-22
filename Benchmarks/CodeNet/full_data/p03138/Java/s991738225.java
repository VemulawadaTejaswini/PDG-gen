import java.util.*;
import java.awt.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] $) {
        Scanner sc = new Scanner(in);
        int n=sc.nextInt();
        long k=sc.nextLong();
        long[] a=new long[n];
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextLong();
        }
        int c=0;
        while (k/2>0){
            k/=2;
            c++;
        }
        long p=power(2,c);
        if(p==1)p--;
        long ans=0;
        for (int i = 0; i < n; i++) {
            ans+=a[i]^p;
        }
        out.println(ans);
    }
    static long power(long x,int n){
        if(n==0)return 1;
        if(n%2==0){
            long e=power(x,n/2);
            return (e*e);
        }
        long e=(x*power(x,n-1));
        return e;
    }
}