import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int[][] a = new int[3][3];
		int[][] answer = new int[3][3];
		for(int i = 0;i < 3;i++) {
			for(int j = 0;j < 3;j++) {
				a[i][j] = sc.nextInt();
			}
		}
		int n = sc.nextInt();
		int[] b  =new int[n];
		for(int i = 0;i < n;i++) {
			b[i] = sc.nextInt();
			escape:for(int j = 0;j < 3;j++) {
				for(int k = 0;k < 3;k++) {
					if(b[i] == a[j][k]) {
						answer[j][k] = 1;
						break escape;
					}
				}
			}
		}
		bingochecker(answer);

	}

	public static void bingochecker(int[][] bingocard) {
		if(bingocard[0][0] == 1 && bingocard[0][1] == 1 && bingocard[0][2] == 1) {
			System.out.println("Yes");
			return;
		}
		if(bingocard[1][0] == 1 && bingocard[1][1] == 1 && bingocard[1][2] == 1) {
			System.out.println("Yes");
			return;
		}
		if(bingocard[2][0] == 1 && bingocard[2][1] == 1 && bingocard[2][2] == 1) {
			System.out.println("Yes");
			return;
		}

		if(bingocard[0][0] == 1 && bingocard[1][0] == 1 && bingocard[2][0] == 1) {
			System.out.println("Yes");
			return;
		}
		if(bingocard[0][1] == 1 && bingocard[1][1] == 1 && bingocard[2][1] == 1) {
			System.out.println("Yes");
			return;
		}
		if(bingocard[0][2] == 1 && bingocard[1][2] == 1 && bingocard[2][2] == 1) {
			System.out.println("Yes");
			return;
		}

		if(bingocard[0][0] == 1 && bingocard[1][1] == 1 && bingocard[2][2] == 1) {
			System.out.println("Yes");
			return;
		}
		if(bingocard[2][0] == 1 && bingocard[1][1] == 1 && bingocard[0][2] == 1) {
			System.out.println("Yes");
			return;
		}

	}

}
