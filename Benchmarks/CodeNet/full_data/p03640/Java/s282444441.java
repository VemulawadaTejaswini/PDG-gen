import java.util.Scanner;

public class Main {

	private void solve() {
		Scanner io = new Scanner(System.in);
		int H = io.nextInt();
		int W = io.nextInt();
		int N = io.nextInt();
		int[][] map = new int[H][W];
		int color = 1;
		int num = io.nextInt();
		for(int i=0;i<H;i++){
			for(int j=0;j<W;j++){
				if(num==0){
					color ++;
					num = io.nextInt();
				}
				if(i%2==0){
					map[i][j] = color;
				}else{
					map[i][W-1-j] = color;
				}
				num --;
			}
		}
		for(int i=0;i<H;i++){
			for(int j=0;j<W;j++){
				System.out.print(map[i][j]);
				System.out.print((j==W-1)?"\n":" ");
			}
		}
	}

	public static void main(String[] args) {
		new Main().solve();
	}
}