import java.util.*;
 
public class Main {
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] b = new int[n-1];
        for (int i = 0; i < n-1; i++) {
            b[i] = sc.nextInt();
        }
        
        int count = b[0] + b[n-2];
        for (int i = 0; i < n; i++) {
            count += Math.min(b[i-1], b[i]);
        }
        System.out.println(count);
        
    }
}