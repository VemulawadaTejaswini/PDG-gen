import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] A = new int[n+1][2];
        A[0] = new int[]{1,1};
        for (int i = 1; i <= n; i++) {
            int t = sc.nextInt();
            int a = sc.nextInt();
            int m = Math.max((A[i-1][0] +t -1) /t, (A[i-1][1] +a -1) /a);
            A[i][0] = t * m;
            A[i][1] = a * m;
        }

        System.out.println(A[n][0] + A[n][1]);
        sc.close();
    }

}
