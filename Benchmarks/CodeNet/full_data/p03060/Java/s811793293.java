import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        int v[] = new int[n];
        int c[] = new int[n];
        for (int i = 0; i < n; i++) {
            v[i] = sc.nextInt();

        }
        for (int i = 0; i < n; i++) {
            c[i] = sc.nextInt();

        }

        for (int i = 0; i < n; i++) {
            if (v[i] > c[i]) {
                ans += v[i];
                ans -= c[i];
            }
        }
        System.out.println(ans);
        sc.close();
    }
}