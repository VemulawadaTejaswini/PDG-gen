import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        
        for (int i = 0; i < n; i++) {
            array[sc.nextInt() - 1] = i;
        }
        
        int count = 1;
        int max = 1;
        for (int i = 0; i < n - 1; i++) {
            if (array[i] < array[i + 1]) {
                count++;
            } else {
                max = Math.max(max, count);
                count = 1;
            }
        }
        
        if (count > 2) {
            max = Math.max(max, count);
        }
        
        System.out.println(n - max);
    }
}
