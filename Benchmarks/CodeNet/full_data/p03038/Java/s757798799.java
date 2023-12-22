import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] cards = new int[n];
        for (int i = 0; i < n; i++) {
            cards[i] = sc.nextInt();
        }
        
        int[][] ab = new int[m][2];
        for (int i = 0; i < m; i++) {
            ab[i][0] = sc.nextInt();
            ab[i][1] = sc.nextInt();
        }
        
        Arrays.sort(ab, (x, y) -> Integer.compare(y[0], x[0]));
        
        for (int i = m - 1; i >= 0; i--) {
            int k = ab[i][0];
            int v = ab[i][1];
            Arrays.sort(cards);
            if (v <= cards[0]) break;
            
            for (int j = 0; j < k; j++) {
                if (cards[j] >= v) break;
                cards[j] = v;
            }
        }
        
        long answer = 0;
        for (int val : cards) {
            answer += (long)val;
        }
        
        System.out.println(answer);
    }
}
