import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact = 1;
        int[] array = new int[n + 1];
        for (int i = 2; i <= n; i++) {
            fact *= i;
            
            int num = 2;
            while (num <= i) {
                if (fact % num == 0) {
                    fact /= num;
                    array[num]++;
                } else {
                    num++;
                }
            }
        }
        
        int res = 1;
        for (int i = 2; i <= n; i++) {
            res = res * (array[i] + 1) % 1000000007;
        }
        System.out.println(res);
    }
}
