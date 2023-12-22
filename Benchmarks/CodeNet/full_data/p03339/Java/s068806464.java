import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        
        int count = 0;
        int min = 100000000;
        int[] memo = new int[n];
        
        for (int i = 0; i+1 < n; i++) {
            if (s.charAt(i+1) == 'E') count++;
        }
        memo[0] = count;
        
        for (int i = 1; i < n; i++) {
            memo[i] = memo[i-1];
            if (s.charAt(i-1) == 'W') memo[i]++;
            if (s.charAt(i) == 'E') memo[i]--;
        }
        /*for (int i = 0; i < n; i++) {
            char leader = s.charAt(i);
            for (int j = 0; j < n; j++) {
                if (i == j) continue;
                char member = s.charAt(j);
                if (i > j && member == 'W') count++;
                if (i < j && member == 'E') count++;
            }
            
            min = Math.min(count, min);
            count = 0;
        }*/
        int ans = memo[0];
        for (int i = 1; i < n; i++) {
            ans = Math.min(ans, memo[i]);
        }
        System.out.println(ans);
    }
}
