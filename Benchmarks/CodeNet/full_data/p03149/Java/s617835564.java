import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            new Main().solve(sc);
        }
    }

    void solve(Scanner sc) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(9);
        set.add(7);
        set.add(4);
        Set<Integer> newSet = new HashSet<>();
        for (int i = 0; i < 4; i++) {
            int n = sc.nextInt();
            newSet.add(n);
            if (!set.contains(n)) {
                System.out.println("NO");
                return;
            }
        }

        if (newSet.size() == 4) {
            System.out.println("YES");
        }
        System.out.println("NO");
    }
}
