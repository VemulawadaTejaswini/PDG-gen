import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        PriorityQueue<Integer> que = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            que.add(sc.nextInt());
        }
        
        while (m-- > 0) {
            int k = sc.nextInt();
            int v = sc.nextInt();
            
            int c = 0;
            for (int i = 0; i < k; i++) {
                int num = que.peek();
                if (num < v) {
                    que.poll();
                    c++;
                } else {
                    break;
                }
            }
            for (int i = 0; i < c; i++) {
                que.add(v);
            }
        }
        
        long ans = 0;
        while (!que.isEmpty()) {
            ans += que.poll();
        }
        System.out.println(ans);
    }
}
