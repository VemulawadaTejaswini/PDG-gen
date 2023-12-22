import java.util.*;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		char[] arr = sc.next().toCharArray();
		int x = sc.nextInt();
		int y = sc.nextInt();
		boolean isStart = true;
		boolean isX = true;
		int start = 0;
		int countX = 0;
		int countY = 0;
		for (char c : arr) {
			if (c == 'F') {
				if (isStart) {
					start++;
				} else {
					if (isX) {
						countX++;
					} else {
						countY++;
					}
				}
			} else {
				isStart = false;
				isX = !isX;
			}
		}
		x -= start;
		x = Math.abs(x);
		y = Math.abs(y);
		if (x <= countX && x % 2 == countX % 2 && y <= countY && y % 2 == countY % 2) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
