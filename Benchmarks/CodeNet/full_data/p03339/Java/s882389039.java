import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> array = new ArrayList<String>();
		int a = sc.nextInt();
		int E = a - 1;
		int W = 0;
		int sum = a;
		int countE = 0;
		int countW = 0;
		for (int i = 0; i < a; i++) {
			array.add(sc.next());
		}
			for (int k = 0; k < a; k++) {
				if (array.get(k).equals("E")) {
					countE++;
				}
				if (array.get(k).equals("W")) {
					countW++;
				}
			}
			countE = E - countE;
			countW = W - countW;
			if (sum > Math.abs(countE) + Math.abs(countW)) {
				sum = Math.abs(countE) + Math.abs(countW);
			}
			if (j == a - 1) {
				System.out.println(sum);
				return;
			}
			countE = 0;
			countW = 0;
			E--;
			W++;
		}
	}
}
