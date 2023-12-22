import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		int Alice = 0;
		int Bob = 0;
		int N;
		ArrayList<Integer> cards = new ArrayList<Integer>();

		Scanner scan = new Scanner(System.in);
		N = scan.nextInt();

		for(int i = 0; i < N; i++) {
			cards.add(scan.nextInt());
		}

		Collections.sort(cards, Collections.reverseOrder());

		for(int i = 0; i < N; i+=2) {
			Alice += cards.get(i);
		}
		for(int i = 1; i < N; i+=2) {
			Bob += cards.get(i);
		}
		System.out.println(Alice - Bob);
		scan.close();
	}
}