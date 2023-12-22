import java.util.*;

public class Main {
    static int INF = 1001001009;
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i]= sc.nextInt();
        }
        
        int min = INF;
        for (int i = 0; i < n; i++) {
            int count = 0;
            while (array[i] % 2 == 0) {
                count++;
                array[i] /= 2;
            }
            
            min = Math.min(min, count);
        }
        System.out.println(min);
    }
}
