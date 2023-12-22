import java.util.*;

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

        cities.forEach(city ->
                System.out.println(
                        String.format("%06d%06d",
                                prefs.entrySet().stream().filter(entry -> entry.getValue().contains(city)).findFirst().get().getKey(),
                                prefs.entrySet().stream().mapToInt(entry -> entry.getValue().indexOf(city)).max().getAsInt() + 1)
                ));

    }
}