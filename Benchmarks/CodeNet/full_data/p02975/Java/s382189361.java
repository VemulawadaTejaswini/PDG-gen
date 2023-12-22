/*
String[]の初期化、整数の型がlongになっているか
関数（splitとかcontainsとか）内では"+"とかは正規表現となされるので"\\+"とする
'+'とかは問題ない
配列のコピーはarr1=arr.clone()
HashSet<>[]はおのおの初期化した？？？？？
負の数の割り算は絶対値が小さいほうに切り捨てられるex.-1/2=0ので、ある値>kみたいな式だとバグらせやすいので注意
ある値>=kとして、切り上げた値をとるべき
toLowerCase()はアルファベット以外に対して行ってもエラーにはならない
ArrayDequeではpopとpushはStackと同じ操作になる
//import static java.lang.System.*; はしばらく使わなそう(使うとしてもexit(0)のためだけ)←return;でよさそう
最後にout.flush()またはout.close()をするのを忘れずに！
Point2D p2d=new Point2D.Double(d1,d2);
Line2D l2d=new Line2D.Double(x1,y1,x2,y2);
Line2D l2d_0=new Line2D.Double(x11,y11,x22,y22);
if(l2d.intersectsLine(l2d_0))
next_Permutationを使うときはソート済み配列かどうか確認！！
*/
//入力終了→Ctrl+D
import java.io.*;
import java.awt.*;
import java.lang.reflect.Array;
import java.util.*;
import java.awt.geom.*;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] $) {
        int n=sc.nextInt();
        int[] a=new int[n];
        String[] bit=new String[n];
        int z=0;
        int lenmax=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
            map.put(a[i],map.getOrDefault(a[i],0)+1);
            int t=a[i];
            int c=0;
            if(t==0)z++;
            bit[i]=Integer.toString(a[i],2);
            lenmax=max(bit[i].length(),lenmax);
        }
        int[][] bitarr=new int[n][lenmax];
        for (int i = 0; i < n; i++) {
            int t=a[i];
            int c=lenmax-1;
            while (t>0){
                bitarr[i][c]=t%2;
                t/=2;
                c--;
            }
        }
        String ans="No";
        if(z==n){
            ans="Yes";
        }else if(map.size()==3) {
            int[] key = new int[3];
            int counter = 0;
            int x = 0;
            for (Integer k : map.keySet()) {
                x ^= k;
                key[counter] = k;
                counter++;
            }
            if (x == 0 && map.get(key[0]) == map.get(key[1]) && map.get(key[1]) == map.get(key[2]) && map.get(key[2]) == map.get(key[0])) {
                ans = "Yes";
            }
        }else if(map.size()==2&&map.get(0)*2==n-map.get(0)) {
            ans="Yes";
        }
        out.println(ans);
        out.close();
    }

    static PrintWriter out = new PrintWriter(System.out);

    static class sc {
        static Scanner scanner = new Scanner(System.in);

        static String next() {
            return scanner.next();
        }

        static String nextLine() {
            return scanner.nextLine();
        }

        static int nextInt() {
            return Integer.parseInt(scanner.next());
        }

        static long nextLong() {
            return Long.parseLong(scanner.next());
        }

        static double nextDouble() {
            return Double.parseDouble(scanner.next());
        }

        static boolean hasNext() {
            return scanner.hasNext();
        }

        static boolean hasNextInt() {
            return scanner.hasNextInt();
        }

        static boolean hasNext(String str) {
            return scanner.hasNext(str);
        }
    }

}