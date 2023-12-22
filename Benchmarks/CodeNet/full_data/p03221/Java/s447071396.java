import java.util.*;

public class Main {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        final int m = scanner.nextInt();

        int[][] cities = new int[m][2];
        Map<Integer, List<Integer>> cityMap = new HashMap<>();

        for (int i = 0; i < m; i++) {
            int prefecture = scanner.nextInt();
            int year = scanner.nextInt();

            cities[i] = new int[]{prefecture, year};
            cityMap.putIfAbsent(prefecture, new ArrayList<>());
            cityMap.compute(prefecture, (k, v) -> {
                v.add(year);
                return v;
            });
        }

        Map<Integer, Map<Integer, Integer>> resultMap = new HashMap<>();
        for (Map.Entry<Integer, List<Integer>> entry : cityMap.entrySet()) {
            entry.getValue().sort(Comparator.comparingInt(a -> a));
            resultMap.put(entry.getKey(), new HashMap<>());
            int i = 1;
            for (Integer year : entry.getValue()) {
                resultMap.get(entry.getKey()).put(year, i++);
            }
        }

        for (int i = 0; i < m; i++) {
            int order = resultMap.get(cities[i][0]).get(cities[i][1]);
            System.out.println(String.format("%06d", cities[i][0]) + String.format("%06d", order));
        }
    }

}
