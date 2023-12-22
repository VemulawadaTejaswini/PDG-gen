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
     
    if(A == 0) {
      sum = 0;
    } else if (B > A) {
      sum = N - B;
    } else {
      sum = A;
    }
    
    System.out.print(sum);
	
	}
}
