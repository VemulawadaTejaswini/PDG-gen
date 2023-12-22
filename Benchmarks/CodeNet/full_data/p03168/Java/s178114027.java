import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double[] p = new double[N];
        for (int i = 0; i < N; i++) {
            p[i] = sc.nextDouble();
        }

        Map<Integer, Double> map = new HashMap<>();
        map.put(0, 1.0);
        for (int i = 0; i < N; i++) {
            Map<Integer, Double> tmp = new HashMap<>();
            for (int key : map.keySet()) {
                double last = map.get(key);
                tmp.put(key + 1, tmp.getOrDefault(key + 1, 0.0) + last * (1 - p[i]));
                tmp.put(key + 10000, tmp.getOrDefault(key + 10000, 0.0) + last * p[i]);
            }
            map = tmp;
        }

        double res = 0.0;

        for (int key : map.keySet()) {
            if (key / 10000 > key % 10000) {
                res += map.get(key);
            }
        }

        System.out.println(res);
    }
}
