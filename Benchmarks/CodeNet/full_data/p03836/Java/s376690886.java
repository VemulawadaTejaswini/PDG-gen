import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int sx = sc.nextInt();
		int sy = sc.nextInt();
		int tx = sc.nextInt();
		int ty = sc.nextInt();
		
		int curx = sx;
		int cury = sy;
		
		while(cury < ty) {
			cury++;
			System.out.print("U");
		}
		
		while(curx < tx) {
			curx++;
			System.out.print("R");
		}
		
		while(cury > 0) {
			cury--;
			System.out.print("D");
		}
		
		while(curx > 0) {
			curx--;
			System.out.print("L");
		}
		
		curx--;
		System.out.print("L");
		while(cury < ty+1) {
			cury++;
			System.out.print("U");
		}
		
		while(curx < tx+1) {
			curx++;
			System.out.print("R");
		}
		cury--;
		System.out.print("D");
		curx++;
		System.out.print("R");
		while(cury > -1) {
			cury--;
			System.out.print("D");
		}
		
		while(curx > 0) {
			curx--;
			System.out.print("L");
		}
		cury++;
		System.out.print("U");
	}
}