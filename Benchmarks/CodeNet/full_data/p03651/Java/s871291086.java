import java.util.Scanner;
import java.util.ArrayList;
public class Main {
	public static void main(String[] args){
		new Main().run();
	}
	
	void run(){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		boolean[] balls = new boolean[1000000];
		int ball_max = -1;
		for(int i = 0; i < n; i++){
			int index = scan.nextInt();
			balls[index] = true;
			ball_max = Math.max(ball_max, index);
		}
		for(int i = ball_max; i > 0; i--){
			for(int j = ball_max; j > 0; j--){
				if(balls[i] && balls[j]){
					int diff = Math.abs(i - j);
					if(k == diff){
						System.out.println("POSSIBLE");
						return;
					}
					balls[diff] = true;
				}
			}
		}
		System.out.println("IMPOSSIBLE");
	}
}
