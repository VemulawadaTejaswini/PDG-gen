import java.util.*;
import java.util.stream.*;

public class Main {
  
  private static boolean DEBUG = false;
  
  private static void debug(String msg) {
    if ( DEBUG == false ) {
      return;
    }
    System.out.println(msg);
  }
  
  public static void main(String[] args) {
	int N, M;
    Arbeit[] arb;
    try(Scanner sc = new Scanner(System.in)) {
      N = sc.nextInt();
      M = sc.nextInt();
      arb = new Arbeit[N];
      for(int i = 0; i < N; i++) {
        arb[i] = new Arbeit(sc.nextInt(), sc.nextInt());
      }
    }
    int answer = new Solver().solve(M, arb);
    System.out.println(answer);
  }
  
  private static class Arbeit implements Comparable<Arbeit> {
    private final int A;
    private final int B;
    
    public Arbeit(int A, int B) {
      this.A = A;
      this.B = B;
    }
    
    @Override
    public String toString() {
      return new StringBuilder()
        			.append("[").append(A).append(",").append(B).append("]")
        		.toString();
    }
    
    @Override
    public int hashCode() {
      int result = 17;
      result = 31 * result + A;
      result = 31 * result + B;
      return result;
    }
    
    @Override
    public int compareTo(Arbeit o) {
      if ( o == null ) {
        return 1;
      }
      if ( B < o.B ) {
        return 1;
      }
      else if ( B > o.B ) {
        return -1;
      }
      return 0;
    }
    
  }
  
  private static class ArbeitMap {
    
    private final PriorityQueue<Arbeit> pq;
    
    private final Map<Integer,Set<Arbeit>> map;
    
    public ArbeitMap(Arbeit[] arb) {
      pq = new PriorityQueue<>();
      map = new HashMap<>();
      for ( Arbeit a : arb ) {
        int key = a.A;
        Set<Arbeit> set = map.get(key);
        if ( set == null ) {
          set = new TreeSet<>();
          map.put(key, set);
        }
        set.add(a);
      }
    }
    
    public String toDumpString() {
      return new StringBuilder()
        			.append("q=").append(pq)
        		.toString();
    }
    
    public Arbeit getMaxReturnArbeit(int i) {
      Set<Arbeit> set = map.get(i);
      if ( set != null ) {
        pq.addAll(set);
        debug(toDumpString());
      }
      if ( pq.isEmpty() ) {
        return null;
      }
      return pq.poll();
    }
    
    public void remove(Arbeit a) {
      if ( a == null ) {
        return;
      }
      Set<Arbeit> set = map.get(a.A);
      if ( set == null ) {
        return;
      }
      set.remove(a);
      pq.remove(a);
    }
  }

  private static class Solver {
    
    public int solve(int m, Arbeit[] arb) {
      ArbeitMap arbMap = new ArbeitMap(arb);
      int value = 0;
      for(int i = 1; i <= m; i++) {
        debug(arbMap.toDumpString());
        Arbeit a = arbMap.getMaxReturnArbeit(i);
        if ( a != null ) {
          debug(a.toString());
          value += a.B;
          arbMap.remove(a);
        }
      }
      return value;
    }
  }
}