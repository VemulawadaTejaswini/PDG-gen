import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int n = scanner.nextInt();
        int[] a = new int[n];
        Arrays.setAll(a, i -> scanner.nextInt());
        Arrays.sort(a);
        int alice = 0;
        int bob = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == n % 2) {
                bob += a[i];
            } else {
                alice += a[i];
            }
        }
        System.out.println(alice - bob);
    }
}