import java.util.Scanner;

public class Main {

    private static int n;
    private static int A;
    private static int B;
    private static int C;
    private static int[] l;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        l = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = sc.nextInt();
        }
        System.out.println(dfs(0, 0, 0, 0));
    }

    public static int dfs(int cur, int a, int b, int c) {
        if (cur == n) {
            if (a != 0 && b != 0 && c != 0) {
                return Math.abs(a - A) + Math.abs(b - B) + Math.abs(c - C);
            }
            return Integer.MAX_VALUE;
        }

        int ret = dfs(cur + 1, a, b, c);
        int retA = dfs(cur + 1, a + l[cur], b, c);
        if (a != 0 && retA != Integer.MAX_VALUE) {
            retA += 10;
        }
        int retB = dfs(cur + 1, a, b + l[cur], c);
        if (b != 0 && retB != Integer.MAX_VALUE) {
            retB += 10;
        }
        int retC = dfs(cur + 1, a, b, c + l[cur]);
        if (c != 0 && retC != Integer.MAX_VALUE) {
            retC += 10;
        }
        return Math.min(Math.min(ret, retA), Math.min(retB, retC));
    }

}
