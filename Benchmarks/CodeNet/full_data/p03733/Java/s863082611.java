import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        
        long ans = 0;
        for (int i = 0; i < n - 1; i++) {
            ans += Math.min(array[i+1] - array[i],t);
        }
        System.out.println(ans+t);
    }
}
