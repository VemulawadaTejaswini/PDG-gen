import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] k = new int[n];
        int[][] d = new int[n][m];
        for (int i = 0 ; i < n ; i++) {
            k[i] = sc.nextInt();
            for (int j = 0 ; j < k[i] ; j++) {
                int f = sc.nextInt() - 1;
                d[i][f]++;
            }
        }
        int count = 0;
        for (int i = 0 ; i < m ; i++) {
            int temp = 0;
            for (int j = 0 ; j < n ; j++) {
                if (d[j][i] == 1) temp++;
            }
            if (temp == n) count++;
        }
        System.out.println(count);
    }

}
