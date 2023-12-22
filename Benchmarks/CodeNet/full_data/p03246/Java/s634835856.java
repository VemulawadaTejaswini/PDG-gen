import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long[] v = new long[n];
        for (int i = 0; i < n; i++) {
            v[i] = sc.nextInt();
        }

        HashMap<Long, Long> evenMap = new HashMap<>();
        HashMap<Long, Long> oddMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                if (!evenMap.containsKey(v[i])) {
                    evenMap.put(v[i], 1L);
                } else {
                    evenMap.put(v[i], evenMap.get(v[i]) + 1L);
                }
            } else {
                if (!oddMap.containsKey(v[i])) {
                    oddMap.put(v[i], 1L);
                } else {
                    oddMap.put(v[i], oddMap.get(v[i]) + 1);
                }
            }
        }

        List<Map.Entry<Long, Long>> evenEntries = new ArrayList<Map.Entry<Long, Long>>(evenMap.entrySet());
        List<Map.Entry<Long, Long>> oddEntries = new ArrayList<Map.Entry<Long, Long>>(oddMap.entrySet());

        Collections.sort(evenEntries, new Comparator<Map.Entry<Long, Long>>() {
            @Override
            public int compare(Map.Entry<Long, Long> o1, Map.Entry<Long, Long> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });

        Collections.sort(oddEntries, new Comparator<Map.Entry<Long, Long>>() {
            @Override
            public int compare(Map.Entry<Long, Long> o1, Map.Entry<Long, Long> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });

        long ret = 0;

        if (!evenEntries.get(0).getKey().equals(oddEntries.get(0).getKey())) {
            ret = evenEntries.get(0).getValue() + oddEntries.get(0).getValue();
            // ここから下は, 最上位のkeyが同じ
        } else if (evenEntries.get(0).getValue() == n/2 && oddEntries.get(0).getValue() == n/2) { // 偶奇ともに1種類しかない
            ret = n/2;
        } else if (evenEntries.get(0).getValue() == n/2) { // 偶数が1種類しかない, 奇数は2種類以上
            ret = oddEntries.get(1).getValue();
        } else if (oddEntries.get(0).getValue() == n/2) { // 奇数が1種類しかない, 偶数は2種類以上
            ret = evenEntries.get(1).getValue();
        } else {
            ret = Math.max(oddEntries.get(0).getValue() + evenEntries.get(1).getValue(), evenEntries.get(0).getValue() + oddEntries.get(1).getValue());
        }

        System.out.println(n - ret);
    }
}