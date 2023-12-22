import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        int[] directions = new int[n];
        for (int i = 0; i < n; i++) {
            char c = str.charAt(i);
            if (c == 'E') {
                directions[i] = 0;
            } else {
                directions[i] = 1;
            }
        }
        
        int minCount = n + 1;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < i; j++) {
                if (directions[j] != 0) {
                    count++;
                }
            }
            
            for (int j = i + 1; j < n; j++) {
                if (directions[j] != 1) {
                    count++;
                }
            }
            minCount = Math.min(minCount, count);
        }
        System.out.println(minCount);
    }
}