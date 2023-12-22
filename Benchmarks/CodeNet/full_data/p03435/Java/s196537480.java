import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			int c0[] = new int[3];
			int c1[] = new int[3];
			int c2[] = new int[3];
			for (int i = 0; i < 3; i++) {
				c0[i] = sc.nextInt();
			}
			for (int i = 0; i < 3; i++) {
				c1[i] = sc.nextInt();
			}
			for (int i = 0; i < 3; i++) {
				c2[i] = sc.nextInt();
			}
			
			int x[] = new int[6];
			int y[] = new int[6];
			for (int i = 0; i < 3; i++) {
				x[i] = c0[i] - c1[i];
				x[i + 3] = c1[i] - c2[i];
			}
			for (int i = 0; i < 2; i++) {
				y[i] = c0[i] - c0[i + 1];
				y[i + 2] = c1[i] - c1[i + 1];
				y[i + 4] = c2[i] - c2[i + 1];
			}
			
			boolean result = true;
			if (x[0] == x[1] && x[1] == x[2]) {} else {
				result = false;
			}
			if (x[3] == x[4] && x[4] == x[5]) {} else {
				result = false;
			}
			if (y[0] == y[2] && y[2] == y[4]) {} else {
				result = false;
			}
			if (y[1] == y[3] && y[3] == y[5]) {} else {
				result = false;
			}
			
			if (result) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
			
		}

	}

}