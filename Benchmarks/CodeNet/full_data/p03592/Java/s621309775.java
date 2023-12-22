import java.util.*;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    public static final void main(String[] args) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                int nb = m * i + n * j - i * j * 2;
                if (nb == k)
                    YES();
            }
        }
        NO();
    }

    static void YES() {
        System.out.println("Yes");
        System.exit(0);
    }

    static void NO() {
        System.out.println("No");
        System.exit(0);
    }
}