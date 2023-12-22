import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long N = sc.nextLong();
    long a = 10000000000l;
    long b = 10000000000l;
    long root = 1;
    for(long aa = 1l;aa < N;aa++){
      if(aa * aa > N){
        break;
      }
      root = aa;
    }
    for(long i = 1l;i < N;i++){
      for(long j = 1l;j <= root;j++){
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
