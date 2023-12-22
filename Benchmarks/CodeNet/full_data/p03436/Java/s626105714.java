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
import java.util.*;
import java.io.*;
import java.awt.*;
import java.awt.geom.Point2D;
import static java.lang.Math.*;
public class Main {
    static int h,w;
    static char[][] s;
    static int[][] d;
    static int[] dr={0,-1,0,1};
    static int[] dc={-1,0,1,0};
    public static void main(String[] $) {
        h=sc.nextInt();
        w=sc.nextInt();
        s=new char[h][w];
        for (int i = 0; i < h; i++) {
            s[i]=sc.next().toCharArray();
        }
        d=new int[h][w];
        int black=0;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                d[i][j]=Integer.MAX_VALUE;
                if(s[i][j]=='#'){
                    black++;
                }
            }
        }
        dfs(1,0,0);
        int ans;
        if(d[h-1][w-1]==Integer.MAX_VALUE){
            ans=-1;
        }else {
            ans=h*w-d[h-1][w-1]-black;
        }
        out.println(ans);
        out.close();
    }

    static void dfs(int count,int row,int column){
        if(!(0<=row&&row<h&&0<=column&&column<w))return;
        if(s[row][column]=='#')return;
        if(count>d[row][column])return;
        if(count<d[row][column])d[row][column]=count;
        for (int i = 0; i < 4; i++) {
            dfs(count+1,row+dr[i],column+dc[i]);
        }
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