import java.util.*;

/**
 * @author varun on 7/1/2018
 * @project CompetitiveProgramming
 */
public class Main {

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
        List<Integer> freq = new ArrayList<>(frequencyMap.values());
        Collections.sort(freq);
        int ans = 0;
        while(freq.size() > maxNumKeys) {
            ans += freq.get(0);
            freq.remove(0);
        }
        System.out.println(ans);
    }
}
