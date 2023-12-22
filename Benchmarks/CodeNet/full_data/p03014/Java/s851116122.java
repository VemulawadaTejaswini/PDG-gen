import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int height = sc.nextInt();
		int width = sc.nextInt();
		boolean ok[][] = new boolean[height][width];
		for(int i = 0; i < height; i ++) {
			String str = sc.next();
			for(int j = 0; j < width; j ++) {
				ok[i][j] = str.charAt(j) != '#';
			}
		}

		int widthNum[][] = new int[height][width];
		int tmp = 0;
		for(int i = 0; i < height; i ++) {
			for(int j = 0; j < width; j ++) {
				if(ok[i][j]) {
					tmp ++;
					widthNum[i][j] = tmp;
				}else {
					tmp = 0;
					widthNum[i][j] = -1;
				}
			}
			tmp = 0;
		}
		for(int i = height - 1; i >= 0; i --) {
			for(int j = width - 2; j >= 0; j --) {
				widthNum[i][j] = widthNum[i][j] == -1 ? -1 : Math.max(widthNum[i][j], widthNum[i][j + 1]);
			}
		}

		int heightNum[][] = new int[height][width];
		tmp = 0;
		for(int i = 0; i < width; i ++) {
			for(int j = 0; j < height; j ++) {
				if(ok[j][i]) {
					tmp ++;
					heightNum[j][i] = tmp;
				}else {
					tmp = 0;
					heightNum[j][i] = -1;
				}
			}
			tmp = 0;
		}

		for(int i = width - 1; i >= 0; i --) {
			for(int j = height - 2; j >= 0; j --) {
				heightNum[j][i] = Math.max(heightNum[j][i], heightNum[j + 1][i]);
			}
		}

		int num[][] = new int[height][width];
		int max = 0;
		for(int i = 0; i < height; i ++) {
			for(int j = 0; j < width; j ++) {
				num[i][j] = widthNum[i][j] + heightNum[i][j] - 1;
				max = Math.max(max, num[i][j]);
			}
		}
		System.out.println(max);
	}
}