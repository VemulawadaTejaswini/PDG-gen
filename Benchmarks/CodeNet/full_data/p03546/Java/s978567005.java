import java.util.Scanner;
//ワーシャルフロイド法の練習
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int c[][] = new int[10][10];
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j++) {
				c[i][j] = sc.nextInt();
			}
		}
		//[i][j]・・・iからjまでの最短経路
		for(int k = 0; k < 10; k++) {
			for(int i = 0; i < 10; i++) {
				for(int j = 0; j < 10; j++) {
					c[i][j] = Math.min(c[i][j], c[i][k] + c[k][j]);
				}
			}
		}
		int total = 0;
		for(int i = 0; i < h*w; i++) {
			int a = sc.nextInt();
			if(a == -1 || a == 1) {
				continue;
			}
			total = total += c[a][1];
		}
		System.out.println(total);
	}
}