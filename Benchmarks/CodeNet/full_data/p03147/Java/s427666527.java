import java.util.Scanner;


	public class Main {

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);

			int n = sc.nextInt();
			int[] h = new int[n+2];
			int maxh = 0;
			int zero1 = 0;
			int zero2 = n;
			int ret = 0;
			
			for(int i=1;i<n+1;i++) {
				h[i] = sc.nextInt();
				maxh = Math.max(maxh, h[i]);
			}
			
			h[0] = 0;
			h[n+1] = 0;
			
			for(int i=1;i<=maxh;i++) {
				zero1 = 0;
				zero2 = n;
				for(int j=0;j<n+2;j++) {
					if(h[j]==0) {
						zero2 = j;
						
						if(zero2-zero1>1) {
							ret++;
						}
						
						zero1=zero2;
					}
				
				}
				for(int k=0;k<n+2;k++) {
					if(h[k]>0) {
						h[k]--;
					}
				}
				
			}
			
			System.out.println(ret);
			
		}
		
		
		
	}
