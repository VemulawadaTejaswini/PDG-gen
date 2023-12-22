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
        int n = sc.nextInt();
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i <= n; i+=6) {
            int six=i;
            int nine=n-six-(n-six)%9;
            if(six+nine<=n)ans=min(ans,count(six,6)+count(nine,9)+n-six-nine);
        }
        out.println(ans);
    }
    static int count(int n,int p){
        int c=0;
        while (n>0){
            c+=n%p;
            n/=p;
        }
        return c;
    }
}