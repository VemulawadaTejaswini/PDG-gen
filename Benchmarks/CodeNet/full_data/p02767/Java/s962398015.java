import java.util.Scanner;


	public class Main {
		
		

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
	        
			int n = sc.nextInt();
			int[] x = new int[n];
			
			for(int i=0;i<n;i++) {
				x[i] = sc.nextInt();
			}
			
			int ret = Integer.MAX_VALUE;
			int reti = 0;
			
			for(int i=x[0];i<=x[n-1];i++) {
				reti = 0;
				for(int j=0;j<n;j++) {
					reti += Math.pow((x[j]-i), 2);
				}
				
				ret = Math.min(ret, reti);
			}
			
			System.out.println(ret);
		}
	}
