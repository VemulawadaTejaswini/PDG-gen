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
        int N = scan.nextInt();
        String S = scan.next();
        char[] data = S.toCharArray();
        int count = 0;
        for (int i = 0; i < N - 2; i++) {
            if (data[i] == 'A' && data[i+1] == 'B' && data[i+2] == 'C') {
                count += 1;
            }
        }
        System.out.println(count);
    }
}
