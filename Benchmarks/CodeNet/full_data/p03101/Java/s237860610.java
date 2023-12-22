import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int H = scan.nextInt();
		int W = scan.nextInt();
		int h = scan.nextInt();
		int w = scan.nextInt();
		scan.close();
		System.out.println(H*W-h*w);
	}
}