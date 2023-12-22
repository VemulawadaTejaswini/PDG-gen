import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        Arrays.sort(b);
        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            c[i] = sc.nextInt();
        }
        Arrays.sort(c);
        
        long count = 0;
        for (int i = 0; i < n; i++) {
            count += (long)lowerBound(a, b[i]) * (n - upperBound(c, b[i]));
        }
        
        
        System.out.println(count);
    }
    
    public static int lowerBound(int[] array, int target) {
        // 初めてのtarget以上のindexを返す
        // {1, 3, 3, 7} target: 3 -> 1
        
        int left = 0;
        int right = array.length;
        
        while (left < right) {
            int center = (left + right) / 2;
            if (array[center] < target) {
                left = center + 1;
            } else {
                right = center;
            }
        }
        
        return left;
    }

    public static int upperBound(int[] array, int target) {
        // 初めてのtarget超過のindexを返す
        // {1, 3, 3, 7} target: 3 -> 3
        
        int left = 0;
        int right = array.length;
        
        while (left < right) {
            int center = (left + right) / 2;
            if (array[center] <= target) {
                left = center + 1;
            } else {
                right = center;
            }
        }
        
        return left;
    }
}
