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
    int k = Integer.parseInt(br.readLine());
    int[] arr = new int[50];
    int div = k/50;
    int mod = k%50;
    for (int i=0; i<50; i++) {
      arr[i] = 49+div;
    }
    for (int i=0; i<mod; i++) {
      arr[i]++;
      for (int j=i+1; j<50; j++) {
        arr[j]--;
      }
    }
    for (int i=0; i<50; i++) {
      sb.append(arr[i]);
      sb.append(" ");
    }
    sb.delete(sb.length()-1,sb.length());
    System.out.println(sb);
  }
}
