import java.util.*;

class Main{
    public static void main(String[] arg){
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      int now = 0,ans = 0,x = 0;
      List<Integer> listN = new ArrayList<>();
      for(int i = 0; i < N; i++)listN.add(sc.nextInt());
      while(x < N){
        now = listN.get(now);
        ans ++;
        if(now == 2){
          System.out.println(ans + 1);
          System.exit(0);
        x++;
        }
      }
      System.out.println(-1);



    }
}
