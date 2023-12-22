import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int r = scan.nextInt();
		scan.close();
		if(r<1200)System.out.println("ABC");
		else if(r<2800)System.out.println("ARC");
		System.out.println("AGC");
	}
}