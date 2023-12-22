import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main implements Runnable {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Thread(null, new Main(), "", 128 * 1024 * 1024).start();
    }

    public void run() {
        int n = sc.nextInt();
        int[][] red = new int[n][2];
        int[][] blue = new int[n][2];

        for (int i = 0; i < n; i++) {
            red[i][0] = sc.nextInt();
            red[i][1] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            blue[i][0] = sc.nextInt();
            blue[i][1] = sc.nextInt();
        }

        int count = 0;
        boolean[] r = new boolean[n];
        boolean[] b = new boolean[n];

        boolean changed = true;
        while (changed) {
            Map<Integer, List<Integer>> map = new HashMap<>();
            changed = false;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (!r[i] && !b[j] && red[i][0] < blue[j][0] && red[i][1] < blue[j][1]) {
                        if (!map.containsKey(i)) {
                            map.put(i, new ArrayList<>());
                        }
                        map.get(i).add(j);
                    }
                }
            }
            for (Map.Entry<Integer, List<Integer>> e : map.entrySet()) {
                if (e.getValue().size() == 1) {
                    r[e.getKey()] = true;
                    b[e.getValue().get(0)] = true;
                    count++;
                    changed = true;
                    break;
                }
            }
            if (!changed) {
                Object[] keys = map.keySet().toArray();
                for (int i = 0; i < keys.length; i++) {
                    for (int j = i; j < keys.length; j++) {
                        Integer key = Integer.parseInt(keys[i].toString());
                        Integer key2 = Integer.parseInt(keys[j].toString());
                        if (map.get(key).equals(map.get(key2))) {
                            r[key] = true;
                            b[map.get(key).get(0)] = true;
                            count++;
                            changed = true;
                            break;
                        }
                    }
                    if (changed) {
                        break;
                    }
                }
            }
        }
        System.out.println(count);
    }
}