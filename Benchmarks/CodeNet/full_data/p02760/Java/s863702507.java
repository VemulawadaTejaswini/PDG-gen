import java.util.*;

class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        final int A[][] = new int[3][3];
        final int C[][] = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                A[i][j] = Integer.parseInt(sc.next());
                C[i][j] = 0;
            }
        }
        final int N = Integer.parseInt(sc.next());
        final int B[] = new int[N];
        for (int i = 0; i < N; i++) {
            B[i] = Integer.parseInt(sc.next());
        }
        sc.close();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < N; k++) {
                    if (B[k] == A[i][j]) {
                        C[i][j] = 1;
                    }
                }
            }
        }
        if (C[0][0] == 1 && C[0][1] == 1 && C[0][2] == 1) {
            System.out.println("Yes");
        } else if (C[1][0] == 1 && C[1][1] == 1 && C[1][2] == 1) {
            System.out.println("Yes");
        } else if (C[2][0] == 1 && C[2][1] == 1 && C[2][2] == 1) {
            System.out.println("Yes");
        } else if (C[0][0] == 1 && C[1][0] == 1 && C[2][0] == 1) {
            System.out.println("Yes");
        } else if (C[0][1] == 1 && C[1][1] == 1 && C[2][1] == 1) {
            System.out.println("Yes");
        } else if (C[0][2] == 1 && C[1][2] == 1 && C[2][2] == 1) {
            System.out.println("Yes");
        } else if (C[0][0] == 1 && C[1][1] == 1 && C[2][2] == 1) {
            System.out.println("Yes");
        } else if (C[0][2] == 1 && C[1][1] == 1 && C[2][0] == 1) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}