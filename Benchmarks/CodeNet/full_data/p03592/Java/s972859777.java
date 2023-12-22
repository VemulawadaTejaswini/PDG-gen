import java.util.Scanner;

class Main {
    void solve() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), m = in.nextInt(), k = in.nextInt();

        for(int a = 0; a <= m; a++) {
            for(int b = 0; b <= n; b++) {
                if(n * a + m * b - 2 * a * b == k) {
                    System.out.println("Yes");
                    return;
                }
            }
        }
        System.out.println("No");
    }

    public static void main(String[] args) {
        new Main().solve();
    }
}
