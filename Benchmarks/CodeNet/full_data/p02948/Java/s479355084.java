import java.util.*;
 
public class Main{
  public static void main(String[]args){
    Scanner sc =  new Scanner(System.in);
    String[] S = sc.nextLine().split(" ");
    int N = Integer.parseInt(S[0]);
    int M = Integer.parseInt(S[1]);
    
    int[][] d = new int[N][2];
    for(int i = 0; i < N; i++){
      String[] T = sc.nextLine().split(" ");
      d[i][0] = Integer.parseInt(T[0]);
      d[i][1] = Integer.parseInt(T[1]);
    }
    Arrays.sort(d, (a, b) -> Integer.compare(a[0], b[0]));
    
    long ans = 0;
    int now = N-1;
    for(int i = M; i > 0; i--){
      int max = 0;
      int tem = 0;
      if(d[now][0] != i){
	    for(int j = now; j >= 0; j--){
          if(d[j][0] <= i && max < d[j][1]){
            max = d[j][1];
            tem = j;
          }
        }
        if(max > 0){
          ans += max;
          d[tem][1] = 0;
        }
      }else{
        for(int j = now; j >= 0; j--){
          if(d[j][0] != i){
            now = j;
            break;
          }
          if(d[j][0] <= i && max < d[j][1]){
            max = d[j][1];
            tem = j;
          }
        }
        ans += max;
        d[tem][1] = 0;
      }
    }
    System.out.println(ans);
  }
}