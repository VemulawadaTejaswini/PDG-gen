import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main a = new Main();
        a.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int k = scan.nextInt();
        int max = Math.max(Math.max(a,b),c);
        int answer = a+b+c - max + max * (int) Math.pow(2, k);
        System.out.println(answer);
    }

}
