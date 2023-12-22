import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = 0;
		int x = 0;
		int y = 0;
		
		while (sc.hasNextInt()) {
			int next_t = sc.nextInt();
			int next_x = sc.nextInt();
			int next_y = sc.nextInt();
			
			int jikan = next_t - t;
			int dest = Math.abs(next_x - x) + Math.abs(next_y - y);

			if (jikan / 2 == 0) {
				if (dest / 2 == 1)  {
					system.out.println("No");
					return;
				}
			} else {
				if (dest / 2 == 0) {
					system.out.println("No");
					return;
				}
			}
			
			if (dest > jikan) {
				system.out.println("No");
				return;
			}
			
			t = next_t;
			x = next_x;
			y = next_y;
			
		}
		
		system.out.println("Yes");
	}
}
