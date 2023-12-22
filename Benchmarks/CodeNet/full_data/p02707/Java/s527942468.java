import java.util.Scanner;

public class Main {
	
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			int N = scan.nextInt();
			int []A = new int[N];
			//Map<Integer,Integer> S = new TreeMap<Integer,Integer>();
			int[] B  = new int[N];
			
			for(int i = 1;i<N;i++) {
				A[i] = scan.nextInt();
				B[A[i]-1]++;
			}
			
			for(int i = 0;i<N;i++) {
				System.out.println(B[i]);
			}
			
			
			
			
			
			
			
		}
		
		
	}
		

}
