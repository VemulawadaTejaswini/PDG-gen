
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int[] t = new int[n+1];
		int[] x = new int[n+1];
		int[] y = new int[n+1];
		t[0] = 0;
		x[0] = 0;
		y[0] = 0;
		for(int i = 1; i < n+1; i++) {
			t[i] = Integer.parseInt(sc.next());
			x[i] = Integer.parseInt(sc.next());
			y[i] = Integer.parseInt(sc.next());
		}
		sc.close();
		boolean ans = false;
		// どのときYes
		// dt >= dist && (dt - dist)%2==0
		for(int i = 0; i < n; i++) {
			int dt = t[i+1] - t[i];
			int dist = calcMan(x[i], y[i], x[i+1], y[i+1]);
			if (dt >= dist && (dt - dist) % 2 ==0) {
				ans = true;
			} else {
				ans = false;
				break;
			}
		}
		if (ans) System.out.println("Yes");
		if (!ans) System.out.println("No");
		
		
	}
	public static int calcMan(int x, int y, int nx, int ny) {
		return Math.abs(nx - x) + Math.abs(ny - y);
		
	}

}
