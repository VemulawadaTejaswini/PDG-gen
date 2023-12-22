import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main implements Runnable {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Thread(null, new Main(), "", 128 * 1024 * 1024).start();
    }

    public void run() {
        int n = sc.nextInt();
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            map.put(i, sc.nextInt());
        }
        LinkedHashMap<Integer, Integer> sortedMap =
                map.entrySet().stream()
                        .sorted((e1, e2) -> e1.getValue() - e2.getValue())
                        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                                                  (e1, e2) -> e1, LinkedHashMap::new));

        for (int i = 0; i < n; i++) {
            LinkedHashMap<Integer, Integer> tmp = new LinkedHashMap<>(sortedMap);
            tmp.remove(i);

            List<Integer> l = new ArrayList<>(tmp.values());
            System.out.println(l.get((l.size() + 1) / 2 - 1));
        }
    }
}
