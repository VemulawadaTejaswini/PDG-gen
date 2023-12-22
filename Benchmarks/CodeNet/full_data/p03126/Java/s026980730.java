import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//AtCoder Beginner Contest 118
//B	Foods Loved by Everyone
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();

		List<List<Integer>> inList = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			int K = sc.nextInt();
			List<Integer> inListK = new ArrayList<>();
			for (int j = 0; j < K; j++) {
				inListK.add(sc.nextInt());
			}
			inList.add(inListK);
		}
		sc.close();

		int[] Ms = new int[M];
		for (int i = 0; i < Ms.length; i++) {
			Ms[i] = 0;
		}

		for (List<Integer> list : inList) {
			for (Integer i : list) {
				Ms[i.intValue()-1]++;
			}
		}

		int kind = 0;
		for (int i = 0; i < Ms.length; i++) {
			if (Ms[i] == N) {
				kind++;
			}
		}

		System.out.println(kind);
	}
}
