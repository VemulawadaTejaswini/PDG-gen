import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] w = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += sc.nextInt();
            w[i] = sum;
        }
        
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int r = Math.abs(w[i] - (sum - w[i]));
            if (r < min) {
                min = r;
            }
        }
        System.out.println(min);
    }
}
