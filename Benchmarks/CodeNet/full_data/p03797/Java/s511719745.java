import java.util.*;

public class Main{
  public static void main(String[] arg){
    Scanner sc = new Scanner(System.in);
    long N = sc.nextLong();
    long M = sc.nextLong();
    long count = 0;
    if(M > N){
      while(2*N < M){
        N += 1;
        M -= 2;
      }
    }
    while(N>=0 && M>=0){
      N -= 1;
      M -= 2;
      count += 1;
    }
    System.out.println(count-1);
  }
}
