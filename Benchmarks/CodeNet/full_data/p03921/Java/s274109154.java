import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        new Main().solve();
    }
    int n,m;
    int[]k;
    int[][]l;
    boolean[][]edge;
    boolean[] visited;
    void solve() {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        k = new int[n];
        l = new int[n][];

        for (int i = 0; i < n; i++) {
            k[i] = sc.nextInt();
            l[i] = new int[k[i]];
            for (int j = 0; j < k[i]; j++) {
                l[i][j] = Integer.parseInt(sc.next())-1;
            }
        }
        edge = new boolean[n+m][n+m];
        for(int i=0;i<n;i++) {
            for (int j = 0; j < k[i]; j++) {
                edge[i][(n - 1) + l[i][j]] = true;
                edge[(n - 1) + l[i][j]][i] = true;
            }
        }

        visited=new boolean[n+m];
        dfs(0);
        for(int i=0;i<n;i++){
            if(!visited[i]){
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }

    void dfs(int x) {
        visited[x] = true;
        for (int i = 0; i < n+m; i++) {
            if (!visited[i] && edge[x][i]) {
                dfs(i);
            }
        }
    }
}