import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int MOD = 998244353;
        int[] array = new int[100001];
        
        int max = 0;
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            max = Math.max(max, num);
            array[num]++;
        }
        
        if (n == 1 && array[0] == 1) {
            System.out.println(1);
            return;
        }
        
        if (array[0] != 1) {
            System.out.println(0);
            return;
        }
        
        long answer = 1;
        for (int i = 1; i <= max; i++) {
            if (array[i] == 0) {
                System.out.println(0);
                return;
            }
            
            for (int j = 1; j <= array[i]; j++) {
                answer = (answer * array[i - 1]) % MOD;
            }
        }
        
        System.out.println(answer);
        
    }
}
