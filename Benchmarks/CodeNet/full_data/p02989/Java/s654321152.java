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
    Arrays.sort(A);
    
    for(int j=N/2; j<N; j++){
      if(A[j] > A[N/2 - 1]) {
        break;
      } else if(A[j] == A[N/2-1]) {
        counter++;
      }
    }
    if(counter>1){
      System.out.println(0);
    } else {
      System.out.println(A[N/2] - A[N/2-1]);
    }
  }
}