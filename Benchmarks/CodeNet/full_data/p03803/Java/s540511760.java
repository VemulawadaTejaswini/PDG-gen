import java.util.*;
 
public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    
    String A[] = new String[N];
    
    for(int i=0; i<N; i++){
      A[i]=sc.next();
    }
    
    String B[] = new String[M];
    
    for(int i=0; i<M; i++){
      B[i]=sc.next();
    }
    
    String ans = "No";
    
    for(int i=0; i<=M; i++){
      
      for(int j=0; j<=M;j++){
        if(A[i].substring(j).startsWith(B[0])){
          ans = "Yes";
          for (int k = 1; k < M-1; k++) {
            if (!A[i + k].substring(j).startsWith(B[k])) {
              ans = "No";
            }
          }
          if(ans.equals("Yes")){
            break;
          }
        }
      }
    }
    System.out.println(ans);
    
  }
}
    
    
