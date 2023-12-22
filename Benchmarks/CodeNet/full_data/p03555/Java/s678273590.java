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
        char[][] data = new char[2][3];
        String s = scan.next();
        data[0] = s.toCharArray();
        s = scan.next();
        data[1] = s.toCharArray();
        boolean answer = false;
        if (data[0][0] == data[1][2] && data[0][1] == data[1][1] && data[0][2] == data[1][0]) {
            answer = true;
        }
        System.out.println(answer ? "YES" : "NO");
    }
}
