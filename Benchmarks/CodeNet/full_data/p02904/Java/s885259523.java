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
    
    String[] s = br.readLine().split(" ");
    int n = Integer.parseInt(s[0]);
    int k = Integer.parseInt(s[1]);
    s = br.readLine().split(" ");
    int[] arr = new int[n];
    for (int i=0; i<n; i++) {
      arr[i] = Integer.parseInt(s[i]);
    }
    TreeSet<Integer> window = new TreeSet<>();
    int tail = 1;
    boolean noChangeSeen = false;
    for (int i=0; i<k; i++) {
      window.add(arr[i]);
    }
    for (int i=k-1; i>0; i--) {
      if (arr[i]>arr[i-1]) {
        tail++;
      } else {
        break;
      }
    }
    if (tail==k) {
      noChangeSeen = true;
    }
    int count = 1;
    for (int i=k; i<n; i++) {
      if (arr[i]>arr[i-1]) {
        if (tail<k) {
          tail++;
        }
      } else {
        tail = 1;
      }
      if (tail==k && !noChangeSeen) {
        count++;
        noChangeSeen = true;
      }
      if (tail!=k) {
        if (!(arr[i]>window.last() && arr[i-k]==window.first())) {
          count++;
        }
      }
      window.remove(arr[i-k]);
      window.add(arr[i]);
    }
    System.out.println(count);
  }
}
