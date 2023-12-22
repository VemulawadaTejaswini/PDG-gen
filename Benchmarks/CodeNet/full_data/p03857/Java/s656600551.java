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
*/
//入力終了→Ctrl+D
import java.util.*;
import java.io.*;
import java.awt.*;
import java.awt.geom.Point2D;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] $) {
        int n = sc.nextInt(),k=sc.nextInt(),l=sc.nextInt();
        HashMap<Point,Integer> map=new HashMap<>();
        for (int i = 0; i < k + l; i++) {
            Point p=new Point(sc.nextInt(),sc.nextInt());
            map.put(p,map.getOrDefault(p,0)+1);
        }
        int[] ans=new int[n+1];
        for (Point p:map.keySet()){
            if(map.get(p)==2){
                ans[p.x]++;
                ans[p.y]++;
            }
        }
        for (int i = 1; i < n + 1; i++) {
            out.print(ans[i]+1);
            if(i!=n)out.print(" ");
        }
        out.println();
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