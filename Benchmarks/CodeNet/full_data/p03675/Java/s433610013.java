import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            new Main().solve(sc);
        }
    }

    void solve(Scanner sc) {
        int n = sc.nextInt();
        StringBuilder sb = new StringBuilder(n * 2);
        sb.append(sc.next());
        for (int i = 1; i < n; i++) {
            if (i % 2 == 0) {
                sb.insert(0, sc.next() + " ");
            } else {
                sb.append(" " + sc.next());
            }
        }
        System.out.println(n % 2 == 0 ? sb : sb);
    }
}
