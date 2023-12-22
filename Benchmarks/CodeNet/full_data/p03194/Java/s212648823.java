
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long p = sc.nextLong();
        long ans = 1;
        Map<Long,Long> map = primeNumMap(p);
        for (Entry<Long, Long> entry : map.entrySet()) {
            long e = entry.getValue();
            if (e >= n) {
                ans *= entry.getKey();
            }
        }


        System.out.println(ans);
    }

    //素因数分解してmapにわたす。
    static Map<Long,Long> primeNumMap(long m) {
        Map<Long,Long> map = new TreeMap<>();
        for (Long i = 2l; i <= m; i++) {
            if (isPrimeNum(m)) {
                if (map.containsKey(m)) {
                    map.put(m, map.get(m) + 1);
                } else {
                    map.put(m, (long) 1l);
                }
                break;
            }

            if (m % i == 0) {
                while (m % i == 0) {
                    m /= i;
                    if (m == 1) {
                        if (map.containsKey(i)) {
                            map.put(i, map.get(i) + 1);
                        } else {
                            map.put(i, (long) 1l);
                        }
                        break;

                    } else {
                        if (map.containsKey(i)) {
                            map.put(i, map.get(i) + 1);
                        } else {
                            map.put(i, 1l);
                        }
                    }
                }
            }

        }
        return map;
    }

    static boolean isPrimeNum(long m ) {
        boolean ans = true;
        for (int i = 2; i < Math.sqrt(m); i++) {
            if (m % i == 0) {
                return false;
            }
        }
        return ans;
    }

}
