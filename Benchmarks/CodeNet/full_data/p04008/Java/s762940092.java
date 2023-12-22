import java.util.*;

class Main {
    private static int K;
    private static Vector<Vector<Integer>> vec;
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        K = sc.nextInt();
        int[] a = new int[n];
        vec = new Vector<>();
        
        for (int i = 0; i < n; i++) {
            vec.add(new Vector<>());
        }
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt() - 1;
            if (i != 0) {
                (vec.get(a[i])).add(i);
            }
        }
        
        int ans = 0;
        if (a[0] != 0) {
            ans++;
            a[0] = 0;
        }
        ans += dfs(0, 0);
        
        System.out.println(ans);
    }
    private static int dfs(int i, int now){
        int memo = 0;
        
        if (now == K + 1) {
            memo++;
            now = 1;
        }
        for (int j = 0; j < (vec.get(i)).size(); j++) {
            memo += dfs((vec.get(i)).get(j), now+1);
        }
        return memo;
    }
}