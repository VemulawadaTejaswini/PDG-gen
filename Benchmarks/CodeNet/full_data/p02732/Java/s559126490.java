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
			
			for(int k=1;k<=n;k++) {
				int nA = 0;
				int kA = 0;
				
				for(int i=1;i<=n;i++) {
					
					for(int j=i+1;j<=n;j++) {
						if(a[i]==a[j]) {
							nA++;
						}
						
						
					}
				}
				
				for(int i=1;i<=n;i++) {
					if(k==i) {
						continue;
					}else{
						if(a[k]==a[i]) {
							kA++;
						}
					}
				}
				
				res = nA-kA;
				System.out.println(res);
			}
			
			
		}

	}