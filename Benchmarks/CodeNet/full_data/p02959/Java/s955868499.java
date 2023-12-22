import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] monsters = new int[n + 1];
        int[] savers = new int[n];
        
        for (int i = 0; i <= n; i++) {
            monsters[i] = sc.nextInt();
        }
        
        for (int i = 0; i < n; i++) {
            savers[i] = sc.nextInt();
        }
        
        long count = 0;
        for (int i = 0; i < n; i++) {
            if (savers[i] <= monsters[i]) {
                count += savers[i];
                monsters[i] -= savers[i];
            } else {
                count += monsters[i];
                savers[i] -= monsters[i];
                monsters[i] = 0;
                if (savers[i] < monsters[i + 1]) {
                    count += savers[i];
                    monsters[i + 1] -= savers[i];
                } else {
                    count += monsters[i + 1];
                    monsters[i + 1] = 0;
                }
            }
        }
        
        
        System.out.println(count);
    }
}
