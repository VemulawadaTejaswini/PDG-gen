import java.util.*;

public class Main {
    public void main(Scanner sc) {
        int n = sc.nextInt();
        long a[] = new long[n];
        long b[] = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = a[i] - (i + 1);
        }

        Arrays.sort(b);
        int cp = n / 2;
        long center = b[cp];

        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum += Math.abs(a[i] - (center + i + 1));
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Main().main(sc);
        sc.close();
    }
}
