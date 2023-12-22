import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            int b = Math.abs(a[i] - k);
            if (a[i] < b) {
                count += 2 * a[i];
            } else {
                count += 2 * b;
            }
        }
        System.out.println(count);
    }
}