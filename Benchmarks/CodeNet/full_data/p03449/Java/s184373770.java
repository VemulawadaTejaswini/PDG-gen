import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[][] = new int[2][n];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 1; j < n; j++) {
                a[i][j] = a[i][j] + a[i][j - 1];
            }
        }
        int ans = a[0][0] + a[1][n - 1];
        for (int i = 1; i < n; i++) {
            int tmp = a[0][i] + a[1][n - 1] - a[1][i - 1];
            ans = Math.max(ans, tmp);
        }
        System.out.println(ans);
        sc.close();
    }
}
