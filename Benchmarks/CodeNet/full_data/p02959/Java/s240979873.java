import java.util.Scanner;
 
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n + 1];
        int b[] = new int[n];
        for (int i = 0; i < n + 1; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        long ans = 0;
 
        for (int i = 0; i < n; i++) {
            if (a[i] < b[i]) {
                ans += a[i];
                b[i] -= a[i];
                if (a[i + 1] < b[i]) {
                    ans += a[i + 1];
                    a[i + 1] = 0;
                } else {
                    a[i + 1] -= b[i];
                    ans += b[i];
                }
            } else {
                ans += b[i];
            }
        }
        System.out.println(ans);
        sc.close();
    }
}