import java.math.*;
import java.util.*;
	
	public class Main {
	
		public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int[][] count = new int[10][10];
			
			for(int i=0;i<=n;i++) {
				int btm = i%10;
				int top=0;
				int x = i;
				
				while(x>0) {
					top = x%10;
					x%=10;
				}
				
				count[top][btm]++;
								
			}
			
			int ans = 0;
			
			for(int i=0;i<n+1;i++) {
				for(int j=0;j<n+1;j++) {
					
					ans+=count[i][j]*count[j][i];
					
				}
			}
			
			System.out.println(ans);
			
		}
				
	}