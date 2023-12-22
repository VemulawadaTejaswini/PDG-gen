import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		int m = scan.nextInt();
		ArrayList<Integer> a = new ArrayList<Integer>();
		for(int i = 0; i < n-1; ++i) {
			a.add(scan.nextInt());
		}
		scan.close();

		int sumN_1 = 0;
		for(int score : a) {
			sumN_1 += score;
		}

		int elseScore = m * n - sumN_1;
		if(elseScore > k) {
			System.out.println("-1");
		} else if(elseScore <= 0) {
			System.out.println("0");
		} else {
			System.out.println(elseScore);
		}
	}
}
