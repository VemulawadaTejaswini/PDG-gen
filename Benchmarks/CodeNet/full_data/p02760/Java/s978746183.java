import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] A = new int[3][3];
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                A[i][j] = Integer.parseInt(sc.next());
            }
        }
        int N = Integer.parseInt(sc.next());
        int[] b = new int[N];
        for(int i = 0; i < N; i++) {
            b[i] = Integer.parseInt(sc.next());
        }

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < 3; j++) {
                for(int k = 0; k < 3; k++) {
                    if(A[j][k] == b[i]) A[j][k] = 0;
                }
            }
        }
        int[] diagonally = {0, 0};
        for(int i = 0; i < 3; i++ ) {
            int vertical = 0;
            int horizonal = 0;
            for(int j = 0; j < 3; j++) {
                vertical += A[j][i];
                horizonal += A[i][j];
            }
            if(vertical == 0 || horizonal == 0) {
                System.out.println("Yes");
                return;
            }
            diagonally[0] += A[i][i];
            diagonally[1] += A[i][2 - i];
        }
        if(diagonally[0] == 0 || diagonally[1] == 0) {
            System.out.println("Yes");
            return;
        }
        System.out.println("No");
    }
}