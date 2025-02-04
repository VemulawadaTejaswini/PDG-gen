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
        int m=sc.nextInt();
        long[] A=new long[n];
        for (int i = 0; i < n; i++) {
            A[i]=sc.nextLong();
        }
        pair[] p=new pair[m];
        for (int i = 0; i < m; i++) {
            p[i]=new pair(sc.nextLong(),sc.nextLong());
        }
        Arrays.sort(p,(o1,o2)->Long.compare(o2.y,o1.y));
        Arrays.sort(A);
        int left=0;
        int index=0;
        int b=0;
        while (left<n && index<m){
            if(A[left]<p[index].y){
                A[left]=p[index].y;
                left++;
                b++;
            }else {
                left++;
            }
            if(b==p[index].x){
                b=0;
                index++;
            }
            //out.println(Arrays.toString(A)+" "+index+" "+left);
        }
        long ans=0;
        for (int i = 0; i < n; i++) {
            ans+=A[i];
        }
        out.println(ans);
        out.close();
    }

    static class dice {
        int[] face = new int[6];

        dice(int top, int front) {
            HashSet<Integer> set =new HashSet<>();
            for (int i = 1; i < 7; i++) {
                set.add(i);
            }
            face[0] = top;
            set.remove(top);
            face[4] = front;
            set.remove(front);
            face[5] = 7 - top;
            set.remove(7 - top);
            face[1] = 7 - front;
            set.remove(7 - front);
            int smaller = 7;
            int larger = 0;
            for (Integer k : set) {
                smaller = min(k, smaller);
                larger = max(k, larger);
            }
            int f = face[4];
            int t = face[0];
            if (t == 1) {
                if (f == 2) {
                    face[2] = 4;
                } else if (f == 3) {
                    face[2] = 2;
                } else if (f == 4) {
                    face[2] = 5;
                } else {
                    face[2] = 3;
                }
            } else if (t == 2) {
                if (f == 1) face[2] = 3;
                else if (f == 3) face[2] = 6;
                else if (f == 4) face[2] = 1;
                else face[2] = 4;
            } else if (t == 3) {
                if (f == 1) face[2] = 5;
                else if (f == 2) face[2] = 1;
                else if (f == 5) face[2] = 6;
                else face[2] = 2;
            } else if (t == 4) {
                if (f == 1) face[2] = 2;
                else if (f == 2) face[2] = 6;
                else if (f == 5) face[2] = 1;
                else face[2] = 5;
            } else if (t == 5) {
                if (f == 1) face[2] = 4;
                else if (f == 3) face[2] = 1;
                else if (f == 4) face[2] = 6;
                else face[2] = 3;
            } else {
                if (f == 2) face[2] = 3;
                else if (f == 3) face[2] = 5;
                else if (f == 4) face[2] = 2;
                else face[2] = 4;
            }
            face[3] = 7 - face[2];
        }
    }

    static class pair {
        long x, y;

        pair(long a, long b) {
            x = a;
            y = b;
        }
    }

    //aはソート済みでなければならない！
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

    static long power(long x, long n) {
        if (n == 0) return 1;
        if (n % 2 == 0) {
            long e = power(x, n / 2);
            return (e * e) % mod;
        }
        return (x * power(x, n - 1)) % mod;
    }

    static long mod = (long) 1e9 + 7;

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
    static void WF(long[][] d, int[] a, int[] b, long[] c) {
        int n = d[0].length;
        long INF = 100000000000l;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                d[i][j] = d[j][i] = INF;
            }
        }
        int m = a.length;
        for (int i = 0; i < m; i++) {
            d[a[i]][b[i]] = d[b[i]][a[i]] = c[i];
        }
        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    d[i][j] = d[i][j] > d[i][k] + d[k][j] ? d[i][k] + d[k][j] : d[i][j];
                }
            }
        }
    }

    static class COM {
        static long[] fact;
        static long[] inv;

        static void Init(int n) {
            fact = new long[n];
            inv = new long[n];
            fact[0] = inv[0] = 1;
            for (int i = 1; i < n; i++) {
                fact[i] = (fact[i - 1] * i) % mod;
                inv[i] = power(fact[i], mod - 2);
            }
        }

        static long C(int n, int k) {
            if (k > n) return 0;
            return ((fact[n] * inv[n - k]) % mod * inv[k]) % mod;
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

    //Binary Indexed Tree
    //小さい値に更新することはできない
    static class BIT {
        static int N;
        static long[] bit;

        //初期化
        static void Init(int n) {
            N = n;
            bit = new long[n + 1];
        }

        //a番目にwを足す
        static void add(int a, long w) {
            for (int i = a; i <= N; i += i & -i) {
                bit[i] += w;
            }
        }

        //区間和
        static long sum(int a) {
            long ret = 0;
            for (int i = a; i > 0; i -= i & -i) {
                ret += bit[i];
            }
            return ret;
        }
    }

    static long gcd(long a, long b) {
        return a % b == 0 ? b : gcd(b, a % b);
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