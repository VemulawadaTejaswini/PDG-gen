import java.util.Scanner;

public class Main {

	public static int a = 0;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		if(B == (1.25) * A) {
		    System.out.println(B * 10);
		}
		else {
		    System.out.println(-1);
		}
	}

}
