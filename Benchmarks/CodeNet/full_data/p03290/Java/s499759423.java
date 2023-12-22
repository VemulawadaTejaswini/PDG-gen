import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
	private static class ProbSet {
		int eachScore;
		int num;
		int bonus;
		int total;

		public ProbSet(int eachScore, int num, int bonus) {
			this.eachScore = eachScore;
			this.num = num;
			this.bonus = bonus;
			this.total = eachScore * num + bonus;
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] tokens = in.nextLine().split(" ");
		int D = Integer.parseInt(tokens[0]);
		int G = Integer.parseInt(tokens[1]);
		int[] p = new int[D];
		int[] c = new int[D];
		for (int i = 0; i < D; ++i) {
			tokens = in.nextLine().split(" ");
			p[i] = Integer.parseInt(tokens[0]);
			c[i] = Integer.parseInt(tokens[1]);
		}

		List<ProbSet> probSets = new ArrayList<>();
		for (int i = 0; i < D; ++i) {
			int score = (i + 1) * 100;
			probSets.add(new ProbSet(score, p[i], c[i]));
		}
		Collections.sort(probSets, new Comparator<ProbSet>() {
			// 1問あたりのスコアが高い順にソート．
			// 同一の場合はベースのスコアが高い順に
			@Override
			public int compare(ProbSet o1, ProbSet o2) {
				double o1AveScore = (double) o1.eachScore + (double) o1.bonus / (double) o1.num;
				double o2AveScore = (double) o2.eachScore + (double) o2.bonus / (double) o2.num;
				if (o1AveScore < o2AveScore) {
					return -1;
				} else if (o1AveScore > o2AveScore) {
					return 1;
				} else {
					if (o1.eachScore < o2.eachScore) {
						return -1;
					} else if (o1.eachScore > o2.eachScore) {
						return 1;
					} else {
						return 0;
					}
				}
			}
		});
		Collections.reverse(probSets);
		int solvedNum = 0;
		for (int i = 0; i < probSets.size(); ++i) {
			// System.out.println("G = " + G);
			ProbSet probSet = probSets.get(i);
			if (G > probSet.total) {
				G -= probSet.total;
				solvedNum += probSet.num;
			} else {
				solvedNum += Math.floorDiv(G, probSet.eachScore) ;
				break;
			}
		}
		System.out.println(solvedNum);
		in.close();
	}
}