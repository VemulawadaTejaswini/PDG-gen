import java.util.*;

public class Main {
    public void main(Scanner sc) {
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println(2 * n);
        for (int i = 0; i < n - 1; i++) {
            System.out.println((n - i) + " " + (n - i - 1));
        }
        System.out.println("1 1");
        for (int i = 0; i < n - 1; i++) {
            System.out.println((i + 1) + " " + (i + 2));
        }
        System.out.println(n + " " + n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Main().main(sc);
        sc.close();
    }
}
