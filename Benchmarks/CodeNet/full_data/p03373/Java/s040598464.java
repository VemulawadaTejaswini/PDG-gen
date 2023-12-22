import java.util.*;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		int ans = 0;
		
		if (x == y) {
			if ((a+b) > c) {
				ans = x * c;
			} else {
				ans = x * (a+b);
			}
		} else {
			int large;
			int small;
			int price;
			
			if (x > y) {
				large = x;
				small = y;
				price = a;
			} else {
				large = y;
				small = x;
				price = b;
			}
			
			if ((a+b) > (c*2)) {
				ans = small * (c*2);
			} else {
				ans = small * (a+b);
			}
			
			if (price > (c*2)) {
				ans += (c*2) * (large-small);
			} else {
				ans += price * (large-small);
			}
		}
		
		System.out.println(ans);
	}
}