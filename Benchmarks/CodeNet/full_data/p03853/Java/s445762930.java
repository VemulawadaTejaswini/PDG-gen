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
            String s = scan.next();
            char[] d = s.toCharArray();
            for (int j = 0; j < W; j++) {
                map[i][j] = d[j];
            }
        }
        for (int i = 1; i <= 2*H; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < W; j++) {
                sb.append(map[(i+1)/2-1][j]);
            }
            System.out.println(sb.toString());
        }
    }
}
