import java.util.*;

/**
 * Mの素因数分解をする．
 * 
 * 
 * @author glycine
 *
 */
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] tokens = in.nextLine().split(" ");
		int N = Integer.parseInt(tokens[0]);
		int M = Integer.parseInt(tokens[1]);

		List<Integer> yakusuu = new ArrayList<>();
		yakusuu.addAll(getYakusuu(M));
		Collections.sort(yakusuu);
		Collections.reverse(yakusuu);
		int limit = Math.floorDiv(M, N);
		int result = -1;
		for(int i = 0; i < yakusuu.size(); ++i) {
			if(yakusuu.get(i) <= limit) {
				result = yakusuu.get(i);
				break;
			}
		}
		System.out.println(result);
		in.close();
	}

	private static Set<Integer> getYakusuu(int M) {
		Set<Integer> result = new HashSet<>();
		result.add(1);
		result.add(M);
		for (int i = 2; i <= Math.sqrt(M); ++i) {
			if (M % i == 0) {
				result.add(i);
				result.add(M / i);
			}
		}
		return result;
	}
}