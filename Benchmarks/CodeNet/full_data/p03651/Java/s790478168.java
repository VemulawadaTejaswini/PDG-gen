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
		ArrayList<Integer> balls = new ArrayList<Integer>();
		for(int i = 0; i < n; i++){
			balls.add(scan.nextInt());
			for(int j = 0; j < balls.size(); j++){
				for(int l = 0; l < balls.size(); l++){
					int ball_diff = Math.abs(balls.get(j) - balls.get(l));
					if(ball_diff == k){
						System.out.println("POSSIBLE");
						return;
					}	
					if(!balls.contains(ball_diff)){
						balls.add(ball_diff);
					}	
				}
			}
		}
		System.out.println("IMPOSSIBLE");
	}
}
