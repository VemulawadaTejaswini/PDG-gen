import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		double a = N;
		double b = N/2 + ((N%2==0)?0:1);
		System.out.println(b/a);
	}

}