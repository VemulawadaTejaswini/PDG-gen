/*
String[]の初期化、整数の型がlongになっているか
関数（splitとかcontainsとか）内では"+"とかは正規表現となされるので"\\+"とする
配列のコピーはarr1=arr.clone()
HashSet<>[]はおのおの初期化した？？？？？
 */
import java.util.*;
import java.awt.*;
import java.awt.geom.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] $) {
        Scanner sc = new Scanner(in);
        int a=sc.nextInt(),b=sc.nextInt();
        int q=sc.nextInt();
        long[] s=new long[a];
        long[] t=new long[b];
        for (int i = 0; i < a; i++) {
            s[i]=sc.nextLong();
        }
        for (int i = 0; i < b; i++) {
            t[i]=sc.nextLong();
        }
        for (int i = 0; i < q; i++) {
            long x=sc.nextLong();
            int S=Arrays.binarySearch(s,x);
            int T=Arrays.binarySearch(t,x);
            if(S<0)S=~S;
            if(T<0)T=~T;
            if(S==0&&T==0){
                out.println(max(s[S]-x,t[T]-x));
            }else if(S==0){
                if(T==b){
                    out.println(s[S]-t[T-1]+min(x-t[T-1],s[S]-x));
                }else if(s[S]<=t[T]){
                    out.println(min(t[T]-x,s[S]-t[T-1]+min(abs(x-t[T-1]),abs(s[S]-x))));
                }else {
                    out.println(s[S]-x);
                }
            }else if (T==0){
                if(S==a){
                    out.println(t[T]-s[S]+min(t[T]-x,x-s[S-1]));
                }else if(t[T]<=s[S]){
                    out.println(min(s[S]-x,t[T]-s[S-1]+min(x-s[S],t[T]-x)));
                }else{
                    out.println(t[T]-x);
                }
            }else if(S==a&&T==b){
                out.println(max(x-t[T-1],x-s[S-1]));
            }else if(S==a){
                if(s[S-1]<=t[T-1]){
                    out.println(x-s[S-1]);
                }else {
                    out.println(min(x-t[T-1],t[T]-s[S-1]+min(t[T]-x,x-s[S-1])));
                }
            }else if(T==b){
                if(t[b-1]<=s[S-1]){
                    out.println(x-t[b-1]);
                }else {
                    out.println(min(abs(x-s[S-1]),abs(s[S]-t[T-1])+min(abs(s[S]-x),abs(x-t[T-1]))));
                }
            }else{
                long s1=s[S];
                long s2=s[S-1];
                long t1=t[T];
                long t2=t[T-1];
                long d1=abs(s1-x)+abs(t1-s1);
                long d2=abs(s1-x)+abs(t2-s1);
                long d3=abs(s2-x)+abs(t1-s1);
                long d4=abs(s2-x)+abs(t2-s2);
                out.println(min(min(d1,d2),min(d3,d4)));
            }
        }

    }
}