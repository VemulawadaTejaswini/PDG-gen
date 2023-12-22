import java.util.*; 
import java.lang.*; 

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		long K = scan.nextInt();
		int N = scan.nextInt();
			
		long[] A = new long[N];
		
		long Ans = 0;
		
		for(int i=0; i<N;i++){
			A[i] = scan.nextInt();
		}
		
		for(int i=1; i<N;i++){
			Ans = Ans + (A[i] -A[i-1]);
		}
			
		System.out.println(Ans);
	}
}