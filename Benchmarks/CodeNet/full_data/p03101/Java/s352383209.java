import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		int h = sc.nextInt();
		int w = sc.nextInt();
		sc.close();
		int black = h*W + H*w - h*w;
		int white = H*W - black;
		System.out.println(white);
	}

}