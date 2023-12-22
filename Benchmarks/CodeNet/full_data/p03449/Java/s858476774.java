import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[][] a = new int[2][n];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = Integer.parseInt(sc.next());
            }
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int temp = 0;
            for (int j = 0; j <= i; j++) {
                temp += a[0][j];
            }
            for (int j = i; j < n; j++) {
                temp += a[1][j];
            }
            ans = Math.max(ans, temp);
        }
        System.out.println(ans);
    }
}