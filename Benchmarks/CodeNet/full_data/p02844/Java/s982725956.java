import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		scn.nextLine();
		char[] str = scn.nextLine().toCharArray();
		boolean[] num = new boolean[10];
		boolean[][] num2 = new boolean[10][10];
		boolean[][][] num3 = new boolean[10][10][10];
		for(int i = 0;i < N;i++) {
			int now = (int)(str[i]-'0');
			for(int a = 0;a < 10;a++) {
				for(int b = 0;b < 10;b++) {
					if(num2[a][b])num3[a][b][now] = true;
				}
				if(num[a])num2[a][now] = true;
			}
			num[now] = true;
		}
		int ans = 0;
		for(int a = 0;a < 10;a++) {
			for(int b = 0;b < 10;b++) {
				for(int c = 0;c < 10;c++) {
					if(num3[a][b][c])ans++;
				}
			}
		}
		System.out.println(ans);
	}

}
