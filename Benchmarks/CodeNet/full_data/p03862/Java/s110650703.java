import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }
        long ans = 0;
        for (int i = 1; i < n; i++) {
            long tmp = a[i - 1] + a[i];
            if (tmp > x) {
                if (a[i] >= x) {
                    ans += tmp - x;
                    a[i] = a[i] - (tmp - x);
                } else {
                    ans += tmp - x;
                    a[i] = 0;
                }
            }
        }
        System.out.println(ans);

        sc.close();
    }
}