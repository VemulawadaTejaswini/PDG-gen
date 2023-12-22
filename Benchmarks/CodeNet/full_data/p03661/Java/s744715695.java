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
      int[] a = new int[N];
      for(int i = 0; i<N; i++){
        int c = Integer.parseInt(sc.next());
        if(i == 0) a[i] = c;
        else a[i] = a[i-1]+c;
      }
      long diff = Long.MAX_VALUE;
      for(int i = 0; i<N-1; i++){
          int arai = a[N-1]-a[i];
          int d = Math.abs(a[i]-arai);
          diff = Math.min(diff,d);
      }
      System.out.println(diff);
  }
}