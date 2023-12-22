import java.util.Scanner;

public class Main {

    public static int[][] A = new int[3][3];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            int b = sc.nextInt();
            checkHit(b);
        }
        boolean bingo = checkBingo();
        if (bingo) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static void checkHit(int b) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (A[i][j] == b) {
                    A[i][j] = 0;
                }
            }
        }
    }

    public static boolean checkBingo() {
        boolean result = false;
        for (int i = 0; i < 3; i++) {
            int sum = 0;
            for (int j = 0; j < 3; j++) {
                sum += A[i][j];
            }
            if (sum == 0) {
                result = true;
            }
        }
        for (int i = 0; i < 3; i++) {
            int sum = 0;
            for (int j = 0; j < 3; j++) {
                sum += A[j][i];
            }
            if (sum == 0) {
                result = true;
            }
        }
        if (A[0][0] + A[1][1] + A[2][2] == 0) {
            result = true;
        }
        if (A[0][2] + A[1][1] + A[2][0] == 0) {
            result = true;
        }
        return result;
    }
}
