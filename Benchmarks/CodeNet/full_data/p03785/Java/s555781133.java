import java.util.*;

public class Main {
    static int MOD = 1000000007;
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();
        int k = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        Arrays.sort(array);
        
        int ans = 0;
        int index = 0;
        while (index <= n - 1) {
            // System.out.println(index);
            int tmp = array[index];
            ans++;
            for (int i = 0; i < c; i++) {
                if (index > n - 1) break;
                if (array[index] <= tmp + k) {
                    index++;
                } else {
                    break;
                }
            }
        }
        System.out.println(ans);
    }
}
