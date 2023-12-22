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
import static java.lang.Math.*;
public class Main {
    public static void main(String[] $) {
        int n = sc.nextInt();
        long[] a = new long[n];
        int pos = 0, neg = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
            if (a[i] < 0) neg++;
            else if (a[i] > 0) pos++;
        }
        Arrays.sort(a);
        long[] x = new long[n - 1];
        long[] y = new long[n - 1];
        long m = 0;
        if (neg == 0) {
            for (int i = n - 1; i > 1; i--) {
                x[n - 1 - i] = a[0];
                y[n - 1 - i] = a[i];
                a[0] = a[0] - a[i];
            }
            x[n - 2] = a[1];
            y[n - 2] = a[0];
            m = a[1] - a[0];
        } else if(pos==0) {
            for (int i = 0; i < n - 1; i++) {
                x[i] = a[n - 1];
                y[i] = a[i];
                a[n-1]=x[i]-y[i];
            }
            m = a[n-1];
        }else {
            int c = 0;
            for (int i = neg; i < n - 1; i++) {
                x[c] = a[0];
                y[c] = a[i];
                a[0] = x[c] - y[c];
                c++;
            }
            for (int i = 0; i < neg; i++) {
                x[c] = a[n - 1];
                y[c] = a[i];
                a[n - 1] = a[n - 1] - a[i];
                c++;
            }
            m = a[n - 1];
        }
        out.println(m);
        for (int i = 0; i < n - 1; i++) {
            out.println(x[i] + " " + y[i]);
        }
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

        static boolean hasNextInt() {
            return s.hasNextInt();
        }

    }

}