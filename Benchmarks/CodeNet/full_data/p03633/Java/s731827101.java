import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long[] t=new long [n];int i;long max_GCD;
        for(i=0;i<n;i++){
            t[i]=sc.nextLong();
        }
        System.out.println(max_gcd(t));
    }

    static long gcd(long a,long b){
        long x,tmp,ans,r;
          x = a * b;
           if(a<b){
            tmp = a;
            a = b;
            b = tmp;
            }
            r = a % b;
         while(r!=0){
            a = b;
            b = r;
            r = a % b;
         }
         ans=(long)x/b;
         return ans;
    }
    static long max_gcd(long[] x){
        int i;
        int len=x.length;
        long s=gcd(x[0],x[1]);
        for(i=2;i<len;i++){
            s=gcd(x[i],s);
        }
        return s;
    }
}