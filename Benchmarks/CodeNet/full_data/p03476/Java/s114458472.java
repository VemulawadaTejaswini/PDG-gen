
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Set<Integer> primeSet = new HashSet<Integer>();
        primeSet.add(2);
        for (int i = 3; i <= 100000; i += 2) {
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
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
