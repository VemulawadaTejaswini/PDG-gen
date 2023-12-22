import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int[] a = new int[n];
        long sum = 0;
        a[0] = sc.nextInt();
        for (int i = 1; i < n; i++) {
            a[i] = sc.nextInt();
            if (k - a[i] + a[0] <= a[i] - a[i-1]) {
                sum += k - a[i] + a[0];
                break;
            }
            sum += a[i] - a[i-1];
        }
        System.out.println(sum);
    }
}