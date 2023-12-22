import java.util.Scanner;

public class Main {
    public void main(Scanner sc) {
        int n = sc.nextInt();
        int a[] = new int[n + 2];
        a[0] = 0;
        a[n + 1] = 0;

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            a[i] = sc.nextInt();
            sum += Math.abs(a[i - 1] - a[i]);
        }
        sum += Math.abs(a[n] - a[n + 1]);

        for (int i = 1; i <= n; i++) {
            System.out.println(sum - calc(a[i - 1], a[i], a[i + 1]));
        }
    }

    private int calc(int a, int b, int c) {
        if ((a <= c && c <= b) || (b <= c && c <= a)) {
            return 2 * Math.abs(b - c);
        }

        if ((b <= a && a <= c) || (c <= a && a <= b)) {
            return 2 * Math.abs(a - b);
        }

        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Main().main(sc);
        sc.close();
    }
}
