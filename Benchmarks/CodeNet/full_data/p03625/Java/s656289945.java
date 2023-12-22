import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int ai : A) {
			Integer i = map.get(ai);
			map.put(ai, i == null ? 1 : i + 1);
		}

	    for (int key : map.keySet()) {
	    	if ( map.get(key) >= 2) list.add(key);
		}

	    Integer[] answers = (Integer[]) list.toArray(new Integer[0]);
	    if (answers.length < 2) {System.out.println(0); return; }
	    Arrays.sort(answers);
	    System.out.println(answers[answers.length-1]*answers[answers.length-2]);
	}

}
