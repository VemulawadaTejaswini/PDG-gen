import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);
    
    int N = sc.nextInt();
    
    int[] A = new int[N];

    for (int i = 0; i < N; i++) {
      int a = sc.nextInt();
      A[a - 1] = i + 1;
    }

    sc.close();
  
    for (int i = 0; i < N; i++) {
      System.out.print(A[i]);
      if (i != N - 1) {
        System.out.print(" ");
      }
    }

    System.out.println("");
    
  }

}