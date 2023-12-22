import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        // 2* 最大値回数あれば確実に終えることができる.
        Arrays.sort(a);
        int max = a[n - 1];
        int tag = max / 2;
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 1) {
                cnt++;
            }
        }
        long sa = a[n - 1] - a[0];
        String ans = "first";
        if (cnt % 2 == 1) {
            ans = "first";
        } else {
            ans = "second";
        }
        System.out.println(ans);

    }
}