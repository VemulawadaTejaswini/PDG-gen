import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class Main {
    private static int MOD = 1000000007;


    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        int n = Integer.parseInt(br.readLine());
        String[] split = br.readLine().split(" ");

        List<Integer> as = new ArrayList<>();

        Map<Integer, Integer> map = new HashMap<>();
        // どの数値が何個あったかのマップ
        for (int i = 0; i < split.length; i++) {
            int k = Integer.parseInt(split[i]);
            as.add(k);
            Integer v = map.get(k);
            if (v == null) {
                map.put(k, 1);
            } else {
                v++;
                map.put(k, v);
            }
        }

        Map<Integer, Integer> map2 = new HashMap<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                continue;
            }
            Integer value = map2.get(entry.getValue());
            if (value == null) {
                map2.put(entry.getValue(), 1);
            } else {
                map2.put(entry.getValue(), value + 1);
            }
        }

        Map<Map<Integer, Integer>, Long> map3 = new HashMap<>();
        // 数値ごとのコンビネーションを計算して保持するためのMap
        Map<Integer, Long> combMap = new HashMap<>(); // max 2*10^5
        for (int i = 0; i < as.size(); i++) {
            Map<Integer, Integer> clonedMap = map2.entrySet()
                    .stream()
                    .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

            Integer integer = as.get(i);
            Long out = 0l;

            Integer suti = map.get(integer);
            if (clonedMap.get(suti) != null) {
                clonedMap.put(suti, clonedMap.get(suti) - 1);
            }
            if (clonedMap.get(suti - 1) != null) {
                clonedMap.put(suti - 1, clonedMap.get(suti - 1) + 1);
            } else {
                clonedMap.put(suti - 1, 1);
            }

            Long k = map3.get(clonedMap);
            if (k ==null ){
                for (Map.Entry<Integer, Integer> entry : clonedMap.entrySet()) {
                    long l = calcCombination(entry.getKey(), 2);
                    out += l * entry.getValue();
                }

                map3.put(clonedMap, out);
                k = out;
            }

            System.out.println(k);

//            // 数値の組み合わせの数分コンビネーションを計算する max 2*10^5
//            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
//                Integer count = entry.getValue();
//                if (entry.getKey() == integer) {
//                    count--;
//                }
//
//                Long comb = combMap.get(count);
//                if (comb == null) {
//                    comb = calcCombination(count, 2);
//                    combMap.put(count, comb);
//                }
//                out += comb;
//            }

        }
    }

    private static long calcCombination(int n, int m) {
        if (n < m || m < 0) {
            return 0;
        }
        long c = 1;
        m = (n - m < m ? n - m : m);
        for (int ns = n - m + 1, ms = 1; ms <= m; ns++, ms++) {
            c *= ns;
            c /= ms;
        }
        return c;
    }
}
