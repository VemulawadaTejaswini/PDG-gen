import java.util.Scanner;

public class Main {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int[][] c = new int[3][3];
		
		int csum = 0;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				c[i][j] = sc.nextInt();
				csum += c[i][j];
			}
		}
		
		if(csum % 3 != 0) {
			System.out.println("No");
		}else {
			System.out.println("Yes");
		}
		
	}
}
