
import java.util.*;
import java.lang.*;
import java.util.stream.Collectors;


class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        Map<Integer, Integer> map = new HashMap<>();

        for (Integer i = 1; i <= N; i++)
            map.put(i, sc.nextInt());

        Map<Integer, Integer> result = map.entrySet().stream()
                .sorted(Map.Entry.<Integer, Integer>comparingByValue()
                        .thenComparing(Map.Entry.comparingByKey()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

        System.out.println(result);

    }
}



