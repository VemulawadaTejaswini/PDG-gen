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
        int a = scan.nextInt();
        int b = scan.nextInt();
        int h = scan.nextInt();
        System.out.println((a+b)*h/2);
    }
}
