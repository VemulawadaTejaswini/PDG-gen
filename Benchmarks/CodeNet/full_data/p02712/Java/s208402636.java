import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        System.out.println(solve(in));
        
      }
      
      public static String solve(Scanner in) {
        int K = in.nextInt();
        long ans = 0;
        for (int i = 1; i <= K; i++) {
          if (i % 3 == 0 && i % 5 == 0) continue;
          else if (i % 3 == 0) continue;
          else if (i % 5 == 0) continue;
          else ans += i;
        }
        return String.valueOf(ans);
      }
      
    
}