import java.util.Scanner;

public class Main {
    static Scanner in;
    
    int n;
    int[] a;
    int ans = 0;

    void solve() {
        n = in.nextInt();
        a = new int[n];
        for(int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        dfs(0, 1);
        System.out.println(ans);
    }
    
    void dfs(int i, int sum) {
        if(i == n) {
            if(sum % 2 == 0) {
                ans++;
            }
            return;
        }
        for(int x = -1; x <= 1; x++) {
            dfs(i + 1, sum * (a[i] + x));
        }
    }

    public static void main(String[] args) {
        in = new Scanner(System.in);
        new Main().solve();
    }
}
