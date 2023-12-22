import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int h = scan.nextInt();
		int w = scan.nextInt();
		
		int[][] masu = new int[h][w];
		int max = 0;
		
		for(int i = 0; i < h; i++) {
			for(int j = 0; j < w; j++) {
				masu[i][j] = scan.nextInt();
				max += masu[i][j];
			}
		}
		
		for(int i = 0; i < h; i++) {
			for(int j = 0; j < w; j++) {
				
				if(j < w-1) {
					if(masu[i][j] % 2 == 0) {
						continue;
					} else {
						System.out.println(i+" "+j+" "+i+" "+(j+1));
					}
				} else {
					if(i < h-1) {
						if(masu[i][j] % 2 == 0) {
							continue;
						} else {
							System.out.println(i+" "+j+" "+(i+1)+" "+(j));
						}
					}
				}
			}
		}
	}
}
