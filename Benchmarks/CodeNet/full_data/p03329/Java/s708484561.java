/*
文字列の配列の初期化、整数の型がlongになっているか
関数（splitとかcontainsとか）内では"+"とかは正規表現となされるので"\\+"とする
配列のコピーはarr1=arr.clone()
HashSet<>[]はおのおの初期化した？？？？？
 */
import java.lang.reflect.Array;
import java.util.*;
import java.awt.*;
import java.awt.geom.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] $) {
        Scanner sc = new Scanner(in);
        int n = sc.nextInt();
        int ans=Integer.MAX_VALUE;
        int s1=n/6,s2=n/9;
        for (int i = 0; i <= s1; i++) {
            for (int j = 0; j <= s2; j++) {
                int six=6*i;
                int nine=9*j;
                if(i*6+j*9<=n){
                    int ts=0,tn=0;
                    while (six/6>0){
                        ts+=six%6;
                        six/=6;
                    }
                    ts+=six%9;
                    while (nine/9>0){
                        tn+=nine%9;
                        nine/=9;
                    }
                    tn+=nine%9;
                    ans=min(ans,ts+tn+n-6*i-9*j);
                }
            }
        }
        out.println(ans);
    }
    static int exp(int x,int n){
        if(n==0)return 1;
        if(n%2==0)return exp(x,n/2)*exp(x,n/2);
        else return x*exp(x,n-1);
    }
    static int get(int a,int b){
        int c=0;
        while (a/b>0){
            a/=b;
            c++;
        }
        return c;
    }
}