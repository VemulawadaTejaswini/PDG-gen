import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        
        PriorityQueue<Integer>[] que = new PriorityQueue[3];
        for (int i = 0; i < 3; i++) {
            que[i] = new PriorityQueue<>(Collections.reverseOrder()); // 降順で
        }
        
    
        for (int i = 0; i < a; i++) {
            que[0].add(sc.nextInt());
        }
        for (int i = 0; i < b; i++) {
            que[1].add(sc.nextInt());
        }
        for (int i = 0; i < c; i++) {
            que[2].add(sc.nextInt());
        }
        
        long ans = 0;
        PriorityQueue<Integer>[] queue = new PriorityQueue[2];
        for (int i = 0; i < 2; i++) {
            queue[i] = new PriorityQueue<>(); // 降順で
        }
        for (int i = 0; i < x; i++) {
            ans += que[0].peek();
            queue[0].add(que[0].poll());
        }
        for (int i = 0; i < y; i++) {
            ans += que[1].peek();
            queue[1].add(que[1].poll());
        }
        
        while (true) {
            if (que[2].peek() == null) break;
            
            int az = 0;
            int bz = 0;
            int cz = 0;
            
            if (queue[0].peek() != null) az = queue[0].peek();
            if (queue[1].peek() != null) bz = queue[1].peek();
            if (que[2].peek() != null) cz = que[2].peek();
            
            if (az >= cz && bz >= cz) break;
            
            if (az < bz) {
                if (az < que[2].peek()) {
                    ans += (que[2].poll() - az);
                    queue[0].poll();
                }
            } else {
                if (bz < que[2].peek()) {
                    ans += (que[2].poll() - bz);
                    queue[1].poll();
                }
            }
        }
        
        System.out.println(ans);
        
    }
}