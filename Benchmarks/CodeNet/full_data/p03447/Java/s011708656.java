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
        int X = scan.nextInt();
        int A = scan.nextInt();
        int remain = X - A;
        int B = scan.nextInt();
        int count = remain / B;
        int answer = remain - B * count;
        System.out.println(answer);
    }
}
