import java.util.*;

public class Main {
  static int N;
  static int Q;
  static List<S> ss;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    N = sc.nextInt();
    Q = sc.nextInt();
    ss = new ArrayList<S>();
    for (int i = 0; i < N; i++){
      int s = sc.nextInt();
      int t = sc.nextInt();
      int x = sc.nextInt();
      ss.add(new S(x,s-x,-1));
      ss.add(new S(x,t-x,-2));            
    }
    for (int i = 0; i < Q; i++) {
      int d = sc.nextInt();
      ss.add(new S(-1,d,i));
    }
    Collections.sort(ss);
    SortedSet<Integer> cons = new TreeSet<>();
    for (S s : ss) {
      if (s.index == -1) {
        cons.add(s.x);        
      } else if (s.index == -2) {
        cons.remove(s.x);        
      } else {
        int ans;
        if (cons.isEmpty()) {
          ans = -1;
        } else {
          ans = cons.first();
        }
        System.out.println(ans);
      }
    }
    
            
    
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
        return this.t - o.t;
      } else {
        return this.index - o.index;
      }
    }
  }
}