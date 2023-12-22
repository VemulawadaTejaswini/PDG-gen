import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Map<Integer, String> map1 = new TreeMap<Integer, String>(Comparator.reverseOrder());
        Map<Integer, Integer> map2 = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String s = scanner.next();
            int p = scanner.nextInt();
            map1.put(p, s);
            map2.put(p, i+1);
        }

        map1.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(s->System.out.println(map2.get((s.getKey()))));
    }

}
