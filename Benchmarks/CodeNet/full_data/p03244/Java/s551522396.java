import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		String vstr = sc.nextLine();
		String[] vstrArray = vstr.split(" ");

		ArrayList<Integer> Odds = new ArrayList<Integer>();
		ArrayList<Integer> Evens = new ArrayList<Integer>();

		for (int i = 0; i < vstrArray.length; i = i + 2) {
			Odds.add(Integer.parseInt(vstrArray[i]));
			Evens.add(Integer.parseInt(vstrArray[i + 1]));
		}

		int MaxFreqOddsNum = -1;
		int MaxFreqOddsCount = 0;
		int SecondFreqOddsNum = -1;
		int SecondFreqOddsCount = 0;
		int MaxFreqEvensNum = -1;
		int MaxFreqEvensCount = 0;
		int SecondFreqEvensNum = -1;
		int SecondFreqEvensCount = 0;

		for (int j = 0; j < Odds.size(); j++) {
			if (Odds.get(j) == MaxFreqOddsNum) {
				MaxFreqOddsCount++;
			} else if (Odds.get(j) > MaxFreqOddsNum) {
				SecondFreqOddsNum = MaxFreqOddsNum;
				SecondFreqOddsCount = MaxFreqOddsCount;
				MaxFreqOddsCount = 1;
				MaxFreqOddsNum = Odds.get(j);
			}
		}
		for (int j = 0; j < Evens.size(); j++) {
			if (Evens.get(j) == MaxFreqEvensNum) {
				MaxFreqEvensCount++;
			} else if (Evens.get(j) > MaxFreqEvensNum) {
				SecondFreqEvensNum = MaxFreqEvensNum;
				SecondFreqEvensCount = MaxFreqEvensCount;
				MaxFreqEvensCount = 1;
				MaxFreqEvensNum = Evens.get(j);
			}
		}
		if (MaxFreqOddsNum == MaxFreqEvensNum) {
			if (MaxFreqOddsCount < MaxFreqEvensCount) {
				MaxFreqOddsCount = SecondFreqOddsCount;
				MaxFreqOddsNum = SecondFreqOddsNum;
			}else{
				MaxFreqEvensCount = SecondFreqEvensCount;
				MaxFreqEvensNum = SecondFreqEvensNum;
			}
		}
		int answer = n - (MaxFreqOddsCount + MaxFreqEvensCount);
		System.out.println(answer);
	}
}