import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n;
        int[] a;
        try (Scanner cin = new Scanner(System.in)) {
            n = cin.nextInt();
            a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = cin.nextInt();
        }
        int count = 0;
        int sum = a[0];
        int xor = a[0];
        int i = 0;
        int j = 0;
        while (true) {
            if (sum == xor) {
                count += j - i + 1;
                j++;
                if (j >= n) break;
                sum += a[j];
                xor ^= a[j];
            } else {
                sum -= a[i];
                xor ^= a[i];
                i++;
            }
        }
        System.out.println(count);
    }

}
