import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    private static Scanner sc;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        new Main().solve();
    }

    private void solve() {
        int n = sc.nextInt();
        Set<String> s = new HashSet<String>();
        for (int i = 0; i < n; i++) {
            s.add(sc.next());
        }

        if (s.size() == 3) {
            System.out.println("Three");
        } else {
            System.out.println("Four");
        }

    }
}