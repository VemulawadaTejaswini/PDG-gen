import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int point = 1;
		int count = 0;
		boolean ans = false;
		for (int i = 0; i < N; i++ ) {
			int b = sc.nextInt();
			if(point == i+1) {
				count++;
				if(b == 2) {
					ans = true;
					break;
				}
				point = b;
			}
		}
		System.out.println(ans?count:-1);
	}
}
