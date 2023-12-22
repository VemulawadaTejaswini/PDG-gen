import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		ArrayList<Integer> takoList = new ArrayList<Integer>();
		for (int i = 1; i <= n; i++) {
			takoList.add(scanner.nextInt());
		}
		scanner.close();
		int sum = 0;
		for (int i = 0; i < takoList.size(); i++) {
			for (int j = i + 1; j < takoList.size(); j++) {
				sum = sum + takoList.get(i) * takoList.get(j);
			}
		}
		System.out.println(sum);
	}
}
