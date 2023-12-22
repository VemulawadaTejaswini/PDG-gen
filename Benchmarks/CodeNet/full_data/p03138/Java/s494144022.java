/*
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
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }
        long[] f=new long[(int)k+1];
        for (int i = 0; i <= k; i++) {
            out.println(i);
            for (int j = 0; j < n; j++) {
                f[i]+=i^a[j];
                out.print((i^a[j])+" ");
            }
            out.println();
        }
        for (long g:f)out.println(g);
        for (int i = 0; i < n; i++) {
            out.println(Long.toString(a[i],2));
        }
    }
}
*/
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
        long ans=0;
        for (int i = 0; i <= c; i++) {
            long p=i!=0?power(2,i):0;
            long sum=0;
            for (int j = 0; j < n; j++) {
                sum+=a[j]^p;
            }
            ans=max(ans,sum);
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