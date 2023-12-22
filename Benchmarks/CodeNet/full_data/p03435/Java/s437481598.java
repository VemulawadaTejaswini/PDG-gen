import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            solve(sc);
        }
    }

    public static void solve(Scanner sc) {
        int[][] matrix = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int[] a = new int[3];
        int[] b = new int[3];
        a[0] = 0;
        b[0] = matrix[0][0] - a[0];
        b[1] = matrix[0][1] - a[0];
        b[2] = matrix[0][2] - a[0];
        a[1] = matrix[1][0] - b[0];
        a[2] = matrix[2][0] - b[0];
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matrix[i][j] != a[i] + b[j]) {
                    System.out.println("No");
                    return;
                }
            }
        }
        
        System.out.println("Yes");
    }
}