import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args)  {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String a = br.readLine();
            String b = br.readLine();
          	Main app = new Main();
            int k = Integer.parseInt(a.split(" ")[1]);
            String[] split = b.split(" ");
            int[] A = new int[split.length];
            for (int i = 0; i < split.length; i++) {
               A[i] = Integer.parseInt(split[i]); 
            }
            boolean[] dp = new boolean[k + 1];
            for (int stones = 0; stones <= k; stones++) {
                for (int x: A) {
                    if (stones >= x && !dp[stones - x]) {
                        dp[stones] = true;
                        break;
                    }
                }
            }
            System.out.println(dp[k] ? "First" : "Second");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
