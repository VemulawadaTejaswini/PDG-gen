import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //コード
        Scanner scanner = new Scanner(System.in);
        Integer N = Integer.parseInt(scanner.next());

        Map<String, Integer> map = new HashMap<String, Integer>();
        for (int i = 0; i < N; i++) {
            String key = scanner.next();
            Integer count = map.get(key);
            map.put(key, (count == null) ? 1 : count + 1);
        }

        Map<String, Integer> result = map.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed()
                        .thenComparing(Map.Entry.comparingByKey()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

        Integer max = null;
        for (String key : result.keySet()) {
            if(max == null) max = result.get(key);
            if(max != result.get(key)) break;
            System.out.println(key);
        }
    }
}