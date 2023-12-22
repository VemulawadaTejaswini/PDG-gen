import java.util.*;

public class Main {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		int maxX = Integer.MIN_VALUE;
		int minY = Integer.MAX_VALUE;
		
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			if (a > maxX) {
				maxX = a;
			}
		}
		for (int i = 0; i < m; i++) {
			int a = sc.nextInt();
			if (a < minY) {
				minY = a;
			}
		}
		if (x < minY && maxX < minY && maxX < y) {
			System.out.println("no war");
		} else {
			System.out.println("war");
		}
	}
	
	
}