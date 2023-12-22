import java.util.Scanner;

public class Main {
	long answer = 0;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		long h = sc.nextLong();
		long w = sc.nextLong();
		System.out.println(((h * w)+1)/2);

	}


}