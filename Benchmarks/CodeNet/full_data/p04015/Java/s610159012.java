import java.util.*;

public class Main {
	public static long takCards(int[] cards, int avg) {
		ArrayList<ArrayList<Integer>> cache = new ArrayList<ArrayList<Integer>>();

		for (int i : cards)
			cache.add(new ArrayList<Integer>());

		long count = 0;
		for (int i = 1; i <= cards.length; i++)
			for (int j = 0; j < cards.length; j++){
				ArrayList<Integer> curList = cache.get(i-1);
				if (i == 1) {
					curList.add(cards[j]);
					if (cards[j] == avg)
						count++;
				}
				else {
					ArrayList<Integer> prevList = cache.get(i-2);
					for (int k : prevList){
						curList.add(k + cards[j]);
						if (k+cards[j] == avg*i)
							count++;
					}
				}
			}

		return count;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String firstLine = scanner.nextLine();
		String secondLine = scanner.nextLine();

		String[] convertedFirst = firstLine.split("\\s+");
		int avg = Integer.parseInt(convertedFirst[1]);

		String[] convertedSecond = secondLine.split("\\s+");
		int[] arr = new int[convertedSecond.length];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(convertedSecond[i]);
		}

		System.out.println(takCards(arr, avg));
	}
}