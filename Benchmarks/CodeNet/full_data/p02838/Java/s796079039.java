import java.util.*;

public class Main{

    static long gcd(long a,long b){
        if(b==0)return a;
        return gcd(b,a%b);
    }

    static long lcm(long a,long b){
        return a/gcd(a,b)*b;
    }
    public static void main(String[] srgs){
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        long[] c=new long[70];
        for(int i=0;i<n;i++){
            long a=sc.nextLong();
            int t=0;
            while(a>0){
                c[t]+=a%2;
                a/=2;
                t+=1;
            }
        }
        long out=0,MOD=1000000007,t=1;
        for(int i=0;i<70;i++){
            out+=c[i]*(n-c[i])%MOD*t%MOD;
            out%=MOD;
            t=t*2%MOD;
        }
        System.out.println(out);
    }
}
