import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int answer = 0;
		if(x == 2) {
			System.out.println(2);
			return;
		}
		boolean flg = false;
		for(int i =x; ;i++) {
			for(int j = 2; j < i; j++) {
				if(i % j == 0) {
					break;
				}
				if(j == i-1) {
					flg = true;
				}
			}
			if(flg) {
				answer = i;
				break;
			}
		}
		System.out.println(answer);

	}
}