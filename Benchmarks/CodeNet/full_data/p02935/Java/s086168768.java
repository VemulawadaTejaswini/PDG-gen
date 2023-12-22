import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; ++i) a[i] = in.nextInt();
        Arrays.sort(a);
        double ans = a[0];
        for (int i = 1; i < n; ++i) {
            ans = (ans + a[i]) / 2;
        }
        System.out.println(ans);
    }
}
