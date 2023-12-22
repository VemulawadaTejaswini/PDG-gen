import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // write your code here
        //dream dreamer erase eraser
        int H;
        int W;
        String[] sList;
        try (Scanner sc = new Scanner(System.in)) {
            H = sc.nextInt();
            W = sc.nextInt();
            sList = new String[H];
            for (int i = 0; i < H; i++) {
                sList[i] = sc.next();
            }
        }
        long mass[][] = new long[H + 2][W + 2];

        for (int i = 1; i <= H; i++) {
            char[] c = sList[i - 1].toCharArray();
            for (int j = 1; j <= W; j++) {
                if (c[j - 1] == '#') {
                    mass[i][j] = 1;
                }
            }
        }

        for (int i = 1; i <= H; i++) {
            for (int j = 1; j <= W; j++) {
                if (mass[i][j] == 1 && !addSurroundMass(mass, i, j)) {
                    System.out.println("No");
                    return;
                }
            }

        }
        System.out.println("Yes");
        return;
    }

    private static boolean addSurroundMass(long[][] mass, int i, int j) {
        boolean result = mass[i - 1][j] == 1 ||
                mass[i][j - 1] == 1 ||
                mass[i][j + 1] == 1 ||
                mass[i + 1][j] == 1;
        return result;
    }
}
