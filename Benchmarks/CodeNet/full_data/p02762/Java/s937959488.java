import java.io.*;
import java.util.*;

public class Main {
    static PrintWriter out = new PrintWriter(System.out);
    static Scanner sc = new Scanner(System.in);
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int[] id, size;
    long mod = 1000000000+7;
    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.solve();
//        System.out.println(main.solve());
    }
    void solve() throws IOException {
        int n = sc.nextInt(), m = sc.nextInt(), k = sc.nextInt();
        id = new int[n+1]; size = new int[n+1];
        for(int i=1;i<=n;i++) id[i] = i;
        Arrays.fill(size,1);
        List<Integer>[] block = new List[n+1];
        for(int i=0;i<=n;i++) block[i] = new ArrayList<>();
        int[] friends = new int[n+1];
        for(int _i=0;_i<m;_i++){
            int a = sc.nextInt(), b = sc.nextInt();
            friends[a] += 1; friends[b] += 1;
            union(a,b);
        }
        for(int _i=0; _i<k; _i++){
            int c = sc.nextInt(), d = sc.nextInt();
            block[c].add(d); block[d].add(c);
        }
        for(int i=1;i<=n;i++){
            int root = find(i);
            int base= size[root]-1; // -1 is self
            base -= friends[i];
            for(int a:block[i]){
                int p = find(a);
                if(p==root) base -= 1;
            }
            out.print(base); out.print(" ");
        }
        out.flush();
    }
    int find(int p){
        while(id[p]!=p){
            id[p] = id[id[p]];
            p = id[p];
        }
        return p;
    }
    void union(int p, int q){
        int i = find(p), j = find(q);
        if(i==j) return;
        id[j] = i;
        size[i] += size[j];
    }


}

