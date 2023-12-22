
import java.util.*;

public class Main {
    int n;
    void run() {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        dfs(1, 'a', "a");
    }

    void dfs(int i, char c, String s) {
        if (i == n) {
            System.out.println(s);
            return;
        }
        if (c != 'a') dfs(i + 1, (char)((int)c - 1), s + (char)((int)c - 1));
        dfs(i + 1, (char)((int)c), s + c);
        dfs(i + 1, (char)((int)c + 1), s + (char)((int)c + 1));
    }

    void debug(Object... os) {
        System.err.println(Arrays.deepToString(os));
    }

    public static void main(String[] args) {
        new Main().run();
    }
}
