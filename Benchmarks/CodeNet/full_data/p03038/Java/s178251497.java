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
        Arrays.sort(cards);
        
        int[][] ab = new int[m][2];
        for (int i = 0; i < m; i++) {
            int k = sc.nextInt();
            int v = sc.nextInt();
            ab[i][0] = v;
            ab[i][1] = k;
        }
        
        Arrays.sort(ab, (x, y) -> Integer.compare(x[0], y[0]));
        
        int idx = 0;
        for (int i = m - 1; i > Math.max(-1, m - 1 - n); i--) {
            int k = ab[i][1];
            int v = ab[i][0];
            
            for (int j = 0; j < k; j++) {
                if (cards[idx] >= v) break;
                cards[idx] = v;
                idx++;
            }
        }
        
        long answer = 0;
        for (int val : cards) {
            answer += (long)val;
        }
        
        System.out.println(answer);
    }
}