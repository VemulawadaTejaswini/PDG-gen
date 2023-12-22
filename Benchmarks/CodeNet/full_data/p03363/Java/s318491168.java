import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] S = new int[N + 1];
        Map<Integer, Integer> numCount = new HashMap<>();
        S[0] = 0;
        numCount.put(0, 1);
        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();
            int sVal = S[i] + num;
            Integer count = numCount.get(sVal);
            if (Objects.isNull(count)) {
                numCount.put(sVal, 1);
            } else {
                count++;
                numCount.put(sVal, count);
            }
            S[i + 1] = sVal;
        }
        sc.close();

        int res = 0;

        for (int key : numCount.keySet()) {
            int count = numCount.get(key);
            if (count == 1) {
                continue;
            }

            res += count * (count - 1) / 2;
        }

        System.out.println(res);
    }

}
