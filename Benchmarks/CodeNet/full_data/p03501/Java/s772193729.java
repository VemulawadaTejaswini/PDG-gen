import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		int a=scan.nextInt();
		int b=scan.nextInt();
		if((n*a)<b) System.out.println(n*a);
		else System.out.println(b);
	}

}
