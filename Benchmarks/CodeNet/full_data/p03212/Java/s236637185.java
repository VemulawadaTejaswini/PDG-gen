import java.util.*;
import java.lang.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(dfs(n, 0));
    }
    static int dfs(int n, int s) {
        if (s > n) {
            return 0;
        } else {
            int count = 0;
            String ss = String.valueOf(s);
            if (ss.contains("3") && ss.contains("5") && ss.contains("7")) {
                count++;
            }
            count += dfs(n, s * 10 + 3) + dfs(n, s * 10 + 5) + dfs(n, s * 10 + 7);
            return count;
        }
    }
}