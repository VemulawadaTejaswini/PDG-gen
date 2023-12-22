import java.util.Arrays;

public class Main {
    private static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt(), a[] = new int[(n + 1) / 2], max = 0;
        for (int i = 0, temp; i < n; i++) {
            if (((temp = scanner.nextInt()) & 1) == (n & 1)) {
                System.out.println(0);
                return;
            }
            a[(temp - (~n & 1)) / 2]++;
            max = Math.max(max, temp);
        }

        long ans = 1;
        if ((n & 1) == 1)
            a = Arrays.copyOfRange(a, 1, a.length);
        for (int i = 0; i < a.length; i++) {
            if (a[i] != 2) {
                System.out.println(0);
                return;
            }
            ans = ans * 2 % 1000000007;
        }

        Util.println(max, Arrays.toString(a), ans);
    }
}