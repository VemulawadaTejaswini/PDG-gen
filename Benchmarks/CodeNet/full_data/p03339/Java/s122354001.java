import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> array = new ArrayList<String>();
		int a = sc.nextInt();
		int E = a - 1;
		int W = 0;
		int sum = a;
		int countE = 0;
		int countW = 0;
		int countWE = 0;
		for (int i = 0; i < a; i++) {
			array.add(sc.next());
		}
		for (int j = 0; j < a; j++) {
			for (int k = 0; k < a; k++) {
				if(j == k){
					continue;
				}else if (array.get(k).equals("E")) {
					countE++;
				}else if (array.get(k).equals("W")) {
					countW++;
				}
			}
			countE = E - countE;
			countW = W - countW;
			countWE = Math.abs(countE) + Math.abs(countW);
			if (sum > countWE) {
				sum = countWE;
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
