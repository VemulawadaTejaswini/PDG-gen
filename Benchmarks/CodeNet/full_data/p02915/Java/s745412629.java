import java.util.Scanner;

public class Main {
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		long result = (long)Math.pow(a,3);
		System.out.println(a == 1 ? 1 : result);
	}
}