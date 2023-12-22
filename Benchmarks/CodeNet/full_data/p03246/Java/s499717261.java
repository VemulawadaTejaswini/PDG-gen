import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] v = new int[n];
        for (int i = 0; i < n; i++) {
            v[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> evenMap = new HashMap<>();
        HashMap<Integer, Integer> oddMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                if (!evenMap.containsKey(v[i])) {
                    evenMap.put(v[i], 1);
                } else {
                    evenMap.put(v[i], evenMap.get(v[i]) + 1);
                }
            } else {
                if (!oddMap.containsKey(v[i])) {
                    oddMap.put(v[i], 1);
                } else {
                    oddMap.put(v[i], oddMap.get(v[i]) + 1);
                }
            }
        }

        List<Map.Entry<Integer, Integer>> evenEntries = new ArrayList<Map.Entry<Integer, Integer>>(evenMap.entrySet());
        List<Map.Entry<Integer, Integer>> oddEntries = new ArrayList<Map.Entry<Integer, Integer>>(oddMap.entrySet());

        Collections.sort(evenEntries, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });

        Collections.sort(oddEntries, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });

        int ret = 0;

        if (evenEntries.get(0).getKey() != oddEntries.get(0).getKey()) {
            ret = evenEntries.get(0).getValue() + oddEntries.get(0).getValue();
        } else if (evenEntries.get(0).getValue() == n/2 && oddEntries.get(0).getValue() == n/2) {
            ret += n/2;
        } else if (evenEntries.get(0).getValue() == n/2) {
            ret += n/2 + oddEntries.get(1).getValue();
        } else if (oddEntries.get(0).getValue() == n/2) {
            ret += n/2 + evenEntries.get(1).getValue();
        } else {
            ret += Math.max(oddEntries.get(0).getValue() + evenEntries.get(1).getValue(), evenEntries.get(0).getValue() + oddEntries.get(1).getValue());
        }

        System.out.println(n - ret);
    }
}