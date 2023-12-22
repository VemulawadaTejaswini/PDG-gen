import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	void doIt() {
		int n = sc.nextInt();
		Point p[] = new Point[n];
		int maxLen = 0;
		for(int i = 0; i < n; i++) {
			p[i] = new Point();
			p[i].setPoint(sc.nextInt(), sc.nextInt());
			if(maxLen < p[i].length) maxLen = p[i].length;
		}
		int base = p[0].length % 2;
		for(int i = 1; i < n; i++) {
			if(p[i].length % 2 != base) {
				System.out.println(-1);
				return;
			}
		}
		System.out.println(maxLen);
		for(int i = 1; i < maxLen; i++) {
			System.out.print("1 ");
		}
		System.out.println("1");
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < p[i].x; j++) {
				System.out.print("R");
			}
			for(int j = 0; j > p[i].x; j--) {
				System.out.print("L");
			}
			for(int j = 0; j < p[i].y; j++) {
				System.out.print("U");
			}
			for(int j = 0; j > p[i].y; j--) {
				System.out.print("D");
			}
			for(int j = 0; j < (maxLen - p[i].length) / 2; j++) {
				System.out.print("LR");
			}
			System.out.println();
		}
	}
	class Point{
		int x = 0, y = 0;
		int length = 0;
		void setPoint(int x, int y) {
			this.x = x; this.y = y;
			length = Math.abs(x) + Math.abs(y);
		}
	}
	Main(){doIt();}
	public static void main(String[] args) {
		new Main();
	}
}
