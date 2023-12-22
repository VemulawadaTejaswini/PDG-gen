import java.util.*;
import java.util.Map.Entry;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());

        Map<Integer, List<Integer>> prefs = new HashMap<>();
        List<Integer> cities = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            int pref = Integer.parseInt(sc.next());
            int year = Integer.parseInt(sc.next());

            cities.add(year);

            if (prefs.containsKey(pref)) {
                prefs.get(pref).add(year);
            } else {
                prefs.put(pref, new ArrayList<>(Arrays.asList(year)));
            }
        }

        prefs.forEach((pref, years) -> Collections.sort(years));

        cities.forEach(city -> {
            Entry<Integer, List<Integer>> e = prefs.entrySet().stream().filter(entry -> entry.getValue().contains(city)).findFirst().get();
            System.out.println(
                    String.format("%06d%06d",
                            e.getKey(),
                            e.getValue().indexOf(city) + 1
                    ));
        });

    }
}