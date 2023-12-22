import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        HashSet<String> checked = new HashSet<>();
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int H = scan.nextInt();
        int W = scan.nextInt();
        int[][] map = new int[H+2][W+2];
        for (int i = 0; i < H; i++) {
            String line = scan.next();
            char[] data = line.toCharArray();
            for (int j = 0; j < W; j++) {
                if (data[j] == '#') {
                    map[i+1][j+1] = 1;
                }
            }
        }
        int[][] one = new int[H+2][W+2];
        int[][] two = new int[H+2][W+2];
        int[][] three = new int[H+2][W+2];
        int[][] four = new int[H+2][W+2];
        for(int i = 0; i < H+2; i++) {
            Arrays.fill(one[i],Integer.MAX_VALUE);
            Arrays.fill(two[i],Integer.MAX_VALUE);
            Arrays.fill(three[i],Integer.MAX_VALUE);
            Arrays.fill(four[i],Integer.MAX_VALUE);
        }
        for (int i = 1; i <= H; i++) {
            for (int j = 1; j <= W; j++) {
                if (map[i][j] == 1) {
                    one[i][j] = 1;
                    continue;
                }
                if (one[i-1][j] == Integer.MAX_VALUE && one[i][j-1] == Integer.MAX_VALUE) {
                    continue;
                }
                if (one[i-1][j] == Integer.MAX_VALUE) {
                    one[i][j] = one[i][j-1] + 1;
                    continue;
                }
                if (one[i][j-1] == Integer.MAX_VALUE) {
                    one[i][j] = one[i-1][j] + 1;
                    continue;
                }
                one[i][j] = Math.min(one[i][j-1],one[i-1][j]) + 1;

            }
        }
        for (int i = 1; i <= H; i++) {
            for (int j = W; 1 <= j; j--) {
                if (map[i][j] == 1) {
                    two[i][j] = 1;
                    continue;
                }
                if (two[i-1][j] == Integer.MAX_VALUE && two[i][j+1] == Integer.MAX_VALUE) {
                    continue;
                }
                if (two[i-1][j] == Integer.MAX_VALUE) {
                    two[i][j] = two[i][j+1] + 1;
                    continue;
                }
                if (two[i][j+1] == Integer.MAX_VALUE) {
                    two[i][j] = two[i-1][j] + 1;
                    continue;
                }
                two[i][j] = Math.min(two[i][j+1],two[i-1][j]) + 1;
            }
        }
        for (int i = H; 1 <= i; i--) {
            for (int j = W; 1 <= j; j--) {
                if (map[i][j] == 1) {
                    three[i][j] = 1;
                    continue;
                }
                if (three[i+1][j] == Integer.MAX_VALUE && three[i][j+1] == Integer.MAX_VALUE) {
                    continue;
                }
                if (three[i+1][j] == Integer.MAX_VALUE) {
                    three[i][j] = three[i][j+1] + 1;
                    continue;
                }
                if (two[i][j+1] == Integer.MAX_VALUE) {
                    three[i][j] = three[i+1][j] + 1;
                    continue;
                }
                three[i][j] = Math.min(three[i][j+1],three[i+1][j]) + 1;
            }
        }
        for (int i = H; 1 <= i; i--) {
            for (int j = 1; j <= W; j++) {
                if (map[i][j] == 1) {
                    four[i][j] = 1;
                    continue;
                }
                if (four[i+1][j] == Integer.MAX_VALUE && four[i][j-1] == Integer.MAX_VALUE) {
                    continue;
                }
                if (four[i+1][j] == Integer.MAX_VALUE) {
                    four[i][j] = four[i][j-1] + 1;
                    continue;
                }
                if (four[i][j-1] == Integer.MAX_VALUE) {
                    four[i][j] = four[i+1][j] + 1;
                    continue;
                }
                four[i][j] = Math.min(four[i][j-1],four[i+1][j]) + 1;
            }
        }
        int answer = 0;
        for (int i = 1; i <= H; i++) {
            for (int j = 1; j <= W; j++) {
                answer = Math.max(answer, Math.min(Math.min(Math.min(one[i][j],two[i][j]), three[i][j]), four[i][j]));
            }
        }
        System.out.println(answer-1);
    }
}
