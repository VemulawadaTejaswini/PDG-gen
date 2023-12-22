import java.util.*;

public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int max = 1;
    
    for (int i = 0; i < N; i++){
      max = 2**i;
      if (max > N){
        break;
      }
    }
    
    max = max / 2;
    System.out.println(max);
  }
}
