import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nx = sc.nextLine().split(" ");
        int n = Integer.parseInt(nx[0]);
        long x = Long.parseLong(nx[1]);

        List<Long> burger = new ArrayList<>();
        List<Long> putty  = new ArrayList<>();
        burger.add(1L);
        putty.add(1L);
        for (int i = 0; i < n; i++) {
            burger.add(2 * burger.get(i) + 3);
            putty.add(2 * putty.get(i) + 1);
        }

        System.out.println(fnx(n, x, burger, putty));
    }

    public static long fnx(int n, long x, List<Long> a, List<Long> p) {
        if (n == 0) {
            return (x <= 0) ? 0 : 1;
        }
        if (x <= a.get(n - 1) + 1) {
            return fnx(n - 1, x - 1, a, p);
        }
        if (x == a.get(n - 1) + 2) {
            return p.get(n - 1) + 1;
        }
        if (a.get(n - 1) + 2 < x && x <= a.get(n) + 2) {
            return p.get(n - 1) + 1 + fnx(n - 1, x - 2 - a.get(n - 1), a, p);
        }
        return 2 * p.get(n - 1) + 1;
    }
}