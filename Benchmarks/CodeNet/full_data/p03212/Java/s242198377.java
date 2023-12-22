import java.util.*;
import java.awt.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
    public static void main(String[]$){
        Scanner sc = new Scanner(in);
        int n=sc.nextInt();
        long k=0;
        if(n<357){
            out.println(0);
        }else{
            int order=2;
            for (int i = 178; i <= n/2; i++) {
                if(999<i*2+1&&i*2+1<10000)order=3;
                if(9999<i*2+1&&i*2+1<100000)order=4;
                if(99999<=i*2+1&&i*2+1<1000000)order=5;
                if(999999<i*2+1&&i*2+1<=10000000)order=6;
                if(9999999<i*2+1&&i*2+1<=100000000)order=7;
                if(99999999<i*2+1&&i*2+1<=1000000000)order=8;
                int ll=(i*2+1)%10;
                if(ll!=3&&ll!=5&&ll!=7)continue;
                int p=(i*2+1)/(int)power(10,order);/*
                out.println("i:"+i+" p:"+p+" ord:"+order);*/
                if(p!=3&&p!=5&&p!=7){
                //    out.println("i1"+i);
                    i=(min((p+1)*(int)power(10,order),n)-1)/2;
                  //  out.println("i2"+i);
                }
                int n3=0,n5=0,n7=0;
                int c=0;
                int t=i*2+1;
                while(t>0){
                    int l=t%10;
                    if(l==3)++n3;
                    if(l==5)++n5;
                    if(l==7)++n7;
                    t/=10;
                    ++c;
                }
                if(n3+n5+n7==c&&n3>0&&n5>0&&n7>0){
                    ++k;
                }
            }
            out.println(k);
            }
        }
    static long power(long x,int n){
        long mod=1000000007;
        long ans=1;
        while (n>0) {
            if((n&1)==1){
                ans=(ans*x)%mod;
            }
            x=(x*x)%mod;
            n>>=1;
        }
        return ans;
    }
    //最大公約数
    static int gcd (int a, int b) {
        int temp;
        while((temp = a%b)!=0) {
            a = b;
            b = temp;
        }
        return b;
    }
//※最小公倍数はa*b/gcd(a,b)である
}
