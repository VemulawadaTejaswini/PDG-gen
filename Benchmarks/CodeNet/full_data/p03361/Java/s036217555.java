
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int[][] pic = new int[h][w];
		for(int i = 0; i < h; i++) {
			String s = sc.next();
			for(int j = 0; j < w; j++) {
				if(s.charAt(j) == '.') {
					pic[i][j] = 0;
				} else {
					pic[i][j] = 1;
				}
			}
		}
		boolean flag = true;
		for(int i = 0; i < h; i++) {
			for(int j = 0; j < w; j++) {
				if(!((i + 1 <= h && pic[i + 1][j] == 1)
						|| (i - 1 >= 0 && pic[i - 1][j] == 1)
						|| (j + 1 <= w && pic[i][j + 1] == 1)
						|| (j - 1 >= 0 && pic[i][j - 1] == 1))) {
					flag = false;
					break;
				}
			}
		}
		if(flag) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

}
