import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 int N = scan.nextInt();
		 int A[] = new int[N];
		 int B[] = new int[N];
		 
		 for (int i = 0; i < N; i++ ) {
			 A[i] = scan.nextInt();
			 B[i] = scan.nextInt();
		 }
		 
		 int tmp;
		 for (int i = 0; i < N; i++ ) {
			 for (int j = i; j < N; j++ ) {
				 if (B[i] > B[j]) {
					 tmp = B[i];
					 B[i] = B[j];
					 B[j] = tmp;
					 
					 tmp = A[i];
					 A[i] = A[j];
					 A[j] = tmp;
				 }
			 }
		 }
		 
		 String result_msg = "Yes";
		 int used_working_time = 0;
		 for (int i = 0; i < B.length; i++ ) {
			 if (B[i] - used_working_time < A[i]) {
				 result_msg = "No";
				 break;
			 }
			 used_working_time += A[i];
		 }
		 
		 System.out.println(result_msg);
		 
		 scan.close();
		 
	}

}
