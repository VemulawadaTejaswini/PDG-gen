import java.util.*;

public class Main {
  public static void main(String... args) {
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    
    int max_A = 0;
    int[] A = new int[N];
    int[] A_sort = new int[N];
    for(int i=0; i<N; i++) {
      A[i] = scan.nextInt();
      if(A[i] > max_A) max_A = A[i];
    }

    int max_B = 0;
    int[] B = new int[N];
    int[] B_sort = new int[N];
    for(int i=0; i<N; i++) {
      B[i] = scan.nextInt();
      if(B[i] > max_B) max_B = B[i];
    }
    
    if(max_A > max_B) {
      System.out.println("No");
    } else {    
      int sum = 0;
      for(int i=0; i<N; i++) {
        sum += B[i]-A[i];
      }
      System.out.println(sum>=0 ? "Yes" : "No");
    }
  }
}