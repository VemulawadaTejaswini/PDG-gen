
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] num = {6, 2, 5, 5, 4, 5, 6, 3, 7, 6};
        Map<Integer, Integer> thing = new HashMap<>();
        for (int i = 0; i < m; ++i) {
            int a = scanner.nextInt();
            if (thing.containsKey(num[a])) {
                int current = thing.get(num[a]);
                thing.put(num[a], Math.max(a, current));
            } else {
                thing.put(num[a], a);
            }
        }
        int minKey = -1;
        for (int key : thing.keySet()) {
            if (minKey == -1 || minKey > key) {
                minKey = key;
            }
        }
        int len = n / minKey;
        int mod = n % minKey;
     //   System.out.println("len: " + len + " mod: " + mod);
        int [] modValue = new int[10];
        for (Map.Entry<Integer, Integer> costValue : thing.entrySet()) {
            modValue[costValue.getKey() - minKey] = costValue.getValue();
    //        System.out.println("modValue: " + (costValue.getKey() - minKey) + " value: " + costValue.getValue());
        }
        Set<String> res = new HashSet<>();
        String current = "";
        dfs(modValue, 1, 0, mod, res, current);
        String minKeyValue = String.valueOf(thing.get(minKey));
        String maxRes = "";
        for (String valid : res) {
            if (len < valid.length()) {
                continue;
            }
      //      System.out.println(" valid: " + valid);
            String remain = String.join("", Collections.nCopies(len - valid.length(), minKeyValue));
            String currentRes = remain + valid;
            final String sortedCurrentRes = Stream.of(currentRes.split(""))
                    .sorted(Comparator.reverseOrder())
                    .collect(Collectors.joining());
            if (maxRes.length() < sortedCurrentRes.length()) {
                maxRes = sortedCurrentRes;
            } else if (maxRes.length() == sortedCurrentRes.length() &&
                maxRes.compareTo(sortedCurrentRes) < 0
            ) {
                maxRes = sortedCurrentRes;
            }
        }
        System.out.println(maxRes);

    }

    static void dfs(int[] modValue, int i, int used, int total, Set<String> res, String current) {
        if (used == total) {
            res.add(current);
            return;
        }
        if (i == modValue.length || used > total) {
            return;
        }

        if (modValue[i] == 0) {
            dfs(modValue, i + 1, used, total, res, current);
            return;
        }
        dfs(modValue, i + 1, used, total, res, current);
        String newCurrent = current;
        for (int j = 1; j <= total - used; ++j) {
            newCurrent += String.valueOf(modValue[i]);
            dfs(modValue, i + 1, used + i * j, total, res, newCurrent);
        }
    }
}
