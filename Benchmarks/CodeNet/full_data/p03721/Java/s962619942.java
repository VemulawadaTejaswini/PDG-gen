import java.util.*;

/**
 * Created by sonetsuyoshi on 2016/07/31.
 */
public class Main {
    static public void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        Map<Integer, Long> map = new HashMap<>();

        for(int i = 0; i < N; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            map.put(a, map.getOrDefault(a, 0L) + b);
        }

        List<Integer> keys = new ArrayList(map.keySet());
        Collections.sort(keys);

        long count = 0;

        for(int key: keys) {
            long newCount = count + map.get(key);
            if(count <= K && K <= newCount) {
                System.out.println(key);
                break;
            }
            count = newCount;
        }
    }
}