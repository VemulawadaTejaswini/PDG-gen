import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        List<Integer> primes = prime(N);
        long answer = 1;
        for (int prime : primes) {
            int count = 0;
            for (int i = Math.max(2,prime); i <= N; i++) {
                int t = i;
                while (t % prime == 0) {
                    t /= prime;
                    count += 1;
                }
            }
            answer = answer * (count+1) % 1000000007;
        }
        System.out.println(answer);
    }
    public static List<Integer> prime(int N) {
        int limit = (int) Math.ceil(Math.sqrt(N));
        boolean[] d = new boolean[N+1];
        d[0] = false;
        d[1] = false;
        List<Integer> result = new ArrayList<>();
        for (int i = 2; i <= limit; i++) {
            if (d[i]) {
                continue;
            }
            result.add(i);
            d[i] = true;
            for (int j = 1; j * i <=  N; j++) {
                d[i * j] = true;
            }
        }
        for (int i = 2; i <= N; i++) {
            if (!d[i]) {
                result.add(i);
            }
        }
        return result;
    }
}
