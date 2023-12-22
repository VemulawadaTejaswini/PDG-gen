import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            new Main().solve(sc);
        }
    }

    void solve(Scanner sc) {
        int n = sc.nextInt();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if (n % 2 == 0 && a % 2 == 0) {
                System.out.println(0);
                return;

            } else if (n % 2 == 1 && a % 2 == 1) {
                System.out.println(0);
                return;
            }

            map.put(a, map.getOrDefault(a, 0) + 1);
        }

        for (Integer i : map.values()) {
            if (i != 2) {
                System.out.println(0);
                return;
            }
        }

        long ans = 1;
        for (int i = 0; i < n / 2; i++) {
            ans = (ans * 2) % (100_000_000 + 7);
        }
        System.out.println(ans);
    }
}
