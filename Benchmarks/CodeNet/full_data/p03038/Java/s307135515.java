import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        PriorityQueue<Integer> que = new PriorityQueue<Integer>();
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            que.add(num);
        }
        
        int[][] array = new int[m][2];
        for (int i = 0; i < m; i++) {
            array[i][0] = sc.nextInt();
            array[i][1] = sc.nextInt();
        }
        Arrays.sort(array, (a, b) -> Integer.compare(b[1], a[1]));
        
        for (int i = 0; i < m; i++) {
            int count = array[i][0];
            int val = array[i][1];
            
            boolean ok = true;
            for (int j = 0; j < count; j++) {
                int min = que.peek();
                
                if (min < val) {
                    que.poll();
                    que.add(val);
                } else {
                    ok = false;
                    break;
                }
            }
            
            if (!ok) {
                break;
            }
        }
        
        long ans = 0;
        while (!que.isEmpty()) {
            ans += que.poll();
        }
        System.out.println(ans);
    }
}
