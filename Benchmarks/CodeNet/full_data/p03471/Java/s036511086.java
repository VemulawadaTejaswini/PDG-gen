import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		int Y = stdIn.nextInt() / 1000;
		
		int ans10 = -1;
		int ans5 = -1;
		int ans1 = -1;
		
		for(int i = 0; i <= N; i ++) {
			for(int j = 0; j <= N - i; j ++) {
				if(10 * i + 5 * j + (N - i - j) == Y) {
					ans10 = i;
					ans5 = j;
					ans1 = N - i - j;
					break;
				}
			}
		}
		
		System.out.println(ans10 + " " + ans5 + " " + ans1);
	}
}