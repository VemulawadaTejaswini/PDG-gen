import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int K = sc.nextInt();

		int roopCountUp = 0;
		int roopCountDown = 0;
		Set<Integer> numberSet = new TreeSet<>();
		for (int i = A ; i <= B; i++) {

			numberSet.add(i);

			roopCountUp++;
			if (roopCountUp >= K) {
				break;
			}
		}
		for (int j = B; j >= A; j--) {

			numberSet.add(j);

			roopCountDown++;
			if (roopCountDown >= K) {
				break;
			}
		}
		for (Integer number : numberSet) {
			System.out.println(number);
		}


	}
}
