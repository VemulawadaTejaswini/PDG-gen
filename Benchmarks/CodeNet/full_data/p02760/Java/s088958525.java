import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
 
		int[][] a = new int[3][3];
 
		for (int i = 0;i<3 ;i++ ) {
			for (int j = 0;j<3 ;j++ ) {
				a[i][j] = sc.nextInt();
			}
		}
 
		int n = sc.nextInt();
		int[] data = new int[n];
 
		for (int i = 0;i<n ;i++ ) {
			data[i] = sc.nextInt();
		}
 
		for (int k = 0;k<n ;k++ ) {
			for (int i = 0;i<3 ;i++ ) {
				for (int j = 0;j<3 ;j++ ) {
					if (a[i][j]==data[k]) {
							a[i][j] = -1;
					}
				}
			}
		}
 
		for (int i = 0;i<3 ;i++ ) {//横
			int count = 0;
			for (int j = 0;j<3 ;j++ ) {
				if (a[i][j]==-1) {
					count++;
				}
			}
				if (count==3) {
					System.out.println("Yes");
					System.exit(0);
				}
		}
		for (int j = 0;j<3 ;j++ ) {//たて
			int count = 0;
			for (int i = 0;i<3 ;i++ ) {
				if (a[i][j]==-1) {
					count++;
				}
			}
				if (count==3) {
					System.out.println("Yes");
					System.exit(0);
				}
		}
 
		if (a[0][0]==-1&&a[1][1]==-1&&a[2][2]==-1) {
			System.out.println("Yes");
			System.exit(0);
		}
		if (a[0][2]==-1&&a[1][1]==-1&&a[2][0]==-1) {
			System.out.println("Yes");
			System.exit(0);
		}
		System.out.println("No");
 
	}
}