import java.util.*;
import static java.lang.System.*;
public class Main {
    public static void main(String[] $) {
        Scanner sc = new Scanner(in);
        int n=sc.nextInt();
        long x=sc.nextLong();
        long[] a=new long[51];
        a[0]=1;
        long[] p=new long[51];
        p[0]=1;
        for (int i = 0; i < 50; i++) {
            a[i+1]=2*a[i]+3;
            p[i+1]=2*p[i]+1;
        }
        out.println(f(a,p,n,x));
    }
    static long f(long[] a,long[] p,int n,long x){
        if(x==1)return 0;
        else if(1<x&&x<=a[n-1]+1)return f(a,p,n-1,x-1);
        else if(x==a[n-1]+2)return p[n-1]+1;
        else if(a[n-1]+2<x&&x<=a[n]-1)return p[n-1]+1+f(a,p,n-1,x-a[n-1]-2);
        else return p[n];
    }
}