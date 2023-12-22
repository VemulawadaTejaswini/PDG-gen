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
        int n=sc.nextInt();
        int k=sc.nextInt();
        String s=sc.next();
        int c=s.charAt(0);
        int count=0;
        ArrayList<Integer> list=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if(s.charAt(i)==c){
                count++;
            }else {
                list.add(count);
                c=s.charAt(i);
                i--;
                count=0;
            }
        }
        if(count>0){
            list.add(count);
        }
        int[] a=new int[list.size()+1];
        count=1;
        for (Integer e:list){
            a[count++]=e;
        }
        int l=a.length;
        for (int i = 1; i < l; i++) {
            a[i]+=a[i-1];
        }
        int ans=0;
        if(s.charAt(0)=='0'){
            for (int i = 2;i + 2 * k < l; i+=2) {
                ans=max(ans,a[min(l-1,i+2*k)]-a[i-1]);
            }
            int t=0;
            ans=max(ans,a[2*k]-a[0]);
            if(l/2<=k)ans=n;
        }else {
            for (int i = 1; i+2*k<l; i+=2) {
                ans=max(ans,a[min(l-1,i+2*k)]-a[i-1]);
            }
            if((l-1)/2<=k)ans=n;
        }
        out.println(ans);
        out.close();
    }

    static PrintWriter out = new PrintWriter(System.out);

    static class sc     {
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