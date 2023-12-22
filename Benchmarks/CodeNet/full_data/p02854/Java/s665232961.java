import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] array = new long[n];
        long sum = 0;
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextLong();
            sum += array[i];
        }
        
        long left = 0;
        long right = 0;
        for (int i = 0; i < n; i++) {
            if (left < sum / 2) {
                left += array[i];
            } else {
                right = sum - left;
                break;
            }
        }
        
        System.out.println(Math.abs(right - left));
    }
}
