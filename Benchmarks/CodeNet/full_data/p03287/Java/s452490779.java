import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        long a[] = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }
        long ruiseki[] = new long[n];
        ruiseki[0] = a[0];
        long ans = 0;
        for (int i = 1; i < n; i++) {
            ruiseki[i] = ruiseki[i - 1] + a[i];

        }
        for (int i = 0; i < n; i++) {
            if (ruiseki[i] % m == 0) {
                ans++;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                long wa = ruiseki[i] - ruiseki[j];
                if (wa % m == 0) {
                    ans++;
                }
            }
        }
        System.out.println(ans);
        sc.close();
    }
}
