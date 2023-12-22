import java.util.ArrayList;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();

        int[][] a = new int[H][W];
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                for (int k = 0; k < a[i][j]; k++) {
                    int ci = i + 1;
                    int cj = j + 1;
                    for (int l = 0; l < H - i - 1; l++) {
                        result.add(String.format("%d %d %d %d", ci, cj, ci + 1, cj));
                        ci += 1;
                    }
                    for (int l = 0; l < W - j - 1; l++) {
                        result.add(String.format("%d %d %d %d", ci, cj, ci, cj + 1));
                        cj += 1;
                    }
                }
            }
        }

        System.out.println(result.size());
        for (String ri : result) {
            System.out.println(ri);
        }

        sc.close();

    }
}