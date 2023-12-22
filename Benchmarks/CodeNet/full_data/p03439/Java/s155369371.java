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
        System.out.println(0);
        System.out.flush();
        if (is_finished(scan)) {
            return;
        }
        int next = Math.min(4, N);
        while (0 < --next) {
            System.out.println(next);
            System.out.flush();
            if (is_finished(scan)) {
                return;
            }
        }
    }
    private boolean is_finished(Scanner scan) {
        String answer = scan.next();
        if ("Vacant".equals(answer)) {
            return true;
        }
        return false;
    }
}
