import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] factors = new long[n+1];
        for (int i = 2; i <= n; i++) {
            int trg = i;
            int prime = 2;
            while (trg != 1) {
                if (trg % prime == 0) {
                    factors[prime]++;
                    trg /= prime;
                }
                else {
                    while (++prime<trg)
                        if (factors[prime] != 0)
                            break;
                }
            }
        }
        int mod = (int)1e9+7;
        long res = Arrays.stream(factors).reduce(1L, (a, b) -> (a*(b+1)) % mod);
        System.out.println(res);
    }
}