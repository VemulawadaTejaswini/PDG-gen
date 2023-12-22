import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            min = Math.min(min, a[i]);
        }
        for (int i = 0; i < n; i++) {
            a[i] += Math.abs(min);
            b[i] = a[i];
        }
        int count = 0;
        for (int i = 0; i < n - 1; i++) {
            while (a[i] > a[i + 1]) {
                a[i + 1] += a[i];
                count++;
            }
        }
        System.out.println(count);
        for (int i = 0; i < n - 1; i++) {
            while (b[i] > b[i + 1]) {
                b[i + 1] += b[i];
                System.out.println((i + 1) + " " + (i + 2));
            }
        }

    }
}