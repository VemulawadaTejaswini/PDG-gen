import java.util.*;
class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int X = sc.nextInt();
		int Y = sc.nextInt();
		int price = 0;
		if (A + B >= C * 2) {
			if (X > Y) {
			price = (C * 2 * Y + A * Math.abs(X - Y));
			} else {
				price = (C * 2 * X + B * Math.abs(X - Y));
			}
		} else {
			price = A * X + B * Y;
		}
		System.out.println(price);
	}
}