import java.util.*;

public class Main {
    static char[][] c;
    public static void main(String[] args) throws InterruptedException {
        Scanner scan = new Scanner(System.in);
        int[][] c = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] = scan.nextInt();
            }
        }
        for (int i = 0; i < 3; i++) {
            if (c[i][0] - c[i][1] != c[0][0] - c[0][1] ||  c[i][1] - c[i][2] != c[0][1] - c[0][2]) {
                System.out.println("No");
                return;
            }
        }
        for (int i = 0; i < 3; i++) {
            if (c[0][i] - c[1][i] != c[0][0] - c[1][0]||  c[1][i] - c[2][i] != c[1][0] - c[2][0]) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}
