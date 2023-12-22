import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    int Q = sc.nextInt();
    int p[] = new int[N];
    int A;
    
    for(int i=0; i<N; i++) {
      p[i] = K - Q;
    }
    
    for(int j=0; j<Q; j++) {
      A = sc.nextInt();
      p[A-1]++;
    }
    
    for(int k=0; k<N; k++) {
      if(p[k]>0) {
        System.out.println("Yes");
      } else {
        System.out.println("No");
      }
      
    }   
  }
}