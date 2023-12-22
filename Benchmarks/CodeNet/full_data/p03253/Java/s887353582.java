import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    List<Integer> list = new ArrayList<>();
    int count = 0;
    for(int i = 1; i * i <= M; i++){
      if(M % i == 0){
        list.add(i);
        count++;
        if(i * i != M){
          list.add(M/i);
          count++;
        }
      }
    }
    Collections.sort(list);
    long[][] memo = new long[N+1][list.size()];
    for(int i = 0; i < memo[0].length; i++){
      memo[1][i] = 1;
    }
    System.out.println(ans(list, memo, N, M));
  }
  
  public static long ans(List<Integer> list, long[][] memo, int N, int M){
    for(int i = 2; i <= N; i++){
      for(int j = 0; j < list.size(); j++){
        long count = 0;
        for(int k = 0; k <= j; k++){
          if(list.get(j) % list.get(k) == 0){
            count += memo[i-1][k];
          }
        }
        count = count % (1000000000L+7);
        memo[i][j] = count;
      }
    }
    return memo[N][list.size()-1];
  }
}