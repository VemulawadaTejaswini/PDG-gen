import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		sc.nextLine();
		String[][] gazo = new String[h][w];
		for(int i = 0; i< h;i++) {
			gazo[i] = sc.nextLine().split("");
		}
		for(int i = 0; i< h;i++) {
			StringBuilder sb = new StringBuilder();
			for(int j = 0; j< w;j++) {
				sb.append(gazo[i][j]);
			}
			System.out.println(sb);
			System.out.println(sb);
		}

	}
}