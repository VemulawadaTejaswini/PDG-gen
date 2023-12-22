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
    int[] arr = new int[n];
    String[] s = br.readLine().split(" ");
    int prev = -1;
    int len = 1;
    int sum = 0;
    for (int i=0; i<n; i++) {
      arr[i] = Integer.parseInt(s[i]);
      if (arr[i]==prev) {
        len++;
      } else {
        sum += len/2;
        len = 1;
      }
      prev = arr[i];
    }
    sum += len/2;
    System.out.println(sum);
  }
}
