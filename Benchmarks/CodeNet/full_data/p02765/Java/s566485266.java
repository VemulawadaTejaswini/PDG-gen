import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] X = new int[N+1];
    X[0] = 0;
    for (int i = 1; i <= N; i++) {
      X[i] = sc.nextInt();
    }
    
    int hp = 2147483647;
    for (int P = 0; P <= N*3; P++) {
      int sum = 0;
      for (int j = 1; j <= N; j++) {
        sum += (X[j]-P) * (X[j]-P);
      }
      if (sum < hp) {
        hp = sum;
      }
    }
    
    System.out.println(hp);
  }
}