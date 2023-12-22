import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c[][] = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] = sc.nextInt();
            }
        }
        boolean ans = true;
        for (int i = 0; i < 2; i++) {
            int left = c[i + 1][0] - c[i][0];
            int center = c[i + 1][1] - c[i][1];
            int right = c[i + 1][2] - c[i][2];
            if (left != center || center != right || right != left) {
                ans = false;
            }
        }
        for (int j = 0; j < 2; j++) {
            int up = c[0][j + 1] - c[0][j];
            int center = c[1][j + 1] - c[1][j];
            int down = c[2][j + 1] - c[2][j];
            if (up != down || up != center || down != center) {
                ans = false;
            }
        }
        if (ans) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}