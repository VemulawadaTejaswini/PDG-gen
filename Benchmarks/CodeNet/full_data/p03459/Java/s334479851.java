
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = 0;
		int y = 0;
		int t = 0;
		boolean ans = true;
		for(int i = 0; i < n; i++) {
			int nt = sc.nextInt();
			int nx = sc.nextInt();
			int ny = sc.nextInt();
			int dt = Math.abs(nt - t);
			int dx = Math.abs(nx - x);
			int dy = Math.abs(ny - y);
			if(dx + dy > dt) {
				ans = false;
				break;
			} else if((dt - (dx + dy)) % 2 == 1) {
				ans = false;
				break;
			}
			t = nt;
			x = nx;
			y = ny;
		}
		if(ans) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

}
