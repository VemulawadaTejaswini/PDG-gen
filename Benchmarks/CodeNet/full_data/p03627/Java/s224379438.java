import java.util.*;
import java.lang.*;

class Pair implements Comparable<Pair>{
  long a;
  int cnt;
  public Pair(long i, int j){
    this.a = i;
    this.cnt = j;
  }
  public int compareTo(Pair p){
    if(this.cnt == p.cnt) return 0;
    if(this.cnt<p.cnt) return -1;
    return 1;
  }
}

class Main{
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int N = Integer.parseInt(sc.next());
      HashMap<Long,Pair> map = new HashMap<>();
      ArrayList<Pair> l = new ArrayList<>();
      for(int i = 0; i<N; i++){
        long c = Long.parseLong(sc.next());
        if(!map.containsKey(c)){
           Pair p = new Pair(c,1);
           map.put(c, p);
           l.add(p);
        }else{
          Pair p = map.get(c);
          p.cnt++;
        }
      }
      long res = 0;
      int size = l.size();
      for(int i = 0; i<size; i++){
        Pair pi = l.get(i);
        if(pi.cnt<2) continue;
        for(int j = i+1; j<size; j++){
            Pair pj = l.get(j);
            if(pj.cnt>=2){
              res = Math.max(res, pj.a*pi.a);
            }
        }
      }
      System.out.println(res);
  }
}