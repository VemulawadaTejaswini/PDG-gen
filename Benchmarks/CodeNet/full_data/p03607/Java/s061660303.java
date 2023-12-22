import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n + 1];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n+1; i++) {
            System.out.println(a[i]);
        }
        Arrays.sort(a, 0, n);
        for (int i = 0; i < n+1; i++) {
            System.out.println(a[i]);
        }
        int ans = 0;
        for (int i = 0; i < n; i++)
            if (a[i] == a[i + 1])
                i++;
            else
                ans++;

        System.out.println(ans);

    }
}