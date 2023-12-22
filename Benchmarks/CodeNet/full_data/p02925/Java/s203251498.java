import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.next());
    int[][] order = new int[N+1][N];
    for(int i = 1; i <= N; i++){
      for(int j = 1; j <= N-1; j++){
        order[i][j] = Integer.parseInt(sc.next());
      }
    }

    int[] M = new int[N+1];
    List<Integer> l = new ArrayList<>();
    for(int i = 1; i <= N; i++){
      l.add(i);
      M[i] = 1;
    }
    int ans = 0;
    boolean flag = true;
    boolean[] c = new boolean[N+1];
    while(l.size() > 0){
      List<Integer> list = new ArrayList<>();
      flag = true;
      for(int i = 0; i < l.size(); i++){
        int p = l.get(i);
        int n = order[p][M[p]];
        if(p == order[n][M[n]]){
          flag = false;
          c[p] = true;
          list.add(p);
        }
      }
      
      for(int j = 0; j < list.size(); j++){
        int m = list.get(j);
        if(c[m]){
          c[m] = false;
          M[m]++;
          if(M[m] == N){
            l.remove(l.indexOf(m));
          }
        }
      }
      if(flag){
        System.out.println(-1);
        return;
      }
      ans++;
    }
    System.out.println(ans);
  }
}