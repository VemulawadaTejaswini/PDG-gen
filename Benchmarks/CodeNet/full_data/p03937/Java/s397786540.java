import java.io.BufferedReader;
import java.io.InputStreamReader;
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
        char[][] map = new char[H][W];
        for (int i = 0; i < H; i++) {
            String s = scan.next();
            char[] d = s.toCharArray();
            for (int j = 0; j < W; j++) {
                map[i][j] = d[j];
            }
        }
        for (int i = 0; i < H - 1; i++) {
            for (int j = 0; j < W - 1; j++) {
                if (map[i][j] == '#' && map[i][j+1] == '#' && map[i+1][j] == '#' && map[i+1][j+1] == '#') {
                    System.out.println("Impossible");
                    return;
                }
                if (map[i][j] == '#' && map[i][j+1] == '#' && map[i+1][j] == '#' && map[i+1][j+1] == '.') {
                    System.out.println("Impossible");
                    return;
                }
                if (map[i][j] == '.' && map[i][j+1] == '#' && map[i+1][j] == '#' && map[i+1][j+1] == '#') {
                    System.out.println("Impossible");
                    return;
                }
            }
        }
        System.out.println("Possible");
    }
}
