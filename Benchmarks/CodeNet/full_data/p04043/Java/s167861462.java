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
        int[] d = new int[11];
        d[scan.nextInt()] += 1;
        d[scan.nextInt()] += 1;
        d[scan.nextInt()] += 1;
        boolean answer = false;
        if (d[5] == 2 && d[7] == 1) {
            answer = true;
        }
        System.out.println(answer ? "YES" : "NO");
    }
}
