import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] a = new int[3][3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				a[i][j] = sc.nextInt();
			}
		}
		
		int n = sc.nextInt();
		int b=0;
		for(int k=0;k<n;k++) {
			b = sc.nextInt();

			f: for(int i=0;i<3;i++) {
				for(int j=0;j<3;j++) {
					if(a[i][j] == b) {
						a[i][j] = 0;
						break f;
					}
				}
			}
		}

		for(int i=0;i<3;i++) {
			if(a[i][0]== 0 && a[i][1]==0 && a[i][2]==0) {
				System.out.println("Yes");
				return;
			}
		}
		for(int j=0;j<3;j++) {
			if(a[0][j]== 0 && a[1][j]==0 && a[2][j]==0) {
				System.out.println("Yes");
				return;
			}
		}
		if(a[0][0]==0 && a[1][1]==0 && a[2][2]==0) {
			System.out.println("Yes");
			return;
		}
		if(a[0][2]==0 && a[1][1]==0 && a[0][2]==0) {
			System.out.println("Yes");
			return;
		}

		System.out.println("No");

	}

}
