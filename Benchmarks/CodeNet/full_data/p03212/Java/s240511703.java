import java.util.*;
public class Main {
    static int ans = 0;
    static int n;
    public static void main(String[] args) {
        n = new Scanner(System.in).nextInt();
        dfs(0, 0);
        System.out.println(ans);
    }
    public static void dfs(long m, int check) {
        if (m > n) return;
        if (check == 0b111) ans++;
        dfs(10 * m + 3, check | 0b100);
        dfs(10 * m + 5, check | 0b010);
        dfs(10 * m + 7, check | 0b001);
    }
}