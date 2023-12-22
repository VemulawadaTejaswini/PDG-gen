import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];

        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }

        int ans = solve(A);

        System.out.println(ans);
    }

    public static int solve(int[] A) {
        int ans = 0;
        boolean tf = true;

        for (int a: A) {
            if (a % 2 != 0) {
                tf = false;
            }
        }

        while (tf) {
            for (int i = 0; i < A.length; i++) {
                A[i] = A[i] / 2;
            }
            ans++;

            for (int a: A) {
                if (a % 2 != 0) {
                    tf = false;
                }
            }
        }

        return ans;
    }



}
