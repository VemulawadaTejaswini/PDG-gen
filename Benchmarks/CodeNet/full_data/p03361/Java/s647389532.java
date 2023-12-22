import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main a = new Main();
        a.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int h = scan.nextInt();
        int w = scan.nextInt();
        int[][] map = new int[h][w];
        for (int i = 0; i < h; i++) {
            String line = scan.next();
            char[] data = line.toCharArray();
            for (int j = 0; j < w; j++) {
                if (data[j] == '#') {
                    map[i][j] = 1;
                }
            }
        }
        boolean found = false;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (map[i][j] == 1 && this.is_isolation(map, h, w, i, j)) {
                    found = true;
                    break;
                }
            }
        }
        System.out.println(found ? "No" : "Yes");
    }
    private boolean is_isolation(int[][] map, int h, int w, int i, int j) {
        if (0 <= i-1) {
            if (map[i-1][j] == 1) {
                return false;
            }
        }
        if (i+1 < h) {
            if (map[i+1][j] == 1) {
                return false;
            }
        }
        if (0 <= j-1) {
            if (map[i][j-1] == 1) {
                return false;
            }
        }
        if (j+1 < w) {
            if (map[i][j+1] == 1) {
                return false;
            }
        }
        return true;
    }

}
