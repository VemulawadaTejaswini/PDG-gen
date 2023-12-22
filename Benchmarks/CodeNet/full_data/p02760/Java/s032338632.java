import java.util.Scanner;


	public class Main {
		
		

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
	        
			int[][] a = new int[3][3];
			int[][] c = new int[3][3];
			
			int n;
			
			for(int i=0;i<3;i++) {
				for(int j=0;j<3;j++) {
					a[i][j]= sc.nextInt();
				}
			}
			
			n = sc.nextInt();
			int[] b = new int[n];
			for(int i=0;i<n;i++) {
				b[i] = sc.nextInt();
			}
			
			for(int k=0;k<n;k++) {
				for(int i=0;i<3;i++) {
					for(int j=0;j<3;j++) {
						if(b[k]==a[i][j]) {
							c[i][j]=1;
						}
					}
				}
			}
			
			if(c[0][0]==1&&c[0][1]==1&&c[0][2]==1) {
				System.out.println("Yes");
				return;
			}
			
			
			if(c[1][0]==1&&c[1][1]==1&&c[1][2]==1) {
				System.out.println("Yes");
				return;
			}
			
			if(c[2][0]==1&&c[2][1]==1&&c[2][2]==1) {
				System.out.println("Yes");
				return;
			}
			
			if(c[0][0]==1&&c[1][0]==1&&c[2][0]==1) {
				System.out.println("Yes");
				return;
			}
			
			if(c[0][1]==1&&c[1][1]==1&&c[2][1]==1) {
				System.out.println("Yes");
				return;
			}
			
			if(c[0][2]==1&&c[1][2]==1&&c[2][2]==1) {
				System.out.println("Yes");
				return;
			}
			
			if(c[0][0]==1&&c[1][1]==1&&c[2][2]==1) {
				System.out.println("Yes");
				return;
			}
			
			if(c[2][0]==1&&c[1][1]==1&&c[0][2]==1) {
				System.out.println("Yes");
				return;
			}
			
			System.out.println("No");
		}
	}
