import java.util.*;

public class Main {
    static long MOD = 1000000007;
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[3];
        
        long ans = 1;
        while (n-- > 0) {
            int num = sc.nextInt();
            
            long count = 0;
            for (int i = 0; i < 3; i++) {
                if (array[i] == num) count++;
            }
            
            if (count == 0) {
                System.out.println(0);
                return;
            }
            
            ans *= count;
            ans %= MOD;
            
            for (int i = 0; i < 3; i++) {
                if (array[i] == num) {
                    array[i]++;
                    break;
                }
            }
        }
        System.out.println(ans);
    }
}
