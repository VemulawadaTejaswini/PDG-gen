import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int ans = 1900*M + 100*(N-M);
    for (int i = 0; i < M; i++){
      ans *= 2;
    }
    
    System.out.println(ans);
  }
}