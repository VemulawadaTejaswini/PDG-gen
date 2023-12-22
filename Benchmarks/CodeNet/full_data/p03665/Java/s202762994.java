/**
 * @author Finn Lidbetter
 */
import java.util.*;
import java.io.*;
import java.awt.geom.*;

public class Main {
  static long[][] dp = new long[51][2];
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    String[] s = br.readLine().split(" ");
    int n = Integer.parseInt(s[0]);
    int p = Integer.parseInt(s[1]);
    
    s = br.readLine().split(" ");
    boolean[] even = new boolean[n];
    for (int i=0; i<n; i++) {
      int v = Integer.parseInt(s[i]);
      even[i] = (v%2==0);
    }
    System.out.println(solve(even,0,0,p));

  }

  static long solve(boolean[] arr, int index, int curr, int target) {
    if (index==arr.length && curr==target) {
      return 1;
    } else if (index==arr.length) {
      return 0;
    }
    if (arr[index]) {
      return dp[index][curr] = 2*solve(arr, index+1, curr, target);
    } else {
      return dp[index][curr] = solve(arr,index+1,1-curr, target)+solve(arr,index+1,curr,target);
    }
    
  }
}
