
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * エラトステネスの篩を用いた実装
 *
 * @author kou
 *
 */
public class Main {

    public static void main(String[] args) {
        boolean[] isPrime = new boolean[100000 + 1];
        Arrays.fill(isPrime, true);
        for (int i = 2; i <= Math.sqrt(100000); i++) {
            if (!isPrime[i]) {
                continue;
            }

            for (int j = i + 1; j <= 100000; j++) {
                if (!isPrime[j]) {
                    continue;
                }
                if (j % i == 0) {
                    isPrime[j] = false;
                }
            }
        }

        Set<Integer> primeSet = new HashSet<Integer>();
        for (int i = 2; i <= 100000; i++) {
            if (isPrime[i]) {
                primeSet.add(i);
            }
        }

        Map<Integer, Integer> like2017Map = new HashMap<Integer, Integer>();
        like2017Map.put(-1, 0);
        int count = 0;
        for (int i = 1; i <= 100000; i += 2) {
            if (primeSet.contains(i) && primeSet.contains((i + 1) / 2)) {
                count++;
            }
            like2017Map.put(i, count);
        }

        Scanner scan = new Scanner(System.in);
        int q = Integer.parseInt(scan.next());
        for (int i = 0; i < q; i++) {
            int l = Integer.parseInt(scan.next());
            int r = Integer.parseInt(scan.next());
            System.out.println(like2017Map.get(r) - like2017Map.get(l - 2));
        }
        scan.close();
    }
}
