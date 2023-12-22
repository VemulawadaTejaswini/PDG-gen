import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		String[][] c = new String[2*h][w];
		for(int i = 0; i < h; i+=2) {
			for(int j = 0; j < w; j++) {
				c[i][j] = sc.next();
				c[i+1][j] = c[i][j];
			}
		}
		for(int i = 0; i < h;i++) {
			for(int j = 0; j < w; j++) {
				System.out.println(c[i][j]);
			}
		}
	}
}