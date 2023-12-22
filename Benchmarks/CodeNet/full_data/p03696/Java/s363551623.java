//D - Insertion:)=-1,(=+1で累積和　一番左の+の数だけ右に),一番右の-の絶対値の数だけ左に(をつければよい
/*
String[]の初期化、整数の型がlongになっているか
関数（splitとかcontainsとか）内では"+"とかは正規表現となされるので"\\+"とする
配列のコピーはarr1=arr.clone()
HashSet<>[]はおのおの初期化した？？？？？
負の数の割り算は絶対値が小さいほうに切り捨てられるex.-1/2=0ので、ある値>kみたいな式だとバグらせやすいので注意
ある値>=kとして、切り上げた値をとるべき
toLowerCase()はアルファベット以外に対して行ってもエラーにはならない
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
        int n=sc.nextInt();
        int[] c=new int[n+1];
        String s=sc.next();
        String ans="";
        String t="";
        for (int i = 0; i < n; i++) {
            char a=s.charAt(i);
            ans=ans+a;
            if(a=='(')c[i+1]=c[i]+1;
            else c[i+1]=c[i]-1;
            if(c[i+1]<0){
                ans="("+ans;
                c[i+1]++;
            }else if(c[i+1]>1){
                t+=")";
                c[i+1]--;
            }
        }
        if(c[n]>0){
            ans+=")";
        }
        out.println(ans+t);
    }
}