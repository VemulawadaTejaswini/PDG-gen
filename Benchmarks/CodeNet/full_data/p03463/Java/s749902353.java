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
        int A = scan.nextInt();
        int B = scan.nextInt();
        char[] d = new char[N+2];
        d[A] = 'A';
        d[B] = 'B';
        int dx_alice = A < B ? 1 : -1;
        int dx_borys = B < A ? 1 : -1;
        while(1 <= A && A <= N && 1 <= B && B <= N) {
            if (d[A+dx_alice] == 'B') {
                dx_alice *= -1;
            }
            d[A] = ' ';
            d[A+dx_alice] = 'A';
            A += dx_alice;
            if (d[B+dx_borys] == 'A') {
                dx_borys *= -1;
            }
            d[B] = ' ';
            d[B+dx_borys] = 'B';
            B += dx_borys;
        }
        if (A == 0 || A == N+1) {
            System.out.println("Borys");
            return;
        }
        System.out.println("Alice");
    }
}
