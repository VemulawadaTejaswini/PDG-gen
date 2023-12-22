import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) throws Exception {

        Scanner sc = new Scanner(System.in);

        final int N = sc.nextInt();
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < N; i++) {
            int a = sc.nextInt();

            if(map.get(a) == null) {
                map.put(a, 1);
            } else {
                map.put(a, map.get(a) + 1);
            }

            if(map.get(a - 1) == null) {
                map.put(a - 1, 1);
            } else {
                map.put(a - 1, map.get(a - 1) + 1);
            }

            if(map.get(a + 1) == null) {
                map.put(a + 1, 1);
            } else {
                map.put(a + 1, map.get(a + 1) + 1);
            }
        }

        int result = 0;
        for(Entry<Integer, Integer> entry : map.entrySet()) {
            result = Math.max(result, map.get(entry.getKey()));
        }
        System.out.println(result);
    }
}
