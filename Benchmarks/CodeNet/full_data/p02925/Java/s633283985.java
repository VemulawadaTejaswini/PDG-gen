import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Set<Integer>>[] lists = new List[n];
        for (int i = 0; i < n; i++) {
            lists[i] = new LinkedList<>();
            for (int j = 0; j < n - 1; j++) {
                Set<Integer> set = new HashSet<>();
                set.add((i + 1));
                set.add(sc.nextInt());
                lists[i].add(set);
            }
        }

        int days = 0;
        while (true) {
            if (!hasMoreData(lists)) {
                break;
            }

            Set<Set<Integer>> tmpSet = new HashSet<>();
            Set<Set<Integer>> matchSet = new HashSet<>();
            // extract match set
            for (int i = 0; i < n; i++) {
                if (lists[i].size() > 0) {
                    Set<Integer> set = lists[i].get(0);
                    if (!tmpSet.contains(set)) {
                        tmpSet.add(set);
                    } else {
                        matchSet.add(set);
                    }
                }
            }
            if (matchSet.isEmpty()) {
                System.out.println(-1);
                System.exit(0);
            }
            // delete match set from lists
            for (int i = 0; i < n; i++) {
                if (lists[i].size() > 0) {
                    if (matchSet.contains(lists[i].get(0))) {
                        lists[i].remove(0);
                    }
                }
            }
            days++;
        }
        System.out.println(days);
        sc.close();
    }

    static boolean hasMoreData(List<Set<Integer>>[] lists) {
        for (int i = 0; i < lists.length; i++) {
            if (lists[i].size() > 0) {
                return true;
            }
        }
        return false;
    }
}
