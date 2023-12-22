import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Main {
    final Scanner sc = new Scanner(System.in);
    Map<String, Integer> map = new LinkedHashMap<>();
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        int n = sc.nextInt();
        IntStream.range(0, n).forEach(i -> {
            String str = sc.next();
            Integer val = map.get(str);
            if (val == null) {
                map.put(str, 1);
            } else {
                map.put(str, val.intValue()+1);
            }
        });
        map = map.entrySet().stream()
            .sorted(Map.Entry.<String, Integer>comparingByValue().reversed()
                .thenComparing(Map.Entry.comparingByKey()))
            .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

        int prevCount = 0;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            int count = entry.getValue();
            if (prevCount == 0 || count == prevCount) {
                System.out.println(entry.getKey());
                prevCount = count;
            } else {
                break;
            }
        }
    }
}
