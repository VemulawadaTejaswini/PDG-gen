import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			int N = scan.nextInt();
			int[]A = new int[N];
			int[]B = new int[N];// ソート用
			StringBuilder sb = new StringBuilder();
			
			for(int i = 0;i<N;i++) {
				A[i] = scan.nextInt();
				B[i] = A[i];
			}			
			Arrays.sort(B);
			
			for(int i = 0;i<N;i++) {
			//sb.append(B[i]);
			}
			
			System.out.println(sb.toString());
			int x = B[N-1];
			int dx=x;
			for(int i = N-1;i>=0;i--) {
				if(B[i]<x) {
					dx = B[i];
					break;
				}
			}
			
			
			
			
			for(int i = 0;i<N;i++) {
				
				if(A[i]<x) {
					System.out.println(x);
				}else{
					System.out.println(dx
							);
					
				}
			}
			
		}
		
		
	}
		

}
