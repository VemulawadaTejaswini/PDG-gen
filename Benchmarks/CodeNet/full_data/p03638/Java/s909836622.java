import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int H = in.nextInt(), W = in.nextInt(), n = in.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        int[][] ans = new int[H][W];
        
        int h = 0, w = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < a[i]; j++) {
                ans[h][w] = i + 1;
                if(h % 2 == 0) {
                    w++;
                    if(w == W) {
                        h++;
                        w = W - 1;
                    }
                }else {
                    w--;
                    if(w < 0) {
                        w = 0;
                        h++;
                    }
                }
            }
        }
        for(int i = 0; i < H; i++) {
            for(int j = 0; j < W; j++) {
                System.out.print(ans[i][j]);
            }
            System.out.println();
        }
    }
}