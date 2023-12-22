import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int H = scan.nextInt();
        int W = scan.nextInt();
        char[][] map = new char[H][W];
        for (int i = 0; i < H; i++) {
            map[i] = scan.next().toCharArray();
        }
        for(int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                if (map[i][j] == '#') {
                    continue;
                }
                long count = 0;
                for (int k = Math.max(i-1,0); k < Math.min(H, i+2); k++) {
                    for (int l = Math.max(j-1,0); l < Math.min(W, j+2); l++) {
                        if (map[k][l] == '#') {
                            count += 1;
                        }
                    }
                }
                map[i][j] = (char)(count + 48);
            }
        }
        for (int i = 0; i < H; i++) {
            System.out.println(map[i]);
        }
    }
}
