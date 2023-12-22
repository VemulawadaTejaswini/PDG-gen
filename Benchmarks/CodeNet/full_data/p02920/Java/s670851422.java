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
    TreeMap<Integer,Integer> have = new TreeMap<>(Collections.reverseOrder());
    TreeMap<Integer,Integer> toCome = new TreeMap<>();
    String[] s = br.readLine().split(" ");
    int max = 0;
    for (int i=0; i<(1<<n); i++) {
      int val = Integer.parseInt(s[i]);
      if (toCome.containsKey(val)) {
        toCome.put(val, toCome.get(val)+1);
      } else {
        toCome.put(val, 1);
      }
      if (val>max)
        max = val;
    }
    have.put(max, 1);
    if (toCome.get(max)==1) {
      toCome.remove(max);
    } else {
      toCome.put(max, toCome.get(max)-1);
    }
    
    for (int i=0; i<n; i++) {
      TreeMap<Integer, Integer> update = new TreeMap<>();
      for (int val: have.keySet()) {
        for (int j=0; j<have.get(val); j++) {
          Integer next = toCome.lowerKey(val);
          if (next==null) {
            System.out.println("No");
            return;
          }
          toCome.put(next, toCome.get(next) - 1);
          if (toCome.get(next)==0) 
            toCome.remove(next);
          if (update.containsKey(next)) {
            update.put(next, update.get(next)+1);
          } else {
            update.put(next, 1);
          }
        }
      }
      for (int val: update.keySet()) {
        if (have.containsKey(val)) {
          have.put(val, have.get(val) + update.get(val));
        } else {
          have.put(val, update.get(val));
        }
      }
    }
    System.out.println("Yes");
  }
}
