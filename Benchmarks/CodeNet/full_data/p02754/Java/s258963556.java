import java.util.*;

public class Main {
  public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  int N = Integer.parseInt(sc.next());
	  int A = Integer.parseInt(sc.next());
	  int B = Integer.parseInt(sc.next());
	  
	  if(A == 0) {
		  System.out.println(0);
	  }
	  else {
		  int temp = A + B;
		  int c = N / temp;
		  int d = N % temp;
		  
		  int e = 0;
		  if(d > A)
			  e = A;
		  else
			  e = d;
	  System.out.println(A*c + e);
	  }
	  
	  sc.close();
	  
  }
}