import java.util.ArrayList;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scan = new Scanner(System.in);
		ArrayList<Double> array = new ArrayList<Double>();

		int n = scan.nextInt();
		double x = 0;
		double y = 0;

		for(int i = 0; i < n; i++) {
			array.add(scan.nextDouble());
			y += 1/array.get(i);/*逆数の総和*/
		}
		x = 1/y;
		System.out.println(x);
	}

}