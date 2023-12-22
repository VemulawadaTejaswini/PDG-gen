import java.util.*;

public class Main {
    static boolean canPass[][];
    static boolean visited[];
    static int n;
    
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int m = sc.nextInt();
        int[] p = new int[m];
        int[] q = new int[m];
        canPass = new boolean[n][n];
        visited = new boolean[n];
        
        for (int i = 0; i < m; i++) {
            p[i] = sc.nextInt() - 1;
            q[i] = sc.nextInt() - 1;
            canPass[p[i]][q[i]] = true;
            canPass[q[i]][p[i]] = true;
        }
        
        int count = 0;
        for (int i = 0; i < m; i++) {
            Arrays.fill(visited, false);
            
            // i番目の辺を通行止めにする
            canPass[p[i]][q[i]] = false;
            canPass[q[i]][p[i]] = false;

            dfs(0);
            
            // System.out.println(Arrays.toString(visited));
            // if (Arrays.asList(visited).contains(false)) {
            //     count++;
            // }
            
            boolean connected = true;
            for (int j = 0; j < n; j++) {
                if (!visited[j]) {
                    connected = false;
                    break;
                }
            }
            if (!connected) {
                count++;
            }
            
            canPass[p[i]][q[i]] = true;
            canPass[q[i]][p[i]] = true;

        }
        System.out.println(count);

    }
    public static void dfs(int p) {
        if (visited[p]) return;
        
        visited[p] = true;
        for (int q = 0; q < n; q++) {
            if (canPass[p][q]) {
                dfs(q);
            }
        }
    }
}
