import java.util.*;
import static java.lang.System.*;

public class Main{
  public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);
	  
	  int N = sc.nextInt();
	  int[] A = new int[N+1];
	  int[] B = new int[N];
	  long count = 0;  
	  for(int i=0; i<N+1; i++) {
		  A[i] = sc.nextInt();
	  }
	  for(int i=0; i<N; i++) {
		  B[i] = sc.nextInt();
	  }
	  
	  for(int i=0; i<N; i++) {
		  int n = Math.min(A[i], B[i]);
		  count += n;
		  B[i] -= n;
		  A[i] -= n;
		  int m = Math.min(A[i+1], B[i]);
		  count += m;
		  A[i+1] -= m;
	  }
	  out.println(count);  
	  
  }
}