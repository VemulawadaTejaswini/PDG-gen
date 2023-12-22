import java.math.*;
import java.util.*;

	public class Main {

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int a[] = new int[n];
			int res = 0;
			
			for(int i=0;i<n;i++) {
				a[i]= sc.nextInt();
			}
			
			for(int i=0;i<n;i++) {
				res=0;
				
				for(int j=0;j<n;j++) {
					
					if(i==j) {
						continue;
					}
					
					for(int h=j+1;h<n;h++) {
						if(h==i) {
							continue;
						}
						
						if(a[j]==a[h]) {
							res++;
						}
						
						
					}
					
				    
					
					
				}
				
				System.out.println(res);
				
			}
			
			
			
		}

	}