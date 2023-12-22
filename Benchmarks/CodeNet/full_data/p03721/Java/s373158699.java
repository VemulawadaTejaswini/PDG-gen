import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> array = new ArrayList<>();
		int N = 0;
		int number = 0;
		int count = 0;
		int K = 0;

		N = scan.nextInt();
		K = scan.nextInt();
		
		for (int i = 0; i < N; i++) {
			number = scan.nextInt();
			count = scan.nextInt();
			
			for (int j = 0; j < count; j++) {
				array.add(number);
			}
		}
		array.sort(Comparator.naturalOrder());
		System.out.println(array.get(K - 1));
	}
}