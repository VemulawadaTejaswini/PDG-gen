import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[][] c = new int[3][3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] = sc.nextInt();
            }
        }

        boolean flag = false;
        for (int x = 0; x <= 100; x++) {
            int a1 = c[0][0] - x;
            int a2 = c[0][1] - x;
            int a3 = c[0][2] - x;
            int b1 = x;
            int b2 = c[1][0] - a1;
            int b3 = c[2][0] - a1;

            if (c[1][1] == a2+b2 && c[1][2] == a3+b2 && c[2][1] == a2+b3 && c[2][2] == a3+b3) {
                flag = true;
                break;
            }
        }

        if (flag) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}