import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int c = scanner.nextInt();
        String s = scanner.next();
        int[] dpLeftToRight = new int[n];
        dpLeftToRight[0] = s.charAt(0) == 'x' ? 0 : 1;
        for (int i = 1; i < s.length(); ++i) {
            if (s.charAt(i) == 'x') {
                dpLeftToRight[i] = dpLeftToRight[i - 1];
            } else {
                if (i - c - 1 >= 0) {
                    dpLeftToRight[i] = Math.max(dpLeftToRight[i - 1], dpLeftToRight[i - c - 1] + 1);
                } else {
                    dpLeftToRight[i] = Math.max(dpLeftToRight[i - 1], 1);
                }
            }
      //      System.out.println("dpLeftToRight[" + (i + 1) + "]: " + dpLeftToRight[i]);
        }
        if (dpLeftToRight[n - 1] > k) {
            return;
        }
        Map<Integer, Set<Integer>> workDaysToDayLeftToRight = new HashMap<>();
        for (int i = 0; i < n; ++i) {
            if (s.charAt(i) == 'x') {
                continue;
            }
            int workDays = dpLeftToRight[i];
            if (!workDaysToDayLeftToRight.containsKey(workDays)) {
                workDaysToDayLeftToRight.put(workDays, new HashSet<>());
            }
            workDaysToDayLeftToRight.get(workDays).add(i + 1);
        }
        int[] dpRightToLeft = new int[n];
        dpRightToLeft[n - 1] = s.charAt(n - 1) == 'x' ? 0 : 1;
        for (int i = s.length() - 2; i >= 0; --i) {
            if (s.charAt(i) == 'x') {
                dpRightToLeft[i] = dpRightToLeft[i + 1];
            } else {
                if (i + c + 1 < n) {
                    dpRightToLeft[i] = Math.max(dpRightToLeft[i + 1], dpRightToLeft[i + c + 1] + 1);
                } else {
                    dpRightToLeft[i] = Math.max(dpRightToLeft[i + 1], 1);
                }
            }
        //    System.out.println("dpRightToLeft[" + (i + 1) + "]: " + dpRightToLeft[i]);
        }
        Map<Integer, Set<Integer>> workDaysToDayRightToLeft = new HashMap<>();
        for (int i = 0; i < n; ++i) {
            if (s.charAt(i) == 'x') {
                continue;
            }
            int workDays = dpRightToLeft[i];
            if (!workDaysToDayRightToLeft.containsKey(workDays)) {
                workDaysToDayRightToLeft.put(workDays, new HashSet<>());
            }
            workDaysToDayRightToLeft.get(workDays).add(i + 1);
        }

        Set<Integer> ans = new TreeSet<>();
        for (int i = 1; i <= n; ++i) {
            if (workDaysToDayLeftToRight.containsKey(i) && workDaysToDayLeftToRight.get(i).size() == 1) {
                ans.add(workDaysToDayLeftToRight.get(i).iterator().next());
            }
            if (workDaysToDayRightToLeft.containsKey(i) && workDaysToDayRightToLeft.get(i).size() == 1) {
                ans.add(workDaysToDayRightToLeft.get(i).iterator().next());
            }
        }
        for (int day: ans) {
            System.out.println(day);
        }
    }
}
