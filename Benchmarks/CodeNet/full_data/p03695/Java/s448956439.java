import java.util.Scanner;
import java.util.StringJoiner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] rate = new int[9];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            if (a[i] <= 399) {
                rate[0]++;
            } else if (a[i] <= 799) {
                rate[1]++;
            } else if (a[i] <= 1199) {
                rate[2]++;
            } else if (a[i] <= 1599) {
                rate[3]++;
            } else if (a[i] <= 1999) {
                rate[4]++;
            } else if (a[i] <= 2399) {
                rate[5]++;
            } else if (a[i] <= 2799) {
                rate[6]++;
            } else if (a[i] <= 3199) {
                rate[7]++;
            } else {
                rate[8]++;
            }
        }
        int ans = 0;
        for (int i = 0; i < rate.length - 1; i++) {
            if (rate[i] == 0) {
                continue;
            }
            ans++;
        }
        StringJoiner sj = new StringJoiner(" ");
        sj.add(String.valueOf(ans == 0 ? 1 : ans));
        sj.add(String.valueOf(Math.min(ans + rate[8], 8)));
        System.out.println(sj.toString());
    }

}
