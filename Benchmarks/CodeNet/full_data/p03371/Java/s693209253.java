import java.util.Scanner;

public class Main{

	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		int big = 0;
		if(x >= y) {
			big = x;
		}else {
			big = y;
		}
		int abs = Math.abs(x - y);
		int sum = 0;
		
		if(a + b >= 2 * c) {
			sum = (big - abs) * (2 * c);
			if(big == x && a >= (2 * c)) {
				sum += (abs * (2 * c));
			}else if(big == x && a < (2 * c)) {
				sum += (abs * a);
			}else if(big == y && b >= (2 * c)) {
				sum += (abs * (2 * c));
			}else if(big == y && b < (2 * c)) {
				sum += (abs * b);
			}
		}else {
			sum = (big - abs) * (a + b);
			if(big == x && a >= (2 * c)) {
				sum += (abs * (2 * c));
			}else if(big == x && a < (2 * c)) {
				sum += (abs * a);
			}else if(big == y && b >= (2 * c)) {
				sum += (abs * (2 * c));
			}else if(big == y && b < (2 * c)) {
				sum += (abs * b);
			}
		}
		System.out.println(sum);
	}
}