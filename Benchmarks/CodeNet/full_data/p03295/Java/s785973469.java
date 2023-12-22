import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] a = new int[m][2];

        for (int i = 0; i < m; i++) {
            a[i][0] = sc.nextInt();
            a[i][1] = sc.nextInt();
        }

        int count = 1;
        int tmp1 = a[0][0];
        int tmp2 = a[0][1];
        for (int i = 1; i < m; i++) {
            if (tmp1 > a[i][0] || tmp2 < a[i][1] && m > 2) {
                tmp1 = a[i][0];
                tmp2 = a[i][1];
                count++;
            }
        }

        System.out.println(count);
    }
}