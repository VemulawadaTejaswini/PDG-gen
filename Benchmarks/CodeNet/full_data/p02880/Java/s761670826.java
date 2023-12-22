import java.util.*;

public class Main {
		public static void main(String[] args) {
		
	   Scanner sc = new Scanner(System.in);
	   
	   int N = sc.nextInt();
	   int sum = 0;
	   for(int i=1; i<10; i++) {
		   for(int j=1; j<10; j++) {
			   if(i * j == N) {
				   sum += 1;
			   }
		   }
	   }
	   if(sum == 1) {
		   System.out.println("Yes");
	   }else {
		   System.out.println("No");
	   }
		}
}
