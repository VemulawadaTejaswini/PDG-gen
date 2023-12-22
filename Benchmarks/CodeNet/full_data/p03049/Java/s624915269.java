/*
String[]の初期化、整数の型がlongになっているか
関数（splitとかcontainsとか）内では"+"とかは正規表現となされるので"\\+"とする
配列のコピーはarr1=arr.clone()
HashSet<>[]はおのおの初期化した？？？？？
負の数の割り算は絶対値が小さいほうに切り捨てられるex.-1/2=0ので、ある値>kみたいな式だとバグらせやすいので注意
ある値>=kとして、切り上げた値をとるべき
toLowerCase()はアルファベット以外に対して行ってもエラーにはならない
ArrayDequeではpopとpushはStackと同じ操作になる
//import static java.lang.System.*; はしばらく使わなそう(使うとしてもexit(0)のためだけ)←return;でよさそう
最後にout.flush()またはout.close()をするのを忘れずに！
Point2D p2d=new Point2D.Double(d1,d2);
//import static java.lang.System.*;
*/
//入力終了→Ctrl+D
import java.lang.reflect.Array;
import java.net.Inet4Address;
import java.util.*;
import java.io.*;
import java.awt.*;
import java.awt.geom.Point2D;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] $) {
        int n=sc.nextInt();
        String[] s=new String[n];
        int ab=0,a=0,b=0,c=0;
        for (int i = 0; i < n; i++) {
            s[i]=sc.next();
            int len=s[i].length();
            if(s[i].charAt(len-1)!='A'&&s[i].charAt(0)=='B')b++;
            if(s[i].charAt(len-1)=='A'&&s[i].charAt(0)!='B')a++;
            if(s[i].charAt(0)=='B'&&s[i].charAt(len-1)=='A')c++;
            for (int j = 0; j < len-1; j++) {
                if(s[i].substring(j,j+2).equals("AB"))ab++;
            }
        }
        long ans=ab;
        if(a>b){
            ans+=b+c;
        }else if(a<b){
            ans+=a+c;
        }else {
            ans+=a;
            if(a>=c)ans+=c;
            else ans+=c-1;
        }
        out.println(ans);
        out.close();
    }

    static PrintWriter out = new PrintWriter(System.out);

    static class sc {
        static Scanner s = new Scanner(System.in);

        static String next() {
            return s.next();
        }

        static String nextLine() {
            return s.nextLine();
        }

        static int nextInt() {
            return Integer.parseInt(s.next());
        }

        static long nextLong() {
            return Long.parseLong(s.next());
        }

        static double nextDouble() {
            return Double.parseDouble(s.next());
        }

        static boolean hasNext() {
            return s.hasNext();
        }
    }
}