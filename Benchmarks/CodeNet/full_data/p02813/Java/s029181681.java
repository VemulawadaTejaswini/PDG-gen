import java.util.*;

public class Main {

    static List<Integer> list;
    static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int p=0, q=0;
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            p += x * Math.pow(10, n-i-1);
        }
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            q += x * Math.pow(10, n-i-1);
        }
        boolean[] used = new boolean[n+1];
        list = new ArrayList<>();
        dfs(0, 0, used);
        Integer[] a = list.toArray(new Integer[list.size()]);
        Arrays.sort(a);
        int pi=0, qi=0;
        for (int i = 0; i < a.length; i++) {
            if(a[i] == p) pi = i;
            if(a[i] == q) qi = i;
        }
        System.out.println(Math.abs(pi-qi));
        sc.close();

    }
    private static void dfs(int x, int d, boolean[] used) {
        if(d == n){
            list.add(x);
            return;
        }
        for (int i = 1; i <= n; i++) {
            if(used[i])continue;
            used[i] = true;
            dfs(x + i * (int)Math.pow(10, d), d+1, used);
            used[i] = false;
        }
    }

}
