import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int a = in.nextInt();
		int b = in.nextInt();
		
		int sum = n*a < b ? n*a : b;
		System.out.println(sum);
		in.close();
	}
}