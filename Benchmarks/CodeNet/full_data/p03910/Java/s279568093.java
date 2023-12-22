import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    
    int sum = 0;
    int M = 0;
    for(int i = 1; ; i++){
      sum += i;
      if(sum >= N){
        M = i;
        break;
      }
    }
    
    int except = sum - N;
    for(int i = 1; i <= M; i++){
      if(i != except){
        System.out.println(i);
      }
    }
  }
}