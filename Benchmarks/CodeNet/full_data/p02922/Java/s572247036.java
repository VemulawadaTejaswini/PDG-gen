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
        long A = scan.nextLong();
        long B = scan.nextLong();
        if (B == 1) {
            System.out.println(0);
            return;
        }
        System.out.println((long)Math.ceil((double)(B-1)/(double)(A-1)));
    }
}
