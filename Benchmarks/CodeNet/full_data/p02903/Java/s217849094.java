import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = Integer.parseInt(sc.next());
		int w = Integer.parseInt(sc.next());
		int a = Integer.parseInt(sc.next());
		int b =Integer.parseInt(sc.next());
		//int[][] c = new int[h][w];

		StringBuilder sb = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
		for(int j = 0; j < a; j++) {
			sb.append("0");
			sb2.append("1");
		}
		for(int j = a; j < w; j++) {
			sb.append("1");
			sb2.append("0");
		}
		for(int i = 0; i < b; i++) {
			System.out.println(new String(sb));
		}
		for(int i = b; i < h; i++) {
			System.out.println(new String(sb2));
		}

		/*for(int i = 0; i < b; i++) {
			for(int j = 0; j < a; j++) {
				System.out.print(0);
			}
			for(int j = a; j < w; j++) {
				System.out.print(1);
			}
			System.out.printf("%n");
		}
		for(int i = b; i < h; i++) {
			for(int j = 0; j < a; j++) {
				System.out.print(1);
			}
			for(int j = a; j < w; j++) {
				System.out.print(0);
			}
			System.out.printf("%n");
		}*/

		/*for(int i = 0; i < b; i++) {
			for(int j = 0; j < a; j++) {
				c[i][j] = 0;
			}
			for(int j = a; j < w; j++) {
				c[i][j] = 1;
			}
		}
		for(int i = b; i < h; i++) {
			for(int j = 0; j < a; j++) {
				c[i][j] = 1;
			}
			for(int j = a; j < w; j++) {
				c[i][j] = 0;
			}
		}

		for(int i = 0; i < h; i++) {
			for(int j = 0; j < w; j++) {
				System.out.print(c[i][j]);
			}
			System.out.printf("%n");
		}*/

		sc.close();
	}

}