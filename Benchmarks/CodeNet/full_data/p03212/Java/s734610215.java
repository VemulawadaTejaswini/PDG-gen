import java.util.Scanner;

public class Main {
    long n;
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            new Main().solve(sc);
        }
    }

    void solve(Scanner sc) {
        n = sc.nextLong();
        System.out.println(count(0));
    }

    long count(long a) {
        if (a > n) {
            return 0;
        }

        String as = String.valueOf(a);
        if (as.contains("7") && as.contains("5") && as.contains("3")) {
            return 1 + count(a * 10 + 7) + count(a * 10 + 5) + count(a * 10 + 3);
        }

        return count(a * 10 + 7) + count(a * 10 + 5) + count(a * 10 + 3);
    }
}
