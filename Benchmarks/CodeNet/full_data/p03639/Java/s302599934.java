import java.util.Scanner;

public class Main {
	
	private static int[][] colors = new int[200][200];
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int i , j , h , w , n;
		h = scan.nextInt();
		w = scan.nextInt();
		n = scan.nextInt();
		int x = 1 , y = 1;
		boolean right = true;
		for (i = 0;i < n;i ++) {
			int value = scan.nextInt();
			for (j = 0;j < value;j ++) {
				colors[x][y] = i + 1;
				if (right) {
					if (y + 1 <= w) {
						y ++;
					} else {
						x ++;
						right = false;
					}
				} else {
					if (y - 1 >= 1) {
						y --;
					} else {
						x ++;
						right = true;
					}
				}
			}	
		}
		for (i = 1;i <= h;i ++) {
			StringBuilder builder = new StringBuilder();
			for (j = 1;j <= w;j ++) {
				if (j > 1) {
					builder.append(" ");
				}
				builder.append(colors[i][j]);
			}
			System.out.println(builder.toString());
		}
		
	}
	
	
}

















