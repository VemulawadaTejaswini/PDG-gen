import java.util.*; 
import java.lang.*; 

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int M = scan.nextInt();
		
		int cnt = 0;
		
		int[] A = new int[N+1];
		for(int i=1; i<=N; i++){
			A[i] = scan.nextInt();		
			
			if(A[i]>=1/4*M){
				cnt++;
			}
		}
		
		if(cnt>=M){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}
	}	
}