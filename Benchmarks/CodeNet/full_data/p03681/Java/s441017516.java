import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        int M = scan.nextInt();
        if (1 < Math.abs(N-M)) {
            System.out.println(0);
            return;
        }
        long x = f(N);
        long y = f(M);
        long answer = (x * y) % 1000000007;
        if (Math.abs(N-M) == 0) {
            answer = answer * 2 % 1000000007;
        }
        System.out.println(answer);
    }
    private static long f(long x) {
        long answer = 1;
        for(; 1 <= x; x--) {
            answer = answer * x % 1000000007;
        }
        return answer;
    }
}
