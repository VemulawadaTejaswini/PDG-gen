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
        String s = scan.next();
        char[] d = s.toCharArray();
        for(int i = 0; i < d.length; i++) {
            if (d[i] != '1'  && d[i] != '9') {
                continue;
            }
            d[i] = d[i] == '1' ? '9' : '1';
        }
        System.out.println(d);
    }
}
