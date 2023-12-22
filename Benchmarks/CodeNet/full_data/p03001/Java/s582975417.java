
import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int w = in.nextInt();
		int h = in.nextInt();
		int x = in.nextInt();
		int y = in.nextInt();

		double s = h * w / 2;

		int p = (x == w/2 && y == h /2) ? 1 : 0;

		System.out.println(s);
		System.out.println(p);
	}

}
