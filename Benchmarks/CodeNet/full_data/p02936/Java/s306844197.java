import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();

        Map<Integer, List<Integer>> tree = new HashMap<>();
        for(int i = 0;i < n-1;i++){
            int f = sc.nextInt();
            int t = sc.nextInt();
            List<Integer> list = new ArrayList<>();
            if(tree.containsKey(f)){
                list = tree.get(f);
            }
            list.add(t);
            tree.put(f, list);
        }

        long[] score = new long[n+1];
        for(int i = 0;i < q;i++){
            int p = sc.nextInt();
            int x = sc.nextInt();
            score[p] += x;
        }

        long[] ans = new long[n+1];
        for(int i = 1;i <= n;i++) {
            ans[i] = score[i];
        }
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        while(!queue.isEmpty()){
            int num = queue.poll();
            if(tree.get(num) == null) {
                continue;
            }
            for(int c : tree.get(num)){
                ans[c] += ans[num];
                queue.add(c);
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 1;i <= n;i++){
            sb.append(ans[i]);
            sb.append(" ");
        }
        sb.deleteCharAt(sb.length()-1);
        System.out.println(sb.toString());
    }
}