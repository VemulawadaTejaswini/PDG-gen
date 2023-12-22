import java.io.InputStream;
import java.io.PrintStream;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        solve(System.in, System.out);
    }

    static void solve(InputStream is, PrintStream os) {
        Scanner sc = new Scanner(is);
        /* read */
        int n = sc.nextInt();

        Map<Integer, Set<Integer>> lists = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String s = sc.next();
            Set<Integer> list = new HashSet<>();

            for (int j = 0; j < n; j++) {
                if (s.charAt(j) == '1') {
                    // matrix[i][j] = true;
                    list.add(j);
                }
            }
            lists.put(i, list);
        }

        int max = -1;
        for (int i = 0; i < n; i++) {
            max = Math.max(depth(i, lists, n), max);
        }

        os.println(max);
    }

    private static class Node {
        int node;
        Set<Integer> parents = new HashSet<>();
    }

    private static int depth(int start, Map<Integer, Set<Integer>> lists, int N) {
        HashMap<Integer, HashSet<Integer>> tempLists = new HashMap<>();
        for (int j = 0 ; j < N ; j++) {
            tempLists.put(j, new HashSet<>(lists.get(j)));
        }
        Set<Integer> visited = new HashSet<>();
        Set<Integer> curr = new HashSet<>();
        curr.add(start);

        int count = 0;
        while (0 < curr.size()) {
            count++;
            Set<Integer> next = new HashSet<>();
            for (Integer n : curr) {
                Set<Integer> nexts = tempLists.get(n);
                for (int nx : nexts) {
                    if (visited.contains(nx)) {
                        // visiting again
                        return -1;
                    }
                    next.add(nx);
                }
                visited.add(n);
            }
            for (Integer n : curr) {
                for(Integer child : next) {
                    tempLists.get(child).remove(n);
                }
            }
            curr = new HashSet<>(next);
        }
        return count;
    }
}