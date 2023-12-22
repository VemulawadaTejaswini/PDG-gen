import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        int two = 0;
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }
        for (int i = 0; i < n; i++) {
            if (a[i] == 2) {
                two++;
                continue;
            }
            if (a[i] % 4 == 0) {
                cnt++;
            }
        }
        if (two < 2) {
            two = 0;
        }
        if (cnt >= (n - two) / 2) {
            System.out.println("Yes");
            return;
        }
        System.out.println("No");
    }

}
