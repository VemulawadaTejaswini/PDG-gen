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
/*
3 2
1 3
3 2
1 1
1 1
 */
public class Main {
    static ArrayList<Integer>[] g;
    public static void main(String[] $) {
        int n=sc.nextInt();
        int q=sc.nextInt();
        g=new ArrayList[n];
        for (int i = 0; i < n; i++) {
            g[i]=new ArrayList<>();
        }
        for (int i = 0; i < n-1; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            g[b].add(a);
            g[a].add(b);
        }
        long[] count=new long[n];
        for (int i = 0; i < q; i++) {
            int p=sc.nextInt()-1;
            int x=sc.nextInt();
            count[p]+=x;
        }
        dfs(count,0,0);
        for (int i = 0; i < n; i++) {
            out.print(count[i]);
            if(i==n-1)out.println();
            else out.print(" ");
        }
        out.close();
    }

    static void dfs(long[] c,int before,int now) {
        //out.println("now="+now);
        for (Integer child : g[now]) {
            if(child==before)continue;
            c[child]+=c[now];
            dfs(c,now,child);
        }
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
    static void WF(double[][] d,int kappa,int lambda) {
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