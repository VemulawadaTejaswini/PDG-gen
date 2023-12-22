import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        int ans = 1000000;

        for (int i = 0; i < n; i++) {
            int a = 0;
            int b = 0;

            for (int j = 0; j <= i; j++) {
                a += array[j];
            }

            for (int j = 1; j < n - i; j++) {
                b += array[n - j];
            }

            int min = Math.abs(a - b);

            if (min < ans) {
                ans = min;
            }
        }

        System.out.println(ans);
    }
}