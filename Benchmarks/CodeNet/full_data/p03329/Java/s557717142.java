import java.util.Scanner;

public class Main {

    private static int dfs(int n, int cnt) {
        if (n < 6) {
            return cnt + n;
        }
        int i = 1;
        while (i * 6 <= n) {
            i *= 6;
        }
        int j = 1;
        while (j * 9 <= n) {
            j *= 9;
        }
        cnt++;
        return Math.min(dfs(n - i, cnt), dfs(n - j, cnt));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(dfs(n, 0));
    }

}
