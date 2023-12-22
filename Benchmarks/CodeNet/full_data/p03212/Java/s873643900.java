import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = str.length();
        int num = Integer.parseInt(str);
        
        Queue<int[]> que = new ArrayDeque<int[]>();
        que.add(new int[]{3, 1, 0, 0});
        que.add(new int[]{5, 0, 1, 0});
        que.add(new int[]{7, 0, 0, 1});
        
        int count = 0;
        while (true) {
            int[] cur = que.poll();
            int tmp = cur[0];
            int x = cur[1];
            int y = cur[2];
            int z = cur[3];
            
            //if (tmp > 770000000) System.out.println(Arrays.toString(cur));
            
            if (x * y * z == 1) count++;
            
            if (tmp > num) break;
            
            que.add(new int[]{tmp * 10 + 3, x | 1, y, z});
            que.add(new int[]{tmp * 10 + 5, x, y | 1, z});
            que.add(new int[]{tmp * 10 + 7, x, y, z | 1});
        }
        
        System.out.println(count);
    }
}
