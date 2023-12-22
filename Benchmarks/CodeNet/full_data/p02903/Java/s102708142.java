import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        int W = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        int[][] map = new int[H][W];
        int[] wMap = new int[W];
        int[] hMap = new int[H];


        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                if ((hMap[i] < A || W == 1) &&  (wMap[j] < B || H == 1)) {
                    map[i][j] = 1;
                    hMap[i]++;
                    wMap[j]++;
                }
            }
        }

        for (int i = 0; i < H; i++) {
            if(Math.min(hMap[i], W - hMap[i]) != A) {
                System.out.println("No");
                return;
            }
        }
        for (int j = 0; j < W; j++) {
            if(Math.min(wMap[j], H - wMap[j]) != B) {
                System.out.println("No");
                return;
            }
        }

        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                System.out.print(map[i][j]);
            }
            System.out.println("");
        }
    }

}
