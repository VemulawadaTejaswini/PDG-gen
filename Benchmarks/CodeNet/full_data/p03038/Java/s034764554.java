import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int M = Integer.parseInt(sc.next());
		Card[] cards = new Card[N + M];
		for (int i = 0; i < N; i++) {
			cards[i] = new Card(1, Integer.parseInt(sc.next()));
		}

		for (int i = N; i < M + N; i++) {
			cards[i] = new Card(Integer.parseInt(sc.next()), Integer.parseInt(sc.next()));
		}
		sc.close();

		Arrays.sort(cards, new Comparator<Card>() {
			public int compare(Card t1, Card t2) {
				return (int) (t2.num - t1.num);
			}
		});

		long ans = 0;
		long remain = N;
		for (Card card : cards) {
			if (remain <= card.count) {
				ans += remain * card.num;
				break;
			}
			ans += card.num * card.count;
			remain -= card.count;
		}

		System.out.println(ans);

	}

	static class Card {
		long num;
		int count;

		Card(int count, int num) {
			this.count = count;
			this.num = num;
		}
	}

}