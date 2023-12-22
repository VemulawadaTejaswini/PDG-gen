import java.util.*;
import static java.lang.System.*;

public class Main{
  public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);
	  int N = sc.nextInt();
	  int[] A = new int[N];
	  for(int i=0; i<N; i++) {
		  A[i] = sc.nextInt();
	  }

	  for(int i=1; i<=N; i++) {
		  for(int j=0; j<N;j++) {
			  if(A[j] == i) {
				  out.print(j+1 + " ");
				  break;
			  }
		  }
	  }

	  }	  
  }	