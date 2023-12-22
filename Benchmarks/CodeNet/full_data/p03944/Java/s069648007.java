
import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int h = sc.nextInt();
		int n = sc.nextInt();
		
		int[][] square = new int[n][3];
		for (int i = 0; i < square.length; i++) {
			square[i][0] = sc.nextInt();
			square[i][1] = sc.nextInt();
			square[i][2] = sc.nextInt();
		}
		
		int w2 = 0;
		int h2 = 0;
		for (int i = 0; i < square.length; i++) {
			// 数列aの値
			switch (square[i][2]) {
	        case 1:
	            w2 = w - square[i][0];
	            break;
	        case 2:
	        	w2 = square[i][0] - w2;
	            break;
	        case 3:
	        	h2 = h - square[i][1];
	            break;
	        case 4:
	        	h2 = square[i][1] - h2;
	            break;
	        }
		}
		
		if (h2 <= 0 || w2 <= 0) {
			System.out.println(0);
		} else {
			System.out.println(w2 * h2);
		}
	}
}