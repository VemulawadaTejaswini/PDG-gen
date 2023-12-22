//package atcoder;
 
import java.util.*;
import java.math.BigDecimal;
 
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int S[] = new int [N];
	
		
		for(int j=0;j<M;j++) {
			int n = sc.nextInt();
			int c = sc.nextInt();
		    S[n-1] = c;
		}
		
		for(int i=0;i<N;i++) {
		if(S[0]!=0)
		System.out.print(S[i]);
		}
		if(S[0]==0){
			System.out.println(-1);
		}
		
	}
}