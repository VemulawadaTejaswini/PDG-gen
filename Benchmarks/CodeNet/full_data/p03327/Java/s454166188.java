
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by oka on 2018/06/10.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] temp = {1, 6, 9, 36, 81, 216, 729, 1296, 6561, 7776, 46656, 59049};
        List<Integer> list = new ArrayList<Integer>();
        ConcurrentHashMap map = new ConcurrentHashMap();
        for (int i = 0; temp[i] <= n; i++) {
            if (n == temp[i]) {
                System.out.println(1);
                return;
            }
            list.add(temp[i]);
            map.put(temp[i], true);
        }

        int retCounter = 1;
        while (true) {
            retCounter++;
            synchronized (map) {
                List<Integer> tmp = new ArrayList<Integer>();
                for (Iterator<Integer> i = map.keySet().iterator(); i.hasNext(); ) {
                    tmp.add(i.next());
                }
            }
            synchronized (map) {
                for (int key: tmp) {
                    synchronized (map) {
                        map.remove(key);
                    }
                    for (int j = 0; j < list.size(); j++) {
                        int newKey = key + list.get(j);
                        if (newKey == n) {
                            System.out.println(retCounter);
                            return;
                        }
                        synchronized (map) {
                            map.put(newKey, true);
                        }
                    }
                }
            }
        }
    }
}
