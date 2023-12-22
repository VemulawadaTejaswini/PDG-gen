import java.util.*;

@SuppressWarnings("unchecked")
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int w = in.nextInt();
		int h = in.nextInt();
		int n = in.nextInt();
		int maX = 0;
		int miX = w;
		int maY = 0;
		int miY = h;
		for (int i = 0; i < n; ++i) {
			int x = in.nextInt();
			int y = in.nextInt();
			int a = in.nextInt();
			if (a == 1) maX = Math.max(maX, x);
			if (a == 2) miX = Math.min(miX, x);
			if (a == 3) maY = Math.max(maY, y);
			if (a == 4) miY = Math.min(miY, y);
		}
		int len = Math.max(0, miX - maX);
		int bre = Math.max(0, miY - maY);
		System.out.println(len * bre);
	}
}