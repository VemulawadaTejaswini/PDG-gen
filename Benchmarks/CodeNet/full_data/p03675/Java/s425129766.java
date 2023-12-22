import java.util.*;
import java.lang.*;

// class Pair implements Comparable<Pair>{
//   long a;
//   int cnt;
//   public Pair(long i, int j){
//     this.a = i;
//     this.cnt = j;
//   }
//   public int compareTo(Pair p){
//     if(this.cnt>=2 && p.cnt >=2 && this.a<p.a) return -1;
//     if(this.cnt<2 && p.cnt>=2) return -1;
//     return 1;
//   }
// }

class Main{
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int N = Integer.parseInt(sc.next());
      if(N==1){
        System.out.println(Long.parseLong(sc.next()));
        return;
      }
      LinkedList<Long> l = new LinkedList<>();
      for(int i = 0; i<N; i++){
        long a = Long.parseLong(sc.next());
        if(i%2==0) l.push(a);
        else l.add(a);
      }
      if(N%2==1){
        for(int i = 0; i<N-1; i++) System.out.print(l.get(i)+" ");
        System.out.println(l.get(N-1));
      }else{
        for(int i = 0; i<N-1; i++) System.out.print(l.get(N-1-i)+" ");
        System.out.println(l.get(0));
      }
  }
}