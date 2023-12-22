import java.util.*;
public class Main{
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int H = scan.nextInt();
		int W = scan.nextInt();
		String[][] arr = new String[H][W];
		for (int i=0;i<H;i++) {
			arr[i] = scan.next().split("");
		}
		int max = 0;
		for (int i=0;i<H;i++) {
			for (int j=0;j<W;j++) {
				if (arr[i][j].equals(".")) {
					int x = i-1;
					int y = j;
					int count = 1;
					while (x>=0) {
						if (arr[x][y].equals(".")) {
							count++;
						}
						else {
							break;
						}
						x--;
					}
					x = i+1;
					y = j;
					while (x<H) {
						if (arr[x][y].equals(".")) {
							count++;
						}
						else {
							break;
						}
						x++;
					}
					x = i;
					y = j-1;
					while (y>=0) {
						if (arr[x][y].equals(".")) {
							count++;
						}
						else {
							break;
						}
						y--;
					}
					x = i;
					y = j+1;
					while (y<W) {
						if (arr[x][y].equals(".")) {
							count++;
						}
						else {
							break;
						}
						y++;
					}
					if (count>max) {
						max = count;
					}
				}
			}
		}
		System.out.println(max);
	}
}