import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int A[] = new int[N];
    int counter = 0;
    
    for(int i=0; i<N; i++) {
      A[i] = sc.nextInt();
    }
    
    for(int j=1; j<N+1; j++) {
      for(int k=0; k<N; k++) {
        if(j == A[k]) {
          System.out.print(k + 1);
        }
      }
      if(j != N){
        System.out.print(" ");
      }
    }
  }
}