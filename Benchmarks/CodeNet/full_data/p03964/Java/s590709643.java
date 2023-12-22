import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numberOfChecks = sc.nextInt();
		long count1 = 0;
		long count2 = 2;
		double lastVotesForA = 0;
		double lastVotesForB = 0;
		
		while (count1 < numberOfChecks) {
			double voteRatioForA = sc.nextInt();
			double voteRatioForB = sc.nextInt();
			double votesForA = 0;
			double votesForB = 0;
			while (count2 >= 0) {
				if ((count2 % (voteRatioForA + voteRatioForB) == 0) && votesForA >= lastVotesForA && votesForB >= lastVotesForB) {
					break;
				} else {
					count2 = (int) (count2 + voteRatioForA + voteRatioForB - (count2 % (voteRatioForA + voteRatioForB)));
					votesForA = voteRatioForA/(voteRatioForA + voteRatioForB) * count2;
					votesForB = voteRatioForB/(voteRatioForA + voteRatioForB) * count2;
				}
			}
			lastVotesForA = votesForA;
			lastVotesForB = votesForB;
			count1++;
		}
		System.out.println(count2);
	}
}