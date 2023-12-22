import java.util.*;
public class Main {
  
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] A = new int[N];
    for (int i = 0; i < N; i++) {
      A[i] = sc.nextInt();
    }
    int a = 0;
    for (int i = 0; i < N ; i++) {
      if (i%2 == 0) {
        a += A[N-i-1];
      } else {
        a -= A[N-i-1];
      }
    }
    
    System.out.print(a + " ");
    for (int i = 0; i < N-1; i++) {
      a = 2*(A[i]-a/2);
      System.out.print(a + " ");
    }
  }  
}
