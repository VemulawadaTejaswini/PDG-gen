import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int x1 = scan.nextInt();
        int y1 = scan.nextInt();
        int x = scan.nextInt();
        int y = scan.nextInt();
        int dx = x - x1;
        int dy = y - y1;
        int[] answer = new int[4];
        for (int i = 0; i < 2; i++) {
            x = x - dy;
            y = y + dx;
            int dx_bck = dx;
            dx = -dy;
            dy = dx_bck;
            answer[2*i] = x;
            answer[2*i + 1] = y;
        }
        System.out.printf("%d %d %d %d\n",answer[0],answer[1],answer[2],answer[3]);
    }
}
