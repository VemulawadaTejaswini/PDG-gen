import java.util.Scanner;

public class Main {
	static int[][] a = new int[3][3];
	static int[][] opened = new int[3][3];
			
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			int b = sc.nextInt();
			open(b);
		}
		
//		for (int i = 0; i < 3; i++) {
//			for (int j = 0; j < 3; j++) {
//				System.out.print(opened[i][j] + " ");
//			}
//			System.out.println();
//		}
		
		String ans = isBingo() ? "Yes" : "No";
		System.out.println(ans);
		sc.close();
	}
	
	static void open(int b) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (a[i][j] == b) {
					opened[i][j] = 1;
				}
			}
		}
	}
	
	static boolean isBingo() {
		for (int i = 0; i < 3; i++) {
			int cnt = 0;
			for (int j = 0; j < 3; j++) {
				cnt += opened[i][j];
			}
			if (cnt == 3) {
				return true;
			}
		}
		
		for (int j = 0; j < 3; j++) {
			int cnt = 0;
			for (int i = 0; i < 3; i++) {
				cnt += opened[j][i];
			}
			if (cnt == 3) {
				return true;
			}
		}
		
		if (opened[0][0] + opened[1][1] + opened[2][2] == 3 
				|| opened[2][0] + opened[1][1] + opened[0][2] == 3) {
			return true;
		}
			
		return false;
	}

}
