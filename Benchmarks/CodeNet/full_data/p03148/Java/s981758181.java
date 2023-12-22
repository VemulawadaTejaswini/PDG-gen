public class Main {
  static class P implements Comparable<P> {
   final int t, d;
    P(int t, int d) {
     this.t = t;
      this.d = d;
    }
    int compareTo(P p) {
     return d == p.d ? t - t.p : -d + p.d;
    }
  }
 public static void main(String...args) {
  final java.util.Scanner sc = new java.util.Scanner(System.in);
   final int N = sc.nextInt();
   final int K = sc.nextInt();
   final P[] ps = new P[N];
   for(int i = 0; i < N; i++)
     ps[i] = new P(sc.nextInt(), sc.nextInt());
   Arrays.sort(ps);
   long ans = 0;
   long sum = 0;
   final boolean[] used = new boolean[N + 1];
   final java.util.PriorityQueue<P> que = new java.util.PriorityQueue<>(java.util.Collections.reverseOrder());
   int k = 0;
   long x = 0;
   for(final P p : ps) 
   if(k < K){
     sum += p.d;
     k++;
     if(!used[p.t])
       x++;
     else
       que.offer(p);
     ans = Math.max(ans, sum + x * x);
   } else if(!que.isEmpty() && !used[p.t]) {
     sum -= que.poll().d;
     sum += p.d;
     x++;
     ans = Math.max(ans, sum + x * x);
   }
   System.out.println(ans);
 }
}