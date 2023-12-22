import java.util.Scanner;

	public class Main {

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			
			int[][] c = new int[3][3];
			
			for(int i=0;i<3;i++) {
				for(int j=0;j<3;j++) {
					c[i][j] = sc.nextInt();
				}
			}
			
			if(calc(c,0,0,0,1)&&calc(c,0,1,0,2)&&calc(c,1,0,1,1)&&calc(c,1,1,1,2)) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
			
			
	    }
		
		static boolean calc(int[][] c,int i,int j,int k, int l) {
			if((c[i][j]+c[i+1][j+1])==(c[k][l]+c[k+1][l-1])) {
				return true;
			}else {
				return false;
			}
		}
	}
