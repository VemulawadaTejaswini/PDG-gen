import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// input
		int goal = scan.nextInt();

		// check
		int pos = 0;
		int answer = 0;
		for(int i = 1; i < 1000000000; i++) {
			pos += i;
			if(pos >= goal) {
				answer = i;
				break;
			}
		}

		System.out.println(answer);
	}
}
