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
*/
//入力終了→Ctrl+D
import java.util.*;
import java.io.*;
import java.awt.*;
import java.awt.geom.Point2D;
//import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] $) {
        int k=sc.nextInt(),s=sc.nextInt();
        int ans=0;
        int[] a=new int[3];
        HashSet<HashSet<Integer>> U=new HashSet<>();
        for (int x = 0; x < k + 1; x++) {
            for (int y = 0; y < k + 1 - x; y++) {
                int z=s-x-y;
                if(k>=z&&z>=0){
                    HashSet<Integer> u=new HashSet<>();
                    u.add(x);
                    u.add(y);
                    u.add(z);
                    U.add(u);
                }
            }
        }
        for (HashSet<Integer> u:U){
            if(u.size()==1)ans++;
            else if(u.size()==2)ans+=3;
            else ans+=6;
        }
        out.print(ans);
        out.close();
    }


    static PrintWriter out = new PrintWriter(System.out);

    static class sc {
        static Scanner s = new Scanner(System.in);

        static String next() {
            return s.next();
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
    }
}