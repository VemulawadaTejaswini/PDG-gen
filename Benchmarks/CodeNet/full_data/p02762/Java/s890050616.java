import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.StringJoiner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        Map<Integer, Set<Integer>> friends = new HashMap<>();
        Map<Integer, Set<Integer>> blocks = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            friends.put(i, new HashSet<>());
            blocks.put(i, new HashSet<>());
        }
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            friends.get(a).add(b);
            friends.get(b).add(a);
        }
        for (int i = 0; i < k; i++) {
            int c = sc.nextInt();
            int d = sc.nextInt();
            blocks.get(c).add(d);
            blocks.get(d).add(c);
        }

        List<Integer> ans = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            boolean[] visited = new boolean[n + 1];
            visited[i] = true;
            List<Integer> friendList = new ArrayList<>(friends.get(i));
            Set<Integer> friendSet = friends.get(i);
            Set<Integer> blockSet = blocks.get(i);
            Deque<Integer> queue = new ArrayDeque<>();
            for (int j = 0; j < friendList.size(); j++) {
                queue.add(friendList.get(j));
                visited[friendList.get(j)] = true;
            }
            int cnt = 0;
            while (!queue.isEmpty()) {
                int size = queue.size();
                for (int j = 0; j < size; j++) {
                    int f = queue.poll();
                    List<Integer> li = new ArrayList<>(friends.get(f));
                    for (int l = 0; l < li.size(); l++) {
                        int ff = li.get(l);
                        if (visited[ff]) {
                            continue;
                        }
                        if (!friendSet.contains(ff) && !blockSet.contains(ff)) {
                            cnt++;
                        }
                        visited[ff] = true;
                        queue.add(ff);
                    }
                }
            }
            ans.add(cnt);
        }

        StringJoiner sj = new StringJoiner(" ");
        for (int i = 0; i < n; i++) {
            sj.add(String.valueOf(ans.get(i)));
        }
        System.out.println(sj);
    }

}
