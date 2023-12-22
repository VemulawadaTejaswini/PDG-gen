import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x1 = scan.nextInt();
		int y1 = scan.nextInt();
		int x2 = scan.nextInt();
		int y2 = scan.nextInt();
		scan.close();
		int x = Math.abs(x1-x2);
		int y = Math.abs(y1-y2);
		System.out.println((x2-y)+" "+(y2+x) +" "+(x1-y)+" "+(y1+x));
	}
}