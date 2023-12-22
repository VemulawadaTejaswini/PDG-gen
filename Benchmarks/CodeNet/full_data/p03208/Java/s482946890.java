import java.util.*;

public class Main {
    static long INF = 1000000000000000L;
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        Arrays.sort(array);
        
        long min = INF;
        for (int i = 0; i < n - k+1; i++) {
            min = Math.min(min, array[i+k-1] - array[i]);
        }
        System.out.println(min);
    }
}
