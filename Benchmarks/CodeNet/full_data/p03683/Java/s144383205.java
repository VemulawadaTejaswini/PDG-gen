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
      int M = Integer.parseInt(sc.next());
      if(Math.abs(N-M)>2)System.out.println(0);
      else{
        long mod = (long)1e9+7;
        long r = kaijou(N)%mod * kaijou(M)%mod;
        if(N==M) System.out.println(2*r%mod);
        else System.out.println(r%mod);
      }
  }
  static long kaijou(long x){
    long mod = (long)1e9+7;
    long res = 1;
    for(long i = 2; i<x+1; i++) res = res%mod*i%mod;
    return res%mod;
  }
}