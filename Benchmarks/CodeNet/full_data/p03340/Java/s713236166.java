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
        int count = n;
        for (int i = 0; i < n - 1; i++) {
            int sum = a[i];
            int xor = a[i];
            for (int j = i + 1; j < n; j++) {
                sum += a[j];
                xor ^= a[j];
                if (sum == xor)
                    count++;
                else
                    break;
            }
        }
        System.out.println(count);
    }

}
