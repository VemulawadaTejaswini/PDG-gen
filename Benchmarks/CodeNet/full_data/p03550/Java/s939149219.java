import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        
        int ans = 0;
        if (n == 1) {
            ans = Math.abs(array[n-1] - b);
        } else {
            ans = Math.max(Math.abs(array[n-2] - array[n-1]), Math.abs(array[n-1] - b));
        }
        System.out.println(ans);
    }
}
