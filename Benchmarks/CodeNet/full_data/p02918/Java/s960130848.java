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
参照型の比較するときはプリミティブ型にキャストするか.compare,.equalsを使う！
ex.map.get(0)=100,map.get(1)=100でもmap.get(0)==map.get(1)がfalseになりうる
*/
//入力終了→Ctrl+D
import java.io.*;
import java.awt.*;
import java.util.*;
import java.awt.geom.*;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] $) {
        int n = sc.nextInt();
        int k = sc.nextInt();
        String s = sc.next();
        int[] a=new int[n+1];
        a[0]=1;
        int score = 0;
        for (int i = 0; i < n - 1; i++) {
            a[i+1]=1;
            if (s.charAt(i) == 'R' && s.charAt(i + 1) == 'R') {
                score++;
                a[i+1]+=a[i];
            }
            if (s.charAt(i) == 'L' && s.charAt(i + 1) == 'L') {
                score++;
                a[i+1]+=a[i];
            }
        }
        ArrayList<Character> list=new ArrayList<>();
        a[n]=0;
        for (int i = 0; i < n; i++) {
            if (a[i]>=a[i+1]){
                list.add(s.charAt(i));
            }
        }
        //out.println(list);
        int m=list.size();
        int d1r=0,d1l=0,d2r=0,d2l=0;
        n=list.size();
        if (n<=2){
            out.println(s.length()-1);
            out.flush();
            System.exit(0);
        }
        if (list.get(0)=='R'&&list.get(n-1)=='R'){
            //Rにそろえる
            d2r=list.size()/2;
            //Lにそろえる
            d1l=2;
            d2l=(list.size()-3)/2;
        }else if (list.get(0)=='R'&&list.get(n-1)=='L'){
            //Rにそろえる
            d1r=1;
            d2r=(list.size()-1)/2;
            //Lにそろえる
            d1l=1;
            d2l=list.size()/2-1;
        }else if (list.get(0)=='L'&&list.get(n-1)=='L'){
            //Rにそろえる
            d1r=2;
            d2r=(list.size()-3)/2;
            //Lにそろえる
            d2l=list.size()/2;
        }else {
            //Rにそろえる
            d1r=1;
            d2r=list.size()/2-1;
            //Lにそろえる
            d1l=1;
            d2l=list.size()/2-1;
        }
        //out.println(d1l+" "+d2l+" "+d1r+" "+d2r);
        int resL=0,resR=0;
        int tL=k,tR=k;
        resL=score+min(d2l,tL)*2;
        tL-=min(d2l,tL);
        resL+=tL*d1l;
        resR=score+min(d2r,tR)*2;
        tR-=min(d2r,tR);
        resR+=tR*d1r;
        out.println(max(resL,resR));
        out.close();
    }

    static boolean nextPermutation(int[] a) {
        int t = a.length - 1;
        int tt = t + 1;
        for (int i = t; i > 0; --i) {
            if (a[i - 1] < a[i]) {
                int swapIndex = Find(a[i - 1], a, i, t);
                int temp = a[swapIndex];
                a[swapIndex] = a[i - 1];
                a[i - 1] = temp;
                Arrays.sort(a, i, tt);
                return true;
            }
        }
        return false;
    }

    static int Find(int dest, int[] a, int s, int e) {
        if (s == e) {
            return s;
        }
        int m = (s + e + 1) / 2;
        return a[m] <= dest ? Find(dest, a, s, m - 1) : Find(dest, a, m, e);
    }

    static long gcd(long a, long b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    //クラスカル法(0-indexed) n頂点m辺
    static HashSet<Integer> Kruskal(int[] u, int[] v, long[] cost, int n) {
        int m = u.length;
        UF.Init(n);
        PriorityQueue<Integer> S = new PriorityQueue<>((p1, p2) -> Long.compare(cost[p1], cost[p2]));
        for (int i = 0; i < m; i++) {
            S.add(i);
        }
        //最小全域木をなす辺
        HashSet<Integer> F = new HashSet<>();
        while (!S.isEmpty()) {
            int e = S.poll();
            if (!UF.same(u[e], v[e])) {
                F.add(e);
                UF.unite(u[e], v[e]);
            }
        }
        return F;
    }

    //ワーシャルフロイド(0-indexed)
    static void WF(double[][] d, int kappa, int lambda) {
        int n = kappa + lambda;
        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (d[i][k] != -1 && d[k][j] != -1) {
                        d[i][j] = d[i][j] > d[i][k] + d[k][j] ? d[i][k] + d[k][j] : d[i][j];
                    }
                }
            }
        }
    }

    //Union Find木(0-indexed)
    static class UF {
        static int[] d;

        static void Init(int size) {
            d = new int[size];
            for (int i = 0; i < size; i++) {
                d[i] = -1;
            }
        }

        static boolean unite(int x, int y) {
            x = find(x);
            y = find(y);
            if (x == y) return false;
            if (d[x] > d[y]) {
                int t = d[y];
                d[y] = d[x];
                d[x] = t;
            }
            d[x] += d[y];
            d[y] = x;
            return true;
        }

        static boolean same(int x, int y) {
            return find(x) == find(y);
        }

        static int find(int k) {
            return d[k] < 0 ? k : (d[k] = find(d[k]));
        }

        static int size(int k) {
            return -d[find(k)];
        }
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