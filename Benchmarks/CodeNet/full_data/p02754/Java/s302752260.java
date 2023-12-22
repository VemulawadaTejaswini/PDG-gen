import java.util.*;

public class Main {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
   int N,A,B,sum;
    N = sc.nextInt();
  	A = sc.nextInt();
 	B = sc.nextInt();
  
    sc.close();
  
    sum = 0;
     
  for(int i = 0; i < 1001; i++) {
    if(A == 0) {
      sum = 0;
    } else if (B > A) {
      sum = N - B;
    } else {
      sum = A;
    }
    
  }
    
    System.out.print(sum);
	
	}
}
