import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x1 = scan.nextInt();
		int y1 = scan.nextInt();
		int x2 = scan.nextInt();
		int y2 = scan.nextInt();
		scan.close();
		int y = Math.abs(y1-y2);
		System.out.println((x2-y)+" "+y2 +" "+(x1-y)+" "+y1);
	}
}