import java.util.*;

public class Main {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
   int N,A,B,sum,kei,kei_n;
    N = sc.nextInt();
  	A = sc.nextInt();
 	B = sc.nextInt();
  
    sc.close();
  
    sum = 0;
    kei = A + B;
    kei_n = N - B;
     
  for(int i = 0; i < 1001; i++) {
    if(A == 0) {
      sum = 0;
      break;
    } else if (N > kei && B > A) {
      sum = N - B;
    } else if (N > kei && A < B) {
      sum = A + kei_n;  
    } else if (N == kei) {
      sum = A;
    }
    
  }
    
    System.out.print(sum);
	
	}
}
