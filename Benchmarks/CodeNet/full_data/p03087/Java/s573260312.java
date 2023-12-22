import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            new Main().solve(sc);
        }
    }

    void solve(Scanner sc) {
        int n = sc.nextInt();
        int q = sc.nextInt();
        char[] s = sc.next().toCharArray();
        for (int i = 0; i < q; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();

            int ans = 0;
            for (int j = l - 1; j < r - 1; j++) {
                if (j + 1 != s.length && s[j] == 'A' && s[j + 1] == 'C') {
                    ans++;
                }
            }
            System.out.println(ans);
        }
    }
}