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
        int n = sc.nextInt();
        Set<String> sSet = new HashSet<>(4);
        for (int i = 0; i < n; i++) {
            sSet.add(sc.next());
        }
        System.out.println(sSet.size() == 3 ? "Three" : "Four");
    }
}