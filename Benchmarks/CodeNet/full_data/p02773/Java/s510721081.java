
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

        Integer max=0;
        for (String key : map.keySet()) {
            max = Math.max(max, map.get(key));
        }

        List<String> moji = new ArrayList<>();
        for (String key : map.keySet()) {
            if(map.get(key)  == max) moji.add(key);
        }
        moji.stream().sorted().collect(Collectors.toList()).forEach(System.out::println);
    }
}
