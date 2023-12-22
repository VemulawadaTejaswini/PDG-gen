import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n2 = n;
        int[] array = new int[n];
        boolean[] visited = new boolean[n];
        
        for (int i = 0; i < n; i++) {
            int number = sc.nextInt();
            array[i] = number;
        }
        
        int colorCount = 0;
        
        for (int i = 0; i < n; i++) {
            if (visited[i]) continue;
            int now = array[i];
            
            if (i == n - 1) {
                colorCount++;
                break;
            }
            
            for (int j = i + 1; j < n; j++) {
                if (visited[j]) continue;
                if (array[j] > now) {
                    visited[j] = true;
                    now = array[j];
                }
            }
            colorCount++;
        }
        
        System.out.println(colorCount);
    }
}
