import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String ans = "";
        int[] a = new int[n];
        int[] b = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            sum += a[i];
        }
        Arrays.sort(a);
        for (int i = 0; i < n; i++) {
            b[n - 1 - i] = a[i];
        }

        if (b[m - 1] < sum / (4 * m)) {
            ans = "No";
        } else {
            ans = "Yes";
        }
        System.out.println(ans);
    }
}