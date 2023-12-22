import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean[] isPrime = new boolean[n*2 + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;
        for (int i = 2; i < Math.sqrt(n) + 1; i++) {
            if (isPrime[i]) {
                for (int j = i*2; j < isPrime.length; j+=i) {
                    isPrime[j] = false;
                }
            }
        }
        for (int i = n; i < isPrime.length; i++) {
            if (isPrime[i]) {
                System.out.println(i);
                break;
            }
        }
    }
}
