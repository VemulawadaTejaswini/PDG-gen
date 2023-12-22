import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			Integer items = sc.nextInt();
			Integer sumOfPickedItems = sc.nextInt();

			int[] votes = new int[items];
			for(int i = 0;i < items; i++) {
				votes[i] = sc.nextInt();
			}

			ArrayList<Integer> sortedVote = new ArrayList<>();
			for(int vote : votes) {
				sortedVote.add(vote);
			}
			sortedVote.sort(Comparator.reverseOrder());
			for(int i = 0;i < votes.length; i++) {
				votes[i] = sortedVote.get(i);
			}

			Integer[] rankedItemVotes = new Integer[sumOfPickedItems];
			for(int j = 0;j < sumOfPickedItems; j++) {
				rankedItemVotes[j] = votes[j];
			}

			int voteSum = Arrays.stream(votes).sum();
			for(int k = 0;k < sumOfPickedItems; k++) {
				int hoge = voteSum / (4 * sumOfPickedItems);
				if(rankedItemVotes[k] < hoge) {
					System.out.println("No");
					return;
				}
			}
			System.out.println("Yes");
		}
	}
}
