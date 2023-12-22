import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int N = scanner.nextInt();
			// input
			List<Integer> integers = new ArrayList<Integer>();
			for (int i = 0; i < 3 * N; i++) {
				integers.add(scanner.nextInt());
			}
			//参加者配列を降順ソート
			Collections.sort(integers, Comparator.reverseOrder());
			// 参加者振り分け処理
			List<List<Integer>> teams = allocateTerm(integers, N);
			// チームごと2番目の合計値を算出する
			System.out.println(secondSankaSum(teams));
		}
	}

	private static long secondSankaSum(List<List<Integer>> teams) {
		int sum = 0;
		for (Iterator iterator = teams.iterator(); iterator.hasNext();) {
			List<Integer> list = (List<Integer>) iterator.next();
			sum += list.get(1);
		}
		return sum;
	}

	private static List<List<Integer>> allocateTerm(List<Integer> integers, int sankaTeamCnt) {
		List<List<Integer>> teams = initTeams(sankaTeamCnt);
		for (int i = 0; i < integers.size(); i += sankaTeamCnt) {
			for (int j = i; j < i + sankaTeamCnt; j++) {
				teams.get(j % sankaTeamCnt).add(integers.get(j));
			}
		}
		return teams;
	}

	private static List<List<Integer>> initTeams(int sankaTeamCnt) {
		// TODO 自動生成されたメソッド・スタブ
		List<List<Integer>> teams = new ArrayList<List<Integer>>();
		for (int i = 0; i < sankaTeamCnt; i++) {
			teams.add(new ArrayList<Integer>());
		}
		return teams;
	}
}