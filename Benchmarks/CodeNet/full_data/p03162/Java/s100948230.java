import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int n = scanner.nextInt();
        int[][] mat = new int[n][3];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < 3; j++){
                mat[i][j] = scanner.nextInt();
            }
        }

        for(int i = 1; i < n; i++){
            mat[i][0] = mat[i][0] + Math.max(mat[i - 1][1], mat[i - 1][2]);
            mat[i][1] = mat[i][1] + Math.max(mat[i - 1][0], mat[i - 1][2]);
            mat[i][2] = mat[i][2] + Math.max(mat[i - 1][0], mat[i - 1][1]);
        }

        System.out.println(Math.max(mat[n - 1][0], Math.max(mat[n - 1][1], mat[n - 1][2])));
    }
}
