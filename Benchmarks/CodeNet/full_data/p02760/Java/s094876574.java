import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] A = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        int N = sc.nextInt();
        int[] B = new int[N];
        for (int i = 0; i < N; i++) {
            B[i] = sc.nextInt();
        }
        int[][] check = new int[3][3];

        for (int i = 0; i < N; i++) {
            Dobingo(A, B[i], check);
        }
        if (hasBingo(check)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        sc.close();
    }

    public static void Dobingo(int[][] A, int B, int[][] bingo) {
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                if (A[i][j] == B) {
                    bingo[i][j] = 1;
                }
            }
        }
    }

    public static boolean hasBingo(int[][] bingo) {
        if (bingo[1][1] == 1) {
            if (bingo[0][0] == 1 && bingo[2][2] == 1) {
                return true;
            } else if (bingo[1][0] == 1 && bingo[1][2] == 1) {
                return true;
            } else if (bingo[2][0] == 1 && bingo[2][0] == 1) {
                return true;
            } else if (bingo[0][1] == 1 && bingo[1][2] == 1) {
                return true;
            }
        } else if (bingo[0][1] == 1) {
            if (bingo[0][0] == 1 && bingo[0][2] == 1) {
                return true;
            }
        } else if (bingo[2][1] == 1) {
            if (bingo[2][0] == 1 && bingo[2][2] == 1) {
                return true;
            }
        } else if (bingo[1][0] == 1) {
            if (bingo[0][0] == 1 && bingo[2][0] == 1) {
                return true;
            }
        } else if (bingo[1][2] == 1) {
            if (bingo[0][2] == 1 && bingo[2][2] == 1) {
                return true;
            }
        }

        return false;
    }
}