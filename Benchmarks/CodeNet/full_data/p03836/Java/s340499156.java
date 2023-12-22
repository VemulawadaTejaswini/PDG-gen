import java.util.*;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int sx = sc.nextInt();
		int sy = sc.nextInt();
		int tx = sc.nextInt();
		int ty = sc.nextInt();

		int dx = tx-sx;
		int dy = ty-sy;

		f1(dx, dy);
		f2(dx, dy);

		System.out.print("L");
		System.out.print("U");
		f1(dx, dy);
		System.out.print("R");
		System.out.print("D");

		System.out.print("R");
		System.out.print("D");
		f2(dx, dy);
		System.out.print("L");
		System.out.print("U");

		System.out.println();
		sc.close();
	}


	private void f1(int dx, int dy) {
		for(int i=0; i<dy; i++) {
			System.out.print("U");
		}
		for(int i=0; i<dx; i++) {
			System.out.print("R");
		}
	}

	private void f2(int dx, int dy) {
		for(int i=0; i<dy; i++) {
			System.out.print("D");
		}
		for(int i=0; i<dx; i++) {
			System.out.print("L");
		}
	}
}
