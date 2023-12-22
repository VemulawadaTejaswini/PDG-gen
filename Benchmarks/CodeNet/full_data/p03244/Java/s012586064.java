import java.util.*;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        Map<Integer, Integer> p = new HashMap<>();
        Map<Integer, Integer> q = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int v = Integer.parseInt(sc.next());
            if (i % 2 == 0) {
                if (p.containsKey(v)) {
                    p.put(v, p.get(v) + 1);
                } else {
                    p.put(v, 1);
                }
            } else {
                if (q.containsKey(v)) {
                    q.put(v, q.get(v) + 1);
                } else {
                    q.put(v, 1);
                }
            }
        }
        sc.close();

        Map<Integer, Integer> ps = p.entrySet().stream()
                .sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed()
                        .thenComparing(Map.Entry.comparingByKey()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
        Map<Integer, Integer> qs = q.entrySet().stream()
                .sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed()
                        .thenComparing(Map.Entry.comparingByKey()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

        List<Integer> pss = new ArrayList<>(ps.keySet());
        List<Integer> qss = new ArrayList<>(qs.keySet());
        int x = 0, y = 0, ans = n / 2;
        boolean f = false;
        for (int i = 0; i < pss.size(); i++) {
            x = pss.get(i);
            for (int j = 0; j < qss.size(); j++) {
                if (x != qss.get(j)) {
                    y = qss.get(j);
                    f = true;
                    break;
                }
            }
            if (f)
                break;

        }
        if (f)
            ans = n - p.get(x) - q.get(y);
        x = 0;
        y = 0;
        f = false;
        for (int i = 0; i < qss.size(); i++) {
            x = qss.get(i);
            for (int j = 0; j < pss.size(); j++) {
                if (x != pss.get(j)) {
                    y = pss.get(j);
                    f = true;
                    break;
                }
            }
            if (f)
                break;

        }
        if (f && ans > n - q.get(x) - p.get(y))
            ans = n - q.get(x) - p.get(y);
        System.out.println(ans);
    }
}