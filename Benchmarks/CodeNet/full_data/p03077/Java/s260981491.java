import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = Long.parseLong(sc.next());
        long[] a = new long[5];
        long min = Long.MAX_VALUE;
        for (int i = 0; i < 5; i++) {
            long temp = Long.parseLong(sc.next());
            a[i] = temp;
            min = Math.min(min, temp);
        }
        long ans;
        if (n <= min) {
            ans = 5;
        } else {
            ans = Math.round(n * 1.0 / min) + 4;
        }
        System.out.println(ans);
    }
}