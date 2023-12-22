import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 5;
	 int[] menu = new int[n];
	 int[] nextTime  = new int[n];
	for(int i = 0; i < n; i++) {
		menu[i] = sc.nextInt();
	}
	for(int i = 0; i < n; i++) {
		if(menu[i]%10==0) {
			nextTime[i] = menu[i];
		}
		else {
		nextTime[i] = menu[i] - menu[i]%10+10;
		}
	}
	int bestTime = Integer.MAX_VALUE;
	for(int i = 0; i < n; i++) {
		int nowTime = 0;
		for(int j = 0; j < n; j++) {
			if(i == j) {
				nowTime+=menu[j];
			}
			else {
				nowTime+=nextTime[j];
			}
		}
		bestTime = Math.min(nowTime, bestTime);
	}
	System.out.println(bestTime);
	}

}
