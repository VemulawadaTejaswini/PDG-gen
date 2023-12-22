import java.util.*;

public class Main {

    static ArrayList<ArrayList<Integer>> a;
    static boolean[] used;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        a = new ArrayList<>();
        for(int i = 0; i < n; i++) a.add(new ArrayList<>());
        for (int i = 1; i < n; i++) {
            String s = sc.next();
            for (int j = 0; j < i; j++) {
                if(s.charAt(j) == '1') a.get(i).add(j);
                else a.get(j).add(i);
            }
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            used = new boolean[n];
            used[i] = true;
            int cnt = 0;
            cnt += dfs(i, 0, n-1);
            if(cnt == n-1) ans++;
        }
        System.out.println(ans);
        sc.close();

    }

    private static int dfs(int i, int l, int r) {
        int ret = 0;
        for(int v : a.get(i)){
            if(used[v]) continue;
            if(v < l || r < v) continue;
            ret++;
            used[v] = true;
            if(v < i) ret += dfs(v, l, i);
            else ret += dfs(v, i, r);
        }
        return ret;
    }

}
