import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), sum = 0;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        
        double avg = (double)sum / n, minDiff = Double.MAX_VALUE;
        int minIndex = 0;
        for (int i = 0; i < n; i++) {
            double diff = Math.abs(avg - arr[i]);
            if (diff < minDiff - 1e-4) {
                minDiff = diff;
                minIndex = i;
            }
        }
        
        System.out.println(minIndex);
    }
}
