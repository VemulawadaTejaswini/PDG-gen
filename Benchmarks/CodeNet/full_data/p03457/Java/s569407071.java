import java.util.Scanner;

	public class Main {

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			
			int n = sc.nextInt();
			int[] t = new int[n];
			int[] x = new int[n];
			int[] y = new int[n];
			
			for(int i=0;i<n;i++) {
				t[i]=sc.nextInt();
				x[i]=sc.nextInt();
				y[i]=sc.nextInt();
			}
			
			int dt = 0;
			int dL = 0;
			
			if(t[0]<(x[0]+y[0])) {
				System.out.println("No");
				return;
			}else if((t[0]-(x[0]+y[0]))%2==1) {
				System.out.println("No");
				return;
			}
			
			
			for(int i=0;i<n-1;i++) {
				dt = Math.abs(t[i]-t[i+1]);
				dL = Math.abs(x[i]-x[i+1]) + Math.abs(y[i]-y[i+1]);
				
				if(dt<dL) {
					System.out.println("No");
					return;
				}else if((dt-dL)%2==1) {
					System.out.println("No");
					return;
				}
				
			}
			
			System.out.println("Yes");			
		}
	}