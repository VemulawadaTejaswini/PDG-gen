import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc =  new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());
    int[][] happiness = new int[N][3];
    for(int i = 0; i < N; i++){
      String[] s = sc.nextLine().split(" ");
      happiness[i][0] = Integer.parseInt(s[0]);
      happiness[i][1] = Integer.parseInt(s[1]);
      happiness[i][2] = Integer.parseInt(s[2]);
    }
    
    int[][] result = new int[N][3];
    result[0][0] = happiness[0][0];
    result[0][1] = happiness[0][1];
    result[0][2] = happiness[0][2];
    for(int i = 0; i < N-1; i++){
      for(int j = 0; j < 3; j++){
        for(int k = 0; k < 3; k++){
          if(j == k){
            continue;
          }
          
          if(result[i][j] + happiness[i+1][k] > result[i+1][k]){
            result[i+1][k] = result[i][j] + happiness[i+1][k];
          }
        }
      }
    }
    int max = 0;
    for(int i = 0; i < 3; i++){
      if(result[N-1][i] > max){
        max = result[N-1][i];
      }
    }
    System.out.println(max);
  }
}