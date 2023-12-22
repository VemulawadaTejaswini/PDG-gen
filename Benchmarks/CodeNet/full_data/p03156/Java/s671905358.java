import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            new Main().solve(sc);
        }
    }

    void solve(Scanner sc) {
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int numOf1 = 0;
        int numOf2 = 0;
        int numOf3 = 0;
        for (int i = 0; i < n; i++) {
            int p = sc.nextInt();
            if (p <= a) {
                numOf1++;
            } else if (a + 1 <= p && p <= b) {
                numOf2++;
            } else if (b + 1 <= p) {
                numOf3++;
            }
        }

        int min = Math.min(numOf1, Math.min(numOf2, numOf3));
        System.out.println(min);
    }
}
