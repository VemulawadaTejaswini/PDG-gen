import java.util.Scanner;
import java.util.ArrayList;
import java.util.TreeSet;
import java.util.Collections;
import java.io.PrintWriter;

public class Main {
  static int N;
  static int Q;
  static ArrayList<S> ss;
  static PrintWriter writer = new PrintWriter(System.out);
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    N = Integer.parseInt(sc.next());
    Q = Integer.parseInt(sc.next());
    ss = new ArrayList<S>();
    for (int i = 0; i < N; i++){
      int s = Integer.parseInt(sc.next());
      int t = Integer.parseInt(sc.next());
      int x = Integer.parseInt(sc.next());
      ss.add(new S(x,s-x,-1));
      ss.add(new S(x,t-x,-2));            
    }
    for (int i = 0; i < Q; i++) {
      int d = sc.nextInt();
      ss.add(new S(-1,d,i));
    }
    Collections.sort(ss);
    TreeSet<Integer> cons = new TreeSet<>();
    int[] ans = new int[Q];
    for (int i =0; i<ss.size(); i++) {
      S s = ss.get(i);
      if (s.index == -1) {
        cons.add(s.x);        
      } else if (s.index == -2) {
        cons.remove(s.x);        
      } else {
        ans[s.index] = cons.isEmpty() ? -1 : cons.first();
      }
    }
    for (int i = 0; i < Q; i++) {
      writer.println(ans[i]);
    }
    writer.flush();
  }
  public static class S implements Comparable<S> {
    int x;
    int t;
    int index;
    public S(int x, int t, int index) {
      this.x = x;
      this.t = t;
      this.index = index;
    }
    public int compareTo(S o){
      int dt = this.t- o.t;
      if (dt != 0) {
        return dt;
      } else {
        return this.index - o.index;
      }
    }
  }
}
