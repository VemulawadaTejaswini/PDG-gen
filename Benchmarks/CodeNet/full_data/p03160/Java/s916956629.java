import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());
    String[] s = sc.nextLine().split(" ");
    int[] cost = new int[N];
    for(int i = 0; i < N; i++){
      cost[i] = Integer.parseInt(s[i]);
    }
    
    int[] result = new int[N];
    for(int i = 0; i < N; i++){
      if(i == 0){
        result[i] = 0;
      }else if(i == 1){
        result[i] = Math.abs(cost[i] - cost[i-1]);
      }else{
        int a = Math.abs(cost[i] - cost[i-1]) + result[i-1];
        int b = Math.abs(cost[i] - cost[i-2]) + result[i-2];
        result[i] = (a < b ? a: b);
      }
    }
    System.out.println(result[N-1]);
  }
}