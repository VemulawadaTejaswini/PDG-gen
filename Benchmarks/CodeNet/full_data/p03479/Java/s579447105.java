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
        long X = scan.nextLong();
        long Y = scan.nextLong();
        long Z = Y / X;
        long answer = f(Z)+1;
        System.out.println(answer);
    }
    public long f(long Z) {
        long t = 1;
        long result = 0;
        while (t < Z) {
            t *= 2;
            result += 1;
        }
        if (t == Z) {
            return result;
        }
        return result - 1;
    }
}
