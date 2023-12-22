import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        HashMap<Long, Integer> map = new HashMap<>();
        map.put(0L, 1);

        long sum = 0;
        for (int i = 1; i < N+1; i++) {
            sum += A[i-1];
            sum %= M;

            if (map.containsKey(sum)) {
                map.put(sum, map.get(sum) + 1);
            } else {
                map.put(sum, 1);
            }
        }

        long ret = 0;
        for (long value : map.values()) {
            if (value == 1) {
                continue;
            }

            ret += value * (value - 1) / 2;
        }

        System.out.println(ret);
    }
}