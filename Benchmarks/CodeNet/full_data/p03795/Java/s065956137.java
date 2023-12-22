
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int answer = 0;

		if (n >= 15) {
			answer = (n * 800) - ((n / 15) * 200);
		} else {
			answer = n * 800;
		}System.out.println(answer);
	}

}
