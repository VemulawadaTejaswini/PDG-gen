import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int W = Integer.parseInt(sc.next());
        Map<Integer, List<Long>> map = new TreeMap<>();
        int w = Integer.parseInt(sc.next());
        int basew = w;
        for (int i = w; i <= w + 3; i++) {
            List<Long> base = new ArrayList<>();
            map.put(i, base);
        }
        long v = Long.parseLong(sc.next());
        map.get(w).add(v);
        for (int i = 1; i < N; i++) {
            w = Integer.parseInt(sc.next());
            v = Long.parseLong(sc.next());
            map.get(w).add(v);
        }
        int[] listsize = new int[map.size()];
        int ii = 0;
        for (Integer key : map.keySet()) {
            listsize[ii] = map.get(key).size() + 1;
            ii++;
        }
        for (Map.Entry<Integer, List<Long>> list : map.entrySet()) {
            Collections.sort(list.getValue(), Comparator.reverseOrder());
            long sum = 0;
            List<Long> sumList = new ArrayList<>();
            for (long l : list.getValue()) {
                sum += l;
                sumList.add(sum);
            }
            sumList.add(0, 0L);
            map.put(list.getKey(), sumList);
        }
        long ans = 0;
        for (int i = 0; i < listsize[0]; i++) {
            for (int j = 0; j < listsize[1]; j++) {
                for (int k = 0; k < listsize[2]; k++) {
                    for (int l = 0; l < listsize[3]; l++) {
                        long sumw = basew * i + (basew + 1) * j + (basew + 2) * k + (basew + 3) * l;
                        if (sumw <= W) {
                            long sum1 = map.get(basew).get(i);
                            long sum2 = map.get(basew + 1).get(j);
                            long sum3 = map.get(basew + 2).get(k);
                            long sum4 = map.get(basew + 3).get(l);
                            long sumv = sum1 + sum2 + sum3 + sum4;
                            ans = Math.max(ans, sumv);
                        }
                    }
                }
            }
        }
        System.out.println(ans);
    }
}