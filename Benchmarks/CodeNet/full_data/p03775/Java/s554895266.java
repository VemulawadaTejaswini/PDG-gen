import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        long N = scan.nextLong();
        long x = (long) Math.floor(Math.sqrt(N));
        long answer = String.valueOf(N).length();
        for(long i = Math.max(x-100000,1); i < Math.min(x+100000, N); i++) {
            if (N % i != 0) {
                continue;
            }
            long y = N / i;
            answer = Math.max(String.valueOf(x).length(), String.valueOf(y).length());
        }
        System.out.println(answer);
    }
}
