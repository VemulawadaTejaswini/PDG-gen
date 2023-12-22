import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        List<List<Integer>> graph = new ArrayList<>();
        int[] degree = new int[n+1];
        int[] dp = new int[n+1];
        for(int i = 0; i <= n; i++){
            graph.add(new ArrayList<>());
        }
        for(int i = 0; i < m; i++){
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            degree[y]++;
            graph.get(x).add(y);
        }
        Deque<Integer> stack = new LinkedList<>();
        for(int i = 1; i <= n; i++){
            if(degree[i] == 0){
                stack.push(i);
            }
        }
        List<Integer> list = new ArrayList<>();
        while(!stack.isEmpty()){
            int j = stack.pop();
            list.add(j);
            for(int k : graph.get(j)){
                degree[k]--;
                if(degree[k] == 0)
                    stack.push(k);
            }
        }
        for(int i : list){
            for(int j : graph.get(i)){
                dp[j] = Math.max(dp[j], dp[i] + 1);
            }
        }
        int ans = 0;
        for(int i = 1; i <= n; i++){
            ans = Math.max(ans, dp[i]);
        }
        System.out.println(ans);
    }
}
