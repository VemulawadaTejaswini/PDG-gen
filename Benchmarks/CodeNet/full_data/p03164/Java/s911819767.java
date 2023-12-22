import java.util.*;
 
public class Main{
  public static void main(String[]args){
    Scanner sc =  new Scanner(System.in);
    String[] s = sc.nextLine().split(" ");
    int N = Integer.parseInt(s[0]);
    int W = Integer.parseInt(s[1]);
    int[] weight = new int[N];
    int[] value = new int[N];
    
    for(int i = 0; i < N; i++){
      String[] t = sc.nextLine().split(" ");
      weight[i] = Integer.parseInt(t[0]);
      value[i] = Integer.parseInt(t[1]);
    }
    
    long[][] result = new long[N+1][W+1];
    for(int i = 0; i <= N; i++){
      for(int j = 0; j <= W; j++){
        if(i == 0 || j == 0){
          result[i][j] = 0;
        }else if(weight[i-1] > j){
          result[i][j] = result[i-1][j];
        }else{
          result[i][j] = Math.max(result[i-1][j], value[i-1]+result[i-1][j-weight[i-1]]);
        }
      }
    }
    System.out.println(result[N][W]);
  }
}