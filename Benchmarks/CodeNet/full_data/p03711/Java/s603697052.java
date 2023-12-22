import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		sc.close();
		int[]g = new int[13];
		g[1] = 1;
		g[3] = 1;
		g[5] = 1;
		g[7] = 1;
		g[8] = 1;
		g[10] = 1;
		g[12] = 1;
		g[4] = 2;
		g[6] = 2;
		g[9] = 2;
		g[11] = 2;
		g[2] = 3;
		if(g[x] == g[y]) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}