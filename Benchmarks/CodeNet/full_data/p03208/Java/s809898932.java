
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        int n = sc.nextInt();
        int k = sc.nextInt();
        Map<Long, Long> map = new TreeMap<>();
        Pair max = new Pair(0L, 0L);
        for (int i = 0; i < n; i++) {
            long num = sc.nextLong();
            long time = 1;
            if (map.containsKey(num)) {
                long tmp = map.get(num);
                map.put(num, tmp + 1);
                time = tmp + 1;
            } else {
                map.put(num, 1L);
            }
            if (time == k) {
                System.out.println(0);
                return;
            } else {
                if (time > max.value) {
                    max = new Pair(num, time);
                }
            }
        }
        List<Long> keys = new ArrayList<>(map.keySet());
        int index = keys.indexOf(max.key);
        int diffUp = 0;
        Long treeValueUp = k - max.value;
        while (treeValueUp > 0) {
            diffUp++;
            if (index + diffUp >= keys.size()) {
                diffUp = Integer.MAX_VALUE;
                break;
            }
            treeValueUp = treeValueUp - map.get(keys.get(index + diffUp));
        }
        int diffDown = 0;
        Long treeValueDown = k - max.value;
        while (treeValueDown > 0) {
            diffDown++;
            if (index - diffDown < 0) {
                diffDown = Integer.MAX_VALUE;
                break;
            }
            treeValueDown = treeValueDown - map.get(keys.get(index - diffDown));
        }
        System.out.println(Math.min(diffDown, diffUp));
    }

    static class Pair {
        public Pair(Long key, Long value) {
            this.key = key;
            this.value = value;
        }

        Long key;
        Long value;
    }
}
