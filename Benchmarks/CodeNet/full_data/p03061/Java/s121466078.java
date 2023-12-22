import java.util.Scanner;

public class Main {
    static int maxn = (int)1e5 + 5;
    static int g[] = new int[maxn << 2];
    static int a[] = new int[maxn];

    static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    static void pushup(int o){
        g[o] = gcd(g[o << 1], g[o << 1 | 1]);
    }

    static void build(int o, int l, int r){
        if(l == r){
            g[o] = a[l];
            return;
        }
        int mid = l + r >> 1;
        build(o << 1, l, mid);
        build(o << 1 | 1, mid + 1, r);
        pushup(o);
    }

    static int query(int o, int tl, int tr, int l, int r){
        if(tl > r || tr < l) return 0;
        if(l <= tl && tr <= r) return g[o];
        int mid = tl + tr >> 1;
        return gcd(query(o << 1, tl, mid, l, r), query(o << 1 | 1, mid + 1, tr, l, r));
    }

    public static void main(String args[]){
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        for(int i = 1; i <= n; i++) a[i] = cin.nextInt();
        build(1, 1 , n);
        int res = Math.max(query(1, 1, n, 2, n), query(1, 1, n, 1, n - 1));
        for(int i = 2; i < n; i++){
            res = Math.max(res, gcd(query(1, 1, n, 1, i - 1), query(1, 1, n, i + 1, n)));
        }
        System.out.println(res);

    }

}