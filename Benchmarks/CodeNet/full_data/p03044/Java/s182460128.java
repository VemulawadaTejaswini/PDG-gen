
import java.util.*;

public class Main {



    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] tree = new int[n+1][n+1];
        int[] ans = new int[n+1];

        for(int i = 1;i <= n;i++){
            ans[i] = -1;
        }

        for(int i = 0; i < n-1;i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            int w = sc.nextInt();
            tree[u][v] = w;
            tree[v][u] = w;
        }


        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        ans[1] = 0;
        while(!stack.empty()) {
            int p = stack.pop();
            for (int i = 1; i <= n; i++) {
                if (tree[p][i] != 0) {
                    if(ans[i] == -1) {
                        if (tree[p][i] % 2 == 0) {
                            ans[i] = ans[p];
                        } else {
                            ans[i] = ans[p] == 1 ? 0 : 1;
                        }
                        stack.push(i);
                    }
                }
            }
        }
        for(int i = 1; i <= n;i++) {
            System.out.println(ans[i]);
        }
    }
}