import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int Y = sc.nextInt();
		sc.close();
		while(true) {
			if(X == Y) {
				System.out.println(-1);
				break;
			}
			long cnt = X*2;
			if(cnt % Y != 0) {
				System.out.println(cnt);
				break;
			}
			cnt += X;
		}
	}
}