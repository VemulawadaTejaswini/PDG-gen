
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int x = sc.nextInt();
		int start = 0;
		int end = 0;
		for(int i = 0; i < m; i++) {
			int tmp = sc.nextInt();
			if(tmp < x) {
				start++;
			} else {
				end++;
			}
		}
		System.out.println(Math.min(start, end));
	}

}
