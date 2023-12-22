import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int H = scan.nextInt();
        int W = scan.nextInt();
        int[][] a = new int[H][W];
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                a[i][j] = scan.nextInt();
            }
        }
        int move_count = 0;
        List<String> moves = new ArrayList<>();
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                if (a[i][j] % 2 == 0) {
                    continue;
                }
                if (i % 2 == 0 && j + 1 < W) {
                    a[i][j] -= 1;
                    a[i][j+1] += 1;
                    move_count += 1;
                    moves.add(String.format("%d %d %d %d", (i+1), (j+1), (i+1), (j+2)));
                    continue;
                }
                if (i % 2 == 1 && 0 <= j - 1) {
                    a[i][j] -= 1;
                    a[i][j-1] += 1;
                    move_count += 1;
                    moves.add(String.format("%d %d %d %d", (i+1), (j+1), (i+1), (j)));
                    continue;
                }
                if (i % 2 == 0 && i == W - 1 && i + 1 < H) {
                    a[i][j] -= 1;
                    a[i+1][j] += 1;
                    move_count += 1;
                    moves.add(String.format("%d %d %d %d", (i+1), (j+1), (i+2), (j+1)));
                    continue;
                }
                if (i % 2 == 1 && i == 0 && i + 1 < H) {
                    a[i][j] -= 1;
                    a[i+1][j] += 1;
                    move_count += 1;
                    moves.add(String.format("%d %d %d %d", (i+1), (j+1), (i+2), (j+1)));
                    continue;
                }
            }
        }
        System.out.println(move_count);
        for (int i = 0; i < move_count; i++) {
            System.out.println(moves.get(i));
        }
    }
}
