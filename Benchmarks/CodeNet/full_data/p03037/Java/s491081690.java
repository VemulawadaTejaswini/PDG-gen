import java.util.*;
import static java.lang.System.*;

public class Main{
  public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);
	  
	  int N = sc.nextInt();
	  int M = sc.nextInt();
	  int min =0, max = 10000000, count = 0;
	  
	  for(int i=0; i<M; i++) {
		  int L = sc.nextInt();
		  int R = sc.nextInt();
		  if(min < L) min = L;
		  if(max > R)max = R;
	  }
	  for(int i=min; i<=max; i++) {
		  if(i <= N) count++;
	  }
	  out.println(count);
  	}
  }	  