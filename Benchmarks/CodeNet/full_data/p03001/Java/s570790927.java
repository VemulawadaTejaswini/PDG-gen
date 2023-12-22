import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int h = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		int check = 0;
		int area = w * h;
		double areaMax = area / 2.0;
		if (x == w / 2 && y == h / 2) {
			check = 1;
		}
		System.out.println(areaMax + " " + check);
	}
}