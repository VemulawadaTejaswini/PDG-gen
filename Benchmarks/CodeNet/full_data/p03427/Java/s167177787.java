import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            new Main().solve(sc);
        }
    }

    void solve(Scanner sc) {
        char[] n = sc.next().toCharArray();
        if (n.length == 1) {
            System.out.println(n);
            return;
        }

        int ans = Integer.parseInt(String.valueOf(n[0])) - 1 + 9 * (n.length - 1);
        System.out.println(ans);
    }
}
