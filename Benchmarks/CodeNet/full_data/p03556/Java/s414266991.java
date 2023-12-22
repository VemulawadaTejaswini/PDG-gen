import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i < 40000; i++) {
			list.add(i * i);
		}
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		for (int i = N; i >= 1; i--) {
			if (list.contains(i)) {
				System.out.println(i);
				break;
			}
		}
	}
}