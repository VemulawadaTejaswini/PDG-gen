import java.util.Map;
import java.util.Objects;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] line1 = sc.nextLine().split(" ");
        Integer N = Integer.parseInt(line1[0]);
        Integer K = Integer.parseInt(line1[1]);
        List<Integer> values = Arrays.stream(sc.nextLine().split(" ")).map(Integer::parseInt)
                .collect(Collectors.toList());
        Integer[] valArray = values.toArray(new Integer[values.size()]);
        sc.close();

        // 期待値の計算
        Map<Integer, Double> valMap = new HashMap<>();
        for (int i = 0; i < N; i++) {
            Double val = ((double) (1 + valArray[i]) / (double) 2);
            if (Objects.isNull(valMap.get(valArray[i]))) {
                valMap.put(valArray[i], val);
            }
        }

        // 累積和の計算
        Double[] S = new Double[N + 1];
        S[0] = (double) 0;
        for (int i = 0; i < N; i++) {
            int a = valArray[i];
            Double val = S[i] + valMap.get(a);
            S[i + 1] = val;
        }

        // 各隣接分の値を計算
        Double max = (double) 0;
        for (int i = 0; i <= N - K; i++) {
            Double val = S[i + K] - S[i];
            if (val > max) {
                max = val;
            }
        }

        System.out.println(max);
    }

}
