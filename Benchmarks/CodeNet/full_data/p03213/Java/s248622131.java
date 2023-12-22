import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        Map<Integer, Integer> primeMap = new HashMap<>();
        for (int i = 2; i <= N; i++) {
            Map<Integer, Integer> tempMap = getPrimeMap(i);
            for (Map.Entry<Integer, Integer> e : tempMap.entrySet()) {
                if (primeMap.containsKey(e.getKey())) {
                    int temp = primeMap.get(e.getKey());
                    primeMap.put(e.getKey(), temp + e.getValue());
                } else {
                    primeMap.put(e.getKey(), e.getValue());
                }
            }
        }

        Map<Integer, Integer> map = new HashMap<>();
        int n3 = 0;
        int n5 = 0;
        int n15 = 0;
        int n25 = 0;
        int n75 = 0;
        for (Map.Entry<Integer, Integer> e : primeMap.entrySet()) {
            if (e.getValue() > 1) {
                if (e.getValue() >= 74) {
                    n75++;
                } else if (e.getValue() >= 24) {
                    n25++;
                } else if (e.getValue() >= 14) {
                    n15++;
                } else if (e.getValue() >= 4) {
                    n5++;
                } else {
                    n3++;
                }
            }
        }

//        System.out.println("n3: " + n3);
//        System.out.println("n5: " + n5);
//        System.out.println("n15: " + n15);
//        System.out.println("n25: " + n25);
//        System.out.println("n75: " + n75);

        n3 = n3 + n75 + n25 + n15;
        n5 = n5 + n75 + n25 + n15;
        n15 = n15 + n75;
        n25 = n25 + n75;

        int temp = n75
                + n15 * n5
                + n3 * n25
                + n3 * n5 * (n5-1) / 2;
        System.out.println(temp);
    }

    static Map<Integer, Integer> getPrimeMap(int n) {
        int i = 2;
        int tmp = n;

        Map<Integer, Integer> primeMap = new HashMap<>();
        while (i * i <= n) {
            if (tmp % i == 0) {
                tmp /= i;
                int a = 0;
                if (primeMap.containsKey(i)) {
                    a = primeMap.get(i);
                }
                primeMap.put(i, a+1);
            } else {
                i++;
            }
        }
        if (tmp != 1) {
            int a = 0;
            if (primeMap.containsKey(i)) {
                a = primeMap.get(tmp);
            }
            primeMap.put(tmp, a+1);
        }

        return primeMap;
    }

}
