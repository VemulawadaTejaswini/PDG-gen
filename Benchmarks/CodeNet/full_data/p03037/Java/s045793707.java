import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    String[] S = sc.nextLine().split(" ");
    int N = Integer.parseInt(S[0]);
    int M = Integer.parseInt(S[1]);
    int[] val = new int[N];
    
    for(int i = 0; i < M; i++){
      String[] T = sc.nextLine().split(" ");
      int a = Integer.parseInt(T[0]);
      int b = Integer.parseInt(T[1]);
      val[a-1]++;
      if(b != N){
        val[b]--;
      }
    }
    
    int count = 0;
    for(int i = 0; i < N; i++){
      if(i == 0){
      }else{
        val[i] += val[i-1];
      }
      
      if(val[i] == M){
        count++;
      }
    }
    System.out.println(count);
  }
}