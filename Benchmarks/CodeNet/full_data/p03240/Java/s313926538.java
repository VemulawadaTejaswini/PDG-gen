import java.util.*;

public class Main {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int flag = true;
		for (int k = 1; k < n; k++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int h = sc.nextInt();
			if (h == 0) {
				continue;
			}
			if (flag) {
				py[i][j] = abs(x, i) + abs(y, j) + h;
				flag = false;
			} else {
				for (int i = 0; i <= 100; i++) {
					for (int j = 0; j <= 100; j++) {
						if (py[i][j] != abs(x, i) + abs(y, j) + h) {
							py[i][j] = 0;
						}
					}
				}
			}
		}
		
		int max = 0;
		int maxX = 0;
		int maxY = 0;
		for (int i = 0; i <= 100; i++) {
			for (int j = 0; j <= 100; j++){
				if (py[i][j] >= max) {
					max = py[i][j];
					maxX = i;
					maxY = j;
				}
			}
		}
		System.out.println(maxX + " " + maxY + " " + max);
	}
	
	public static int abs(int a, int b) {
		if (a > b) {
			return a - b;
		} else {
			return b - a;
		}
	}
}