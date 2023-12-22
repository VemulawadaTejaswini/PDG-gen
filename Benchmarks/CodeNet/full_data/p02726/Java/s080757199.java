import java.util.*;

public class Main {

    public static int X;
    public static int Y;
    public static int N;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        X = sc.nextInt();
        Y = sc.nextInt();
        N = n;
        Map<Integer, Integer> disCount = new HashMap<>();
        for (int i = 1;i <= n; i++) {
            Set<Integer> visited = new HashSet<>();
            visited.add(i);
            dfs(i, 1, visited, disCount);
        }

        // ans
        for (int i = 1; i <= n-1; i++) {
            System.out.println(disCount.getOrDefault(i, 0));
        }
    }

    private static void dfs(int cur, int dis, Set<Integer> visited, Map<Integer, Integer> disCount ) {
        List<Integer> nextList = new ArrayList<>();
        int nextInt = cur + 1;
        if (!visited.contains(nextInt) && nextInt <= N) {
            nextList.add(nextInt);
            visited.add(nextInt);
            int count = disCount.getOrDefault(dis, 0 );
            disCount.put(dis, ++count);
        }

        if (cur == X && !visited.contains(Y)) {
            nextList.add(Y);
            visited.add(Y);
            int count = disCount.getOrDefault(dis, 0 );
            disCount.put(dis, ++count);
        }
      
        if (nextList.isEmpty()) {
            return ;
        } 

        for (Integer in : nextList) {
            dfs(in, dis + 1, visited, disCount);
        }
    }
}
