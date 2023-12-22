import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] a1 = new int[n];
        int[] a2 = new int[n];
        for (int i = 0; i < n; i++) {
            int temp = Integer.parseInt(sc.next());
            a1[i] = temp;
            a2[i] = temp;
        }
        int ans1 = 0;
        int ans2 = 0;
        long temp = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0 && temp + a1[i] >= 0) {
                ans1 += temp + a1[i] + 1;
                a1[i] -= temp + a1[i] + 1;
            }
            if (i % 2 != 0 && temp + a1[i] <= 0) {
                ans1 += Math.abs(temp + a1[i] - 1);
                a1[i] += Math.abs(temp + a1[i] - 1);
            }
            temp += a1[i];
        }
        if (Arrays.stream(a1).mapToLong(x -> x).sum() == 0) {
            ans1++;
        }
        temp = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0 && temp + a2[i] <= 0) {
                ans2 += Math.abs(temp + a2[i] - 1);
                a2[i] += Math.abs(temp + a2[i] - 1);
            }
            if (i % 2 != 0 && temp + a2[i] >= 0) {
                ans2 += temp + a2[i] + 1;
                a1[i] -= temp + a2[i] + 1;
            }
            temp += a2[i];
        }
        if (Arrays.stream(a2).mapToLong(x -> x).sum() == 0) {
            ans2++;
        }
        System.out.println(Math.min(ans1, ans2));
    }
}