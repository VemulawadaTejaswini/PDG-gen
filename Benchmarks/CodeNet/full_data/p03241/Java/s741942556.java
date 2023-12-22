import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int m = sc.nextInt();
        long ans = 0;
        if (m % 2 == 0) {
            if (m >= 2 * n) {
                ans = 2;
            }

        }
        for (int i = 1; i < m; i++) {
            if (m % i != 0)
                continue;
            if (m < i * n)
                break;
            ans = i;
        }
        System.out.println(ans);
        sc.close();
    }
}
