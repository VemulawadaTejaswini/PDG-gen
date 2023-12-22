import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int n = Integer.parseInt(s.next());
		int[] cards = new int[n];

		for (int i=0; i<n; i++) {
			cards[i] = Integer.parseInt(s.next());
		}

		Arrays.sort(cards);

		int[] total = {0, 0};
		for (int i=0; i<n; i++) {
			total[i%2]++;
		}

		System.out.println(total[0]-total[1]);
	}
}