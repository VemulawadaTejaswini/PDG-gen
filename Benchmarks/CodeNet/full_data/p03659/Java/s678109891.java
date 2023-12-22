import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] sum = new int[n+1];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            sum[i+1] = sum[i] + a[i];
        }

        int min = Integer.MAX_VALUE;
        for (int i = 1; i < n; i++) {
            int val1 = sum[i];
            int val2 = sum[n] - sum[i];
            min = Math.min(min, Math.abs(val1-val2));
        }
        System.out.println(min);


    }
}
