import java.util.*;

public class Main {
		public static void main(String[] args) {
		
	   Scanner sc = new Scanner(System.in);
	   
	   int N = sc.nextInt();
	   int A = sc.nextInt();
	   int B = sc.nextInt();
	   
	   int sum = 0;
	   int b = 0;
	   int c = N/(A+B);
	   	   
	   for(int i=0; i<c; i++) {
		   sum += A;
		   sum += B;
		   b += A;
		   if(sum >= N) {
			   break;
		   }
		   System.out.println(b);
	   }
	   
	   }
}

