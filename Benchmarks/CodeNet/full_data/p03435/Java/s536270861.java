import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[4];
		int[] b = new int[4];
		int[][] c = new int[4][4];
		for(int i=1;i<=3;i++) {
			for(int j=1; j<=3; j++) {
				c[i][j] = sc.nextInt();
			}
		}
		a[1] = c[1][1];
		a[2] = c[2][1];
		a[3] = c[3][1];
		b[1] = 0;
		b[2] = c[1][2] - c[1][1];
		b[3] = c[1][3] - c[1][1];

		boolean ans = true;
		int numbers[] = {2,3};//[1]
		 for (int i : numbers) {
			 for(int j: numbers) {
				 if(a[i] + b[j] == c[i][j]);
				 else ans = false;
			 }
        }

		if(ans) System.out.println("Yes");
		else System.out.println("No");

	}
}
