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
        while ((el = list.poll()) != null){
          int a = el.a;
          int b = el.b;
          if(pre != a){
            if(!anses.isEmpty()){
              int as = anses.poll();
              ans += as;
            }
          }
          pre = a;
          anses.add(b);
        }
        int as = anses.poll();
        ans += as;
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
