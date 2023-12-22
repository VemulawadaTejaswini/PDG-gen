import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        
        // ans: 最長減少部分列(広義)
        
        // 符号を反転させれば減少にできる
        for (int i = 0; i < n; i++) {
            array[i] *= -1;
        }
        
        int[] lis = new int[n];
        int INF = 1001001009;
        Arrays.fill(lis, INF);
        
        for (int i = 0; i < n; i++) {
            int val = array[i];
            
            int index = upperBound(lis, val);
            lis[index] = val;
            // System.out.println(Arrays.toString(lis));
        }
        
        int length = lowerBound(lis, INF);
        System.out.println(length);
    }
    
    public static int lowerBound(int[] array, int target) {
        // target"以上の"初めての場所を返す
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
        // target"より大きい"初めての場所を返す
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
