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
        String S = scan.next();
        char[] d = S.toCharArray();
        for (int i = 0; i < d.length-1; i++) {
            if (d[i] == 'h' && d[i+1] == 'i') {
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }
}
