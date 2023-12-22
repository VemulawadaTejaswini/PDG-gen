/*
String[]の初期化、整数の型がlongになっているか
関数（splitとかcontainsとか）内では"+"とかは正規表現となされるので"\\+"とする
配列のコピーはarr1=arr.clone()
HashSet<>[]はおのおの初期化した？？？？？
負の数の割り算は絶対値が小さいほうに切り捨てられるex.-1/2=0ので、ある値>kみたいな式だとバグらせやすいので注意
ある値>=kとして、切り上げた値をとるべき
toLowerCase()はアルファベット以外に対して行ってもエラーにはならない
ArrayDequeではpopとpushはStackと同じ操作になる
*/
//入力終了→Ctrl+D
import java.util.*;
import java.awt.*;
import java.awt.geom.Point2D;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] $) {
        Scanner sc = new Scanner(in);
        int n=sc.nextInt(),m=sc.nextInt();
        Point[] p=new Point[n];
        for (int i = 0; i < n; i++) {
            int a=sc.nextInt(),b=sc.nextInt();
            p[i]=new Point(a,b);
        }
        Arrays.sort(p,(p1,p2)->p1.x-p2.x);
        int t=0;
        long ans=0;
        int i=0;
        while (t<m){
            t+=p[i].y;
            ans+=(long)p[i].x*(long)p[i].y;
            i++;
        }
        i--;
        if(t>m){
            ans-=(long) p[i].x*(long) (t-m);
        }
        out.println(ans);
    }
}