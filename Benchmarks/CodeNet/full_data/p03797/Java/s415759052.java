import java.util.*;

public class Main{
  public static void main(String[] arg){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int count = 0;
    while(2*N < M){
      N += 1;
      M -= 2;
    }
    while(N>1 || M >1){
      N -= 1;
      M -= 2;
      count+=1;
    }
    System.out.println(count);
  }
}
