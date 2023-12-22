import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            new Main().solve(sc);
        }
    }

    void solve(Scanner sc) {
        int k = sc.nextInt();
        int t = sc.nextInt();
        int max = 0;
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            max = Math.max(max, a);
        }

        if (k - max < max) {
            System.out.println(max - (k - max) - 1);
        } else {
            System.out.println(0);
        }
    }
}