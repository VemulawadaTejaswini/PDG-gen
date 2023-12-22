import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int k = sc.nextInt();
        int[][] sums = new int[h + 1][w + 1];
        for (int i = 1; i <= h; i++) {
            char[] arr = sc.next().toCharArray();
            for (int j = 1; j <= w; j++) {
                sums[i][j] = sums[i - 1][j] + sums[i][j - 1] - sums[i - 1][j - 1];
                if (arr[j - 1] == '1') {
                    sums[i][j]++;
                }
            }
        }
        ArrayDeque<ArrayList<Unit>> deq = new ArrayDeque<>();
        ArrayDeque<ArrayList<Unit>> decided = new ArrayDeque<>();
        for (int i = 1; i <= h; i++) {
            ArrayList<Unit> list = new ArrayList<>();
            list.add(new Unit(0, i));
            if (i == h) {
                decided.add(list);
            } else {
                deq.add(list);
            }
        }
        while (deq.size() > 0) {
            ArrayList<Unit> u = deq.poll();
            int start = u.get(u.size() - 1).down;
            for (int i = start + 1; i < h; i++) {
                ArrayList<Unit> base = (ArrayList<Unit>)(u.clone());
                base.add(new Unit(start, i));
                deq.add(base);
            }
            u.add(new Unit(start, h));
            decided.add(u);
        }
        int min = Integer.MAX_VALUE;
        while (decided.size() > 0) {
            ArrayList<Unit> each = decided.poll();
            int left = 0;
            int right = left + 1;
            int count = 0;
            while (left < w) {
                if (getMax(left, right, each, sums) > k) {
                    count = Integer.MAX_VALUE / 2;
                    break;
                }
                while (right < w && getMax(left, right + 1, each, sums) <= k) {
                    right++;
                }
                count++;
                left = right;
                right = left + 1;
            }
            min = Math.min(min, each.size() - 1 + count - 1);
        }
        System.out.println(min);
   }
   
   static int getMax(int left, int right, ArrayList<Unit> each, int[][] sums) {
       int max = 0;
       for (Unit u : each) {
           max = Math.max(max, sums[u.down][right] - sums[u.up][right] - sums[u.down][left] + sums[u.up][left]);
       }
       return max;
   }
   
   static class Unit {
       int up;
       int down;
       
       public Unit(int up, int down) {
           this.up = up;
           this.down = down;
       }
       
       public String toString() {
           return up + ":" + down;
       }
   }
}
