
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int val = 4;
		while(n >= val) {
			val *= 2;
		}
		if(n == val - 1) {
			for(int i = 1; i < 2 * n; i++) {
				System.out.println(i + " " + (i + 1));
			}
		} else {
			System.out.println(-1);
		}
	}

}