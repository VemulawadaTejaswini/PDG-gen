import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static int[][] a;
	static ArrayList<String> ans = new ArrayList<>();
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		final int h = scanner.nextInt();
		final int w = scanner.nextInt();
		a = new int[h][w];
		for (int r=0; r<h; r++){
			for (int c=0; c<w; c++){
				a[r][c] = scanner.nextInt();
			}
		}
		for(int r=0; r<h; r++){
			for (int c=0; c<w; c++){
				int now = a[r][c];
				if(now%2==1){
					int right = -1;
					int down = -1;
					boolean rightEven = true;
					boolean downEven = true;
					if (c!=w-1) {
						right=a[r][c+1];
						rightEven = right%2==0;
					}
					if (r!=h-1) {
						down=a[r+1][c];
						downEven = down%2==0;
					}
					if(rightEven && downEven) {
						if(c!=w-1 && r!=h-1) {
							if (right<=down) move(r,c,r,c+1);	//toRight
							else move(r,c,r+1,c);	//toDown
						}else if (c!=w-1) move(r,c,r,c+1);	//toRight
						else if (r!=h-1) move(r,c,r+1,c);	//toDown
					}else if (rightEven) move(r,c,r+1,c);	//toDown
					else if (downEven) move(r,c,r,c+1);	//toRight
					else {
						if (right<=down) move(r,c,r,c+1);	//toRight
						else move(r,c,r+1,c);	//toDown
					}
				}
			}
		}
		System.out.println(ans.size());
		ans.forEach(System.out::println);
	}

	static void move(int y, int x, int y_, int x_){
		ans.add((y+1)+" "+(x+1)+" "+(y_+1)+" "+(x_+1));
		a[y][x]--;
		a[y_][x_]++;
	}
}