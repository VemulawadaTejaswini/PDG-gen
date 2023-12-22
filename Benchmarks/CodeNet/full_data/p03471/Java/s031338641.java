import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int y = Integer.parseInt(sc.next());

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n - i; j++) {
                int x = y - (10000 * i + 5000 * j);
                if (x == 1000 * (n - i - j)) {
                    System.out.printf("%d %d %d", i, j, x);
                    return;
                }
            }
        }
        System.out.println("-1 -1 -1");
    }
}
