
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Set;

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
   //     System.out.println("len: " + len + " mod: " + mod);
        int [] modValue = new int[10];
        for (Map.Entry<Integer, Integer> costValue : thing.entrySet()) {
            modValue[costValue.getKey() - minKey] = costValue.getValue();
         //   System.out.println("modValue: " + (costValue.getKey() - minKey) + " value: " + costValue.getValue());
        }
        Set<String> res = new HashSet<>();
        PriorityQueue<Integer> current = new PriorityQueue<>(Comparator.reverseOrder());
        dfs(modValue, 1, 0, mod, res, current);
        long maxRes = -1;
        for (String valid : res) {
       //     System.out.println(" valid: " + valid);
            if (maxRes == -1 || Long.valueOf(valid) > maxRes) {
                maxRes = Long.valueOf(valid);
            }
        }
        int [] finalRes = new int[10];
        String maxResStr = String.valueOf(maxRes);
        for (int i = 0; i < maxResStr.length(); ++i) {
            finalRes[maxResStr.charAt(i) - '0']++;
        }
        finalRes[thing.get(minKey)] += len - maxResStr.length();
        String finalResValue = "";
        for (int i = 9; i >= 1; --i) {
            if (finalRes[i] > 0) {
                for (int j = 0; j < finalRes[i]; ++j) {
                    finalResValue += String.valueOf(i);
                }
            }
        }
        System.out.println(finalResValue);

    }

    static void dfs(int[] modValue, int i, int used, int total, Set<String> res, PriorityQueue<Integer> current) {
   //     System.out.println("i: " + i + " used: " + used + " total: " + total);

        if (i == modValue.length) {
            if (used != total) {
                return;
            } else {
                String result = "";
                for (Integer num : current) {
                    result += String.valueOf(num);
                }
          //      System.out.println("result: " + result);
                res.add(result);
                return;
            }
        }
        if (modValue[i] == 0) {
            dfs(modValue, i + 1, used, total, res, current);
            return;
        }
        dfs(modValue, i + 1, used, total, res, current);

        for (int j = 1; j <= total - used; ++j) {
            PriorityQueue<Integer> newCurrent = new PriorityQueue<>(current);
            newCurrent.add(modValue[i]);
            dfs(modValue, i + 1, used + i * j, total, res, newCurrent);
        }
    }
}
