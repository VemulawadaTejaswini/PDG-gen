import java.util.*;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] values = new int[n];
        int[] costs = new int[n];
        
        for (int i = 0; i < n; i++) {
            values[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            costs[i] = sc.nextInt();
        }
        
        int sum = 0;
        
        for (int i = 0; i < n; i++) {
            if (values[i] - costs[i] > 0) {
                sum += values[i] - costs[i];
            }
        }
        
        System.out.println(sum);
    }
}