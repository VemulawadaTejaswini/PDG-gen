import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		 int N = sc.nextInt();
		 int M = sc.nextInt();
		 int a = 0;
		 int b = 0;
		 
		 for(int i=0; i<N; i++) {
			 for(int j=0; j<M; j++) {
				 int sum = 2*i + (2*j + 1);
				 if(sum % 2 == 0) {
					 a++;
				 }else {
					 b++;
				 }
			 }
		 }
		 System.out.println(a);
	}
}
