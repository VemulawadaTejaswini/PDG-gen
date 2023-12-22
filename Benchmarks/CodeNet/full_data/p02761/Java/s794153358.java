//package atcoder;
 
import java.util.*;
import java.math.BigDecimal;
 
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int S[] = new int [N];
		int count = 0;
		boolean ok[] = new boolean[N];
		Arrays.fill(ok, true);
	
		if(M==0&&N==1) {
			System.out.println(0);
			System.exit(0);
		}
		for(int j=0;j<M;j++) {
			int n = sc.nextInt();
			int c = sc.nextInt();
			if(ok[n-1]){
				S[n-1] = c;
				ok[n-1] = false;
				if(n==1&&S[0]==0) {
					System.out.println(-1);
					System.exit(0);
					
					
				}
			}else {
				if(S[n-1]!=c) {
					System.out.println(-1);
					System.exit(0);
					//return;
				}
			}
		}
		
		if(ok[0]) {
			S[0] = 	1;
			for(int k=0;k<N;k++) {
				System.out.print(S[k]);
				
			}
			System.exit(0);
		}
		for(int l=0;l<N;l++) {
		System.out.print(S[l]);
		}
	}
}