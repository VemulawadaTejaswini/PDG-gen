import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long N = sc.nextInt();
    long a = 1000000;
    long b = 1000000;
    for(long i = 1;i < N;i++){
      for(long j = 1;j < N;j++){
        if(N == i * j){
          if(i + j < a + b){
            a = i;
            b = j;
          }
        }
      }
    }
    System.out.println(a + b - 2);

  }
}
