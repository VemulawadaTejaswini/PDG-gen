import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long k = sc.nextLong();
        
        int[] costs = new int[n];
        int[] amounts = new int[n];
        for (int i = 0; i < n; i++) {
            costs[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            amounts[i] = sc.nextInt();
        }
        Arrays.sort(costs);
        Arrays.sort(amounts);
        
        long left = 0;
        long right = 1000000000000l;
        while (left < right) {
            long center = (left + right) / 2;
            boolean ok = true;
            
            // okがどうかの判定
            long count = 0;
            for (int i = 0; i < n; i++) {
                if (center < (long)costs[n - 1 - i] * amounts[i]) {
                    long tmp = center / amounts[i];
                    count += costs[n - 1 - i] - tmp;
                }
                
                if (count > k) {
                    ok = false;
                }
            }
            
            if (ok) {
                right = center;
            } else {
                left = center + 1;
            }
        }
        
        System.out.println(left);
    }
}
