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
        String S = scan.next();
        String T = scan.next();
        int A = scan.nextInt();
        int B = scan.nextInt();
        String U = scan.next();
        if (S.equals(U)) {
            A -= 1;
        } else {
            B -= 1;
        }
        System.out.printf("%d %d\n", A, B);
    }
}
