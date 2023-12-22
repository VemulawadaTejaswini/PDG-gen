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
        int[] anses = new int[M*2];
        while ((el = list.poll()) != null){
          int a = el.a;
          int b = el.b;
          if(pre == a)cnt++;
          else cnt = 0;
          if(now <= a){
            for(int i=0;a+i<=M;i++){
              if(anses[a+i] < b){
                for(int j=a+i+1;j<=M+1;j++){
                  anses[j] = anses[j-1];
                  if(anses[j] == 0)break;
                }
                anses[a+i] = b;
                break;
              }
            }
          }
          pre = a;
        }
        int ans = 0;
        for(int i=0;i<=M;i++){
          ans += anses[i];
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
