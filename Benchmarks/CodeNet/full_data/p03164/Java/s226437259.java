import java.util.*;
 
public class Main{
  public static void main(String[]args){
    Scanner sc =  new Scanner(System.in);
    String[] s = sc.nextLine().split(" ");
    int N = Integer.parseInt(s[0]);
    int W = Integer.parseInt(s[1]);
    int[] weight = new int[N];
    int[] value = new int[N];
    
    int max_w = 0;
    int max_v = 0;
    for(int i = 0; i < N; i++){
      String[] t = sc.nextLine().split(" ");
      weight[i] = Integer.parseInt(t[0]);
      value[i] = Integer.parseInt(t[1]);
      max_w = Math.max(max_w, weight[i]);
      max_v = Math.max(max_v, value[i]);
    }
    
    int M = max_v * N;
    int MM = max_w * N;
    long[][] result = new long[N+1][M+1];
    for(long[] arr : result){
      Arrays.fill(arr, MM);
    }
    result[0][0] = 0;
    for(int i = 0; i <= N; i++){
      for(int j = 0; j <= M; j++){
        if(i == 0){
        }else if(j - value[i-1] >= 0){
          result[i][j] = Math.min(result[i-1][j], weight[i-1]+result[i-1][j - value[i-1]]);
        }else{
          result[i][j] = result[i-1][j];
        }
      }
    }
    for(int i = M; i >= 0; i--){
      if(result[N][i] <= W){
        System.out.println(i);
        break;
      }
    }
  }
}