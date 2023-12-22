import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] A = new int[N];
    int max =0;
    for (int i=0; i<N; i++) {
      A[i] = sc.nextInt();
    }
    for (int i=0; i<N; i++) {
      for (int j=i+1; j<N; j++) {
        max = Math.max(Math.abs(A[i]-A[j]),max);
      }
    }                                  
    System.out.println(max);
  }
}