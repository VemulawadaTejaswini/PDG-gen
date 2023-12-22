import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] locations = new int[n];
        for(int i = 0; i < n; i++)
            locations[i] = sc.nextInt();

        long minDist = Long.MAX_VALUE;
        if(k == 1) {
            for(int i = 0; i < n; i++)
                minDist = Math.min(minDist, Math.abs(locations[i]));
        } else {
            long curDist = 0L;
            for(int i = 1; i < n; i++) {
                long diff = locations[i] - locations[i-1];
                curDist += diff;
                if(i >= k - 1) {
                      long left = Math.abs(0 - locations[i-k+1]);
                      long right = Math.abs(0 - locations[i]);
                      minDist = Math.min(Math.min(left, right) + curDist, minDist);
                      diff = locations[i-k+2] - locations[i-k+1];
                      curDist -= diff;
                }
            }
        }
        System.out.println(minDist);
    }
}
