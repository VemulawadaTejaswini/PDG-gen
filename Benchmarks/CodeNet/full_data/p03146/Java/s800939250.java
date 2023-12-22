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
        int s = sc.nextInt();
        int preA = s;
        int m = 1;
        Set<Integer> set = new HashSet<>();
        set.add(preA);
        while (true) {
            m++;
            int a;
            if (preA % 2 == 0) {
                a = preA / 2;
            } else {
                a = 3 * preA +1;
            }

            if (set.contains(a)) {
                System.out.println(m);
                return;
            }

            set.add(a);
            preA = a;
        }
    }
}
