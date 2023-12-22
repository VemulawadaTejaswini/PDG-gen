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
//import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] $) {
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        int k=sc.nextInt();
        long[] a=new long[x];
        long[] b=new long[y];
        long[] c=new long[z];
        for (int i = 0; i < x; i++) {
            a[i]=sc.nextLong();
        }
        for (int i = 0; i < x; i++) {
            b[i]=sc.nextLong();
        }
        for (int i = 0; i < x; i++) {
            c[i]=sc.nextLong();
        }
        PriorityQueue<Long> q=new PriorityQueue<>(Comparator.reverseOrder());
        PriorityQueue<Long> pq=new PriorityQueue<>(Comparator.reverseOrder());
        PriorityQueue<Long> ans=new PriorityQueue<>(Comparator.reverseOrder());
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                q.add(a[i]+b[j]);
            }
        }
        if(k==x*y*z){
            for (Long l:q){
                for (int i = 0; i < z; i++) {
                    ans.add(c[i]+l);
                }
            }
        }else {
            Arrays.sort(c);
            while (pq.size()<k)pq.add(q.poll());
            for (Long l:pq){
                for (int i = 0; i < z; i++) {
                    ans.add(l+c[i]);
                }
            }
        }
        for (int i = 0; i <k; i++) {
            out.println(ans.poll());
        }
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