import java.util.*;
import java.util.Map.Entry;

/**
 * @author varun on 7/1/2018
 * @project CompetitiveProgramming
 */
public class Main {
    private static <K, V extends Comparable<? super V>> Map<K, V> sortByValue(Map<K, V> map) {
        List<Entry<K, V>> list = new ArrayList<>(map.entrySet());
        list.sort(Entry.comparingByValue());
        Map<K, V> result = new LinkedHashMap<>();
        for (Entry<K, V> entry : list) {
            result.put(entry.getKey(), entry.getValue());
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int maxNumKeys = scanner.nextInt();
        int[] numbers = new int[N];
        for (int i = 0; i < N; i++) numbers[i] = scanner.nextInt();
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int i : numbers) {
            if (frequencyMap.containsKey(i)) {
                frequencyMap.put(i, frequencyMap.get(i) + 1);
            } else {
                frequencyMap.put(i, 1);
            }
        }
        frequencyMap = sortByValue(frequencyMap);
        int ans = 0;
        while(frequencyMap.keySet().size() > maxNumKeys) {
            List<Integer> valueList = new ArrayList<>(frequencyMap.values());
            List<Integer> keySet = new ArrayList<>(frequencyMap.keySet());
            ans += valueList.get(0);
            frequencyMap.remove(keySet.get(0));
        }
        System.out.println(ans);
    }
}
