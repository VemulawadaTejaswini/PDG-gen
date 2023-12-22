
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		
		double[] money = new double[N];
		String[] type = new String[N];
		for (int i = 0; i < N; i++) {
			money[i] = scan.nextDouble();
			type[i] = scan.next();
		}
		
		double sum = 0;
		for (int i = 0; i < N; i++) {
			if (type[i].equals("JPY")) {
				sum += money[i];
			} else {
				sum += money[i] * 380000;
			}
		}
		
		System.out.println(sum);
		
		scan.close();
	}
}