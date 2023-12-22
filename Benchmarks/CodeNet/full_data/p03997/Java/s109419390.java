
import java.util.*;

//クラス名をMainに変える
public class Main {
	public static void main(String[] args) {

		// input
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int h = scan.nextInt();

		scan.close();

		int res = (a + b) * h / 2;

		// output
		System.out.println(res);
	}
}