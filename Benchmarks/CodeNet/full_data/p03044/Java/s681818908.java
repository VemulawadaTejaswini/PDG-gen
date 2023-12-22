import java.util.*;
class Point {
    int u, v, w;
    public Point(int u, int v, int w) {
        this.u = u;
        this.v = v;
        this.w = w;
    }
}
class Main {
    static Point[] P;
    static int[] iv;
    static int N;
    static int[] reached;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        P = new Point[(N-1)*2];
        iv = new int[N+1];
        reached = new int[N+1];
        for(int i = 0; i<N-1; i++) {
            int u = Integer.parseInt(sc.next());
            int v = Integer.parseInt(sc.next());
            int w = Integer.parseInt(sc.next());
            P[i] = new Point(u,v,w);
            P[i+N-1] = new Point(v,u,w);
        }
        dfs(P[0].u,0);
        for(int i = 1; i<=N; i++) System.out.println(iv[i]);
    }
    public static void dfs(int current, int len) {
        if(reached[current]==1) return;
        else reached[current] = 1;
        if(len%2 == 0) iv[current] = 0;
        else iv[current] = 1;

        for(int i = 0; i<(N-1)*2; i++) { // にぶたんしたい
            if(P[i].u == current) dfs(P[i].v, len+P[i].w);
        }
    }
}