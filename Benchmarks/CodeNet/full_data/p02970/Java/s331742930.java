import java.util.Scanner;

public class Main {
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d = sc.nextInt();

		int length = d * 2 + 1;

		System.out.println(Math.round(Math.ceil((double)n / (double)length)));
	}
}
