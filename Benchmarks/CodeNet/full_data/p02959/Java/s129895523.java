import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			
			
			int N = scan.nextInt();
			long[]A = new long[N+1];
			long[]B = new long[N];
			
			for(int i = 0;i<N+1;i++)A[i] = scan.nextLong();
			for(int i = 0;i<N;i++)B[i] = scan.nextLong();
			
			long goukei = 0;
			
			for(int i = 0;i<N;i++) {
				if(A[i]>B[i]) {
					goukei+=B[i];
				}else{
					goukei+=A[i];
					B[i]-=A[i];
					if(A[i+1]>=B[i]) {
						goukei+=B[i];
						A[i+1]-=B[i];
					}else {
						goukei+=A[i+1];
						A[i+1] = 0;
					}
						
				}
			}
			
			
			System.out.println(goukei);
			
			
			
			
		}
	}
}
