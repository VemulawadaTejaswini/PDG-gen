import java.util.*;
public class Main {
	private static Scanner sc;

	public static void main(String[] args){
		sc = new Scanner(System.in);
		// get a integer
		int a = sc.nextInt();
		int b = sc.nextInt();
		int k = sc.nextInt();
		
		for (int i = 0; i < k; i++) {
			if (i % 2 == 0) {
				if(a % 2 > 0) {
					--a;
					b = b + (a/2);
					a = a - (a/2);
				} else {
					b = b + (a/2);
					a = a - (a/2);
				}
			} else if(i % 2 > 0) {
				if(b % 2 > 0) {
					--b;
					a = a + (b/2);
					b = b - (b/2);
				} else {
					a = a + (b/2);
					b = b - (b/2);
				}
			}
		}
		
		System.out.printf("%d %d", a,b);
		
	}
}