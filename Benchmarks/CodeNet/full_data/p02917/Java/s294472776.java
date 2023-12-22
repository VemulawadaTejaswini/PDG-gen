/**
 * @author Finn Lidbetter
 */
import java.util.*;
import java.io.*;
import java.awt.geom.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    
    int n = Integer.parseInt(br.readLine());
    int[] arr = new int[n-1];
    String[] s = br.readLine().split(" ");
    int prev = 987654321;
    long sum = 0;
    for (int i=0; i<n-1; i++) {
      int curr = Integer.parseInt(s[i]);
      sum += (long)Math.min(prev, curr);
      prev = curr;
    }
    sum += prev; 
    System.out.println(sum);
  }
}
