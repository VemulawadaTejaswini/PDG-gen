import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		int number = 0;

		Integer[] checker = {A, B, C};
		Arrays.sort(checker);

		System.out.println(checker[2] * 10 + checker[1] + checker[0]);

	}
}