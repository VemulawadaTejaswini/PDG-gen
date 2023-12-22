import java.util.*;
public class Main {
	
	public static void main(String... args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int t = 0;
		int x = 0;
		int y = 0;
		for (int i = 0; i < N; i++) {
			int ti = sc.nextInt();
			int zikan = t - ti;
			zikan = Math.abs(zikan);
			
			int xi = sc.nextInt();
			int yi = sc.nextInt();
			int kyori = Math.abs(x - xi) + Math.abs(y - yi);
			
			if (zikan - kyori < 0 || (zikan - kyori) % 2 != 0) {
				System.out.println("No");
				return;
			}
			
			
			t = ti;
			x = xi;
			y = yi;
		}
		
		System.out.println("Yes");
		
	}
}