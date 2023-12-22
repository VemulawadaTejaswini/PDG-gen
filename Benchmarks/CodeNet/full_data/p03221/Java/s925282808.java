import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] p = new int[M]; 
        Map<Integer, Integer> t = new HashMap<>();
        Map<Integer, Integer> sort = new LinkedHashMap<>();
        Map<Integer, Integer> ref = new HashMap<>();
        for (int i = 0; i<M; i++) {
            int pt = sc.nextInt();
            int y = sc.nextInt();
            t.put(y, pt);
            ref.put(y, pt);
        }

        t.entrySet().stream()
        .sorted(Map.Entry.comparingByKey())
        .forEach(ts -> {
            sort.put(ts.getKey(), p[ts.getValue()]);
            p[ts.getValue()]++;
        });

        ref.entrySet().stream()
        .forEach(ts -> {
            int o = sort.get(ts.getKey());
            String result = getID(ts.getValue(), o);
            System.out.println(result);
        });
    }

    public static String getID(Integer key, Integer value) {
        String prefix = String.format("%06d", key);
        String suffix = String.format("%06d", value+1);
        return prefix + suffix;
    }

}