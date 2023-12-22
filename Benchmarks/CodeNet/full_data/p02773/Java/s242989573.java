import java.util.*;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        String s[] = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        sc.close();

        Map<String, Integer> hm = new HashMap<>();
        for (String string : s) {
            if (hm.containsKey(string)) {
                hm.put(string, hm.get(string) + 1);
            } else {
                hm.put(string, 1);
            }
        }
        Map<String, Integer> sm = hm.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed()
                        .thenComparing(Map.Entry.comparingByKey()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
        int m = 0;
        for (Map.Entry<String, Integer> sorted : sm.entrySet()) {
            if (m > sorted.getValue()) {
                break;
            } else {
                System.out.println(sorted.getKey());
                m = sorted.getValue();
            }
        }
    }
}