import java.util.*;

public class Main {

    public static String printAnswer(int[][] c) {
        int col1 = 0;
        int col2 = 0;
        int col3 = 0;
        int row1 = 0;
        int row2 = 0;
        int row3 = 0;
        for (int i = 1; i < 3; i++) {
            col1 = c[0][0] - c[i][0];
            col2 = c[0][1] - c[i][1];
            col3 = c[0][2] - c[i][2];
            if (col1 != col2 || col2 != col3) {
                return "No";
            }
            row1 = c[0][0] - c[0][i];
            row2 = c[1][0] - c[1][i];
            row3 = c[2][0] - c[2][i];
            if (row1 != row2 || row2 != row3) {
                return "No";
            }
        }
        return "Yes";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] c = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] = sc.nextInt();
            }
        }
        System.out.println(printAnswer(c));
    }

}
