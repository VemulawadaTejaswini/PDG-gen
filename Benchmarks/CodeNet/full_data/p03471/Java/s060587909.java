import java.util.Scanner;

public class Main {

    public Main() {
    }

    public static void main(String[] args) {
        new Main().solve();
    }

    private void solve() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Y = sc.nextInt();
        boolean flg = false;
        for (int i = 0; i <= Y / 10000; i++) {
            for (int j = 0; j <= Y / 5000; j++) {
                if (N - i - j < 0) {
                    break;
                }
                if (10000 * i + 5000 * j + 1000 * (N - i - j) == Y) {
                    System.out.println(i + " " + j + " " + (N - i - j));
                    return;
                }
            }
        }
        System.out.println("-1 -1 -1");
    }
}
