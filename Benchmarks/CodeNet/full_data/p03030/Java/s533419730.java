import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int N = in.nextInt();
    Pair[] a = new Pair[N];
    for(int i=0; i<N; ++i){
      String s = in.next();
      int p = in.nextInt();
      a[i] = new Pair(i+1, s, p);
    }
    Arrays.sort(a, 
      (p1, p2) -> {
        if(p1.s.equals(p2.s)){
          return p2.p - p1.p;
        }
        return p1.s.compareTo(p2.s);
      }
    );
    for(Pair p : a){
      System.out.println(p.i);
    }
  }
  static class Pair{
    int i;
    String s;
    int p;
    Pair(int i, String s, int p){
      this.i = i;
      this.s = s;
      this.p = p;
    }
  }
}