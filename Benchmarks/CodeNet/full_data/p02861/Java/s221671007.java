import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        
        for (int i = 0; i< n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        
        double length = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) continue;
                
                length += Math.sqrt(Math.pow(x[i] - x[j], 2) + Math.pow(y[i] - y[j] , 2));
                count++;
            }
        }
        
        length *= n - 1;
        length /= count;
        System.out.println(length);
    }
}
