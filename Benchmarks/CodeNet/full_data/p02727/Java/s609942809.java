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
        int[] ary = new int[3];
        ary[0] = x;
        ary[1] = y;
        ary[2] = c;
        while (true) {
            //System.out.println(ans);
            //System.out.println(ary[0] + " " + ary[1]);
            if (ary[0] == 0 && ary[1] == 0) break;
            
            int az = 0;
            int bz = 0;
            int cz = 0;
            
            if (que[0].peek() != null) az = que[0].peek();
            if (que[1].peek() != null) bz = que[1].peek();
            if (que[2].peek() != null) cz = que[2].peek();
            
            int[][] array = new int[3][2];
            array[0][0] = 0;
            array[0][1] = az;
            array[1][0] = 1;
            array[1][1] = bz;
            array[2][0] = 2;
            array[2][1] = cz;
            Arrays.sort(array, (ax, bx) -> Integer.compare(bx[1], ax[1]));    // foo[][1]で
            
            int first = array[0][0];
            int second = array[1][0];
            int third = array[2][0];
            
            if (first == 2) {
                ans += que[first].poll();
                if (az > bz) {
                    if (ary[1] > 0) {
                        ary[1]--;
                    } else {
                        ary[0]--;
                    }
                } else {
                    if (ary[0] > 0) {
                        ary[0]--;
                    } else {
                        ary[1]--;
                    }
                }
                continue;
            }
            
            if (ary[first] > 0) {
                ans += que[first].poll();
                ary[first]--;
            } else if (ary[second] > 0) {
                ans += que[second].poll();
                ary[second]--;
            }
        }
        
        System.out.println(ans);
        
    }
}