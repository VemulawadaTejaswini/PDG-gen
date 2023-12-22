import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here! 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n+2];
        array[0] = 0;
        array[n+1] = 0;
        for (int i = 1; i <= n; i++) {
            array[i] = sc.nextInt();
        }
        
        int[] tmp = new int[n+2];
        for (int i = 1; i < n+2; i++) {
            tmp[i] = tmp[i-1] + Math.abs(array[i] - array[i-1]);
        }
        // System.out.println(Arrays.toString(tmp));
        
        int[] cut = new int[n+2];
        for (int i = 1; i <= n; i++) {
            if (array[i-1] <= array[i+1] && array[i+1] <= array[i]) {
                cut[i] = Math.abs(array[i+1] - array[i]) * 2;
            } else if (array[i] <= array[i-1] && array[i-1] <= array[i+1]) {
                cut[i] = Math.abs(array[i-1] - array[i]) * 2;
            } else if (array[i+1] <= array[i-1] && array[i-1] <= array[i]) {
                cut[i] = Math.abs(array[i-1] - array[i]) * 2;
            } else if (array[i] <= array[i+1] && array[i+1] <= array[i-1]) {
                cut[i] = Math.abs(array[i+1] - array[i]) * 2;
            }
        }
        
        for (int i = 1; i <= n; i++) {
            System.out.println(tmp[n+1] - cut[i]);
        }
    }
}