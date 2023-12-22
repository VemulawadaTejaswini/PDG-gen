import java.util.Scanner;

public class T1 {
	
	public static void main(String[] args) {
		int H = 0;
		int W = 0;
		int N = 0;
		int black = 0;
		
		Scanner input = new Scanner(System.in);
		
		H = input.nextInt();
		W = input.nextInt();
		N = input.nextInt();
		
		if(H > W) {
			for(int i = 1; i < H + 1; i++) {
				black += H;
				if(black >= N) {
					System.out.println(i);
					break;
				}
			}
		}else {
			for(int i = 1; i < W + 1; i++) {
				black += W;
				if(black >= N) {
					System.out.println(i);
					break;
				}
			}
		}
	}
}