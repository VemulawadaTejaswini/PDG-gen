import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[][] a = new int[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				a[i][j] = Integer.parseInt(in.next());
			}
		}
		int n = Integer.parseInt(in.next());
		int[] b = new int[n];
		for (int k = 0; k < n; k++) {
			b[k] = Integer.parseInt(in.next());
		}
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				for (int k = 0; k < n; k++) {
					if (a[i][j] == b[k]) {
						a[i][j] = 0;
					}
				}
			}
		}
		
		int count = 0;
		
		for (int i = 0; i < 3; i++) {
			if (a[i][0] == a[i][1] && a[i][1] == a[i][2]) {
				count++;
				break;
			}
		}
		for (int j = 0; j < 3; j++) {
			if (a[0][j] == a[1][j] && a[1][j] == a[2][j]) {
				count++;
				break;
			}
		}
		if (a[0][0] == a[1][1] && a[1][1] == a[2][2]) {
			count++;
		} else if (a[0][2] == a[1][1] && a[1][1] == a[2][0]) {
			count++;
		}
		
		System.out.println(count > 0 ? "Yes" : "No");
	}
}	