import java.util.*;
import java.math.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        PriorityQueue<Pair> list = new PriorityQueue<Pair>((a,b)->{
          return a.a==b.a?b.b-a.b:a.a-b.a;
        });
        for(int i=0;i<N;i++){
          list.add(new Pair(sc.nextInt(),sc.nextInt()));
        }

        Pair el;
        int now = 0;
        int pre = -1;
        int cnt = 0;
        int cmax = 0;
        PriorityQueue<Integer> anses = new PriorityQueue<Integer>((a,b)->b-a);
        int ans = 0;
        for(int i=1;i<=M;i++){
          Pair p;
          while((p=list.poll()) != null){
            int a = p.a;
            int b = p.b;
            if(a<=i){
              anses.add(b);
            }else{
              list.add(p);
              break;
            }
          }
          if(!anses.isEmpty()){
            ans += anses.poll();
          }
        }
        System.out.println(ans);
    }
    private static class Pair{
      public int a, b;
      Pair(int a,int b){
        this.a = a;
        this.b = b;
      }
    }
}
