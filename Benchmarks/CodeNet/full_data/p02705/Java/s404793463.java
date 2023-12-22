import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int r = scan.nextInt();
		double ans = r*2*Math.PI;
		System.out.println(ans);
		scan.close();
	}

}
