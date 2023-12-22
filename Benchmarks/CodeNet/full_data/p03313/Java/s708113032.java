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
    
    PriorityQueue<Pair> maxQ = new PriorityQueue<>(Collections.reverseOrder());
    PriorityQueue<Pair> minQ = new PriorityQueue<>();
    int qSize = 24;

    int n = Integer.parseInt(br.readLine());
    String[] s = br.readLine().split(" ");
    long[] arr = new long[n];
    for (int i=0; i<(1<<n); i++) {
      long v = Long.parseLong(s[i]);
      Pair p = new Pair(i,v);
      if (maxQ.size()<qSize) {
        maxQ.offer(p);
        minQ.offer(p);
      } else {
        if (v>minQ.peek().val) {
          Pair r = minQ.poll();
          maxQ.remove(r);
          maxQ.offer(p);
          minQ.offer(p);
        }
      }
      if (i>0) {
        int index1 = 0;
        long bestSum = -1;
        for (Pair p1:maxQ) {
          int index2 = 0;
          for (Pair p2:maxQ) {
            if (p1.index!=p2.index && (p1.index|p2.index)<=i  && p1.val+p2.val>bestSum) {
              bestSum = p1.val+p2.val;
            }
            index2++;
            if (index2>=index1)
              break;
              
          }
          index1++;
        }
        if (bestSum==-1) {
          throw new NullPointerException();
        }
        sb.append(bestSum);
        sb.append("\n");
      }
    }
    System.out.print(sb);
  }
}
class Pair implements Comparable<Pair> {
  int index;
  long val;
  public Pair(int ii, long vv) {
    index = ii;
    val = vv;
  }
  public int compareTo(Pair p2) {
    return (int)(val-p2.val);
  }
}
