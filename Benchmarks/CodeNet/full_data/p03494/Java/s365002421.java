import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int N = sc.nextInt();
    int A[] = new int[N];
    int count = 0;
    boolean bool = true;
    for(int i=0; i<N; i++) {
      A[i] = sc.nextInt();
      if(A[i] % 2 != 0){
        bool = false;
      }
    }
    while(bool) {
      for(int j=0; j<N; j++) {
        A[j] = A[j] / 2;
          if(A[j] % 2 != 0) {
            bool = false;
          }
      }
      count++;
    }
    System.out.println(count);
  }
}