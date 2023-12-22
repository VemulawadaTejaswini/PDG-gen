import java.util.*;
import java.util.Map.Entry;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] ar = new int[N];
        for (int i = 0; i < N; i++) {
            ar[i] = sc.nextInt();
        }
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int now = 0;
        int count = 0;
        int ans = 0;
        for (int i : ar) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i)+1);
            } else {
                map.put(i, 1);
            }
        }
        for (Entry<Integer, Integer> e : map.entrySet()) {
            int key = e.getKey();
            int val = e.getValue();
            if (key < val) {
                ans += (val-key);
            } else if (val < key) {
                ans += val;
            }
        }
        System.out.println(ans);
    }   
}
