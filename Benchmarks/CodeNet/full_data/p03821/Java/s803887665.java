import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }

        long cnt = 0;

        for (int i = n - 1; i >= 0; i--) {
            long tmp = (a[i] + cnt) % b[i];
            cnt += (tmp != 0)? b[i] - tmp : 0;
        }

        System.out.println(cnt);
    }
}
