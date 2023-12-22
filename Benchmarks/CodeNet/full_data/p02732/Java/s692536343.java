import java.util.*;
import java.util.List;
import java.util.Map;
import java.util.Arrays;
import static java.util.stream.Collectors.*;
import static java.util.function.Function.*;

class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Integer[] ary = new Integer[n];
		for(int i=0; i<n; i++){
			ary[i] = in.nextInt();
		}
		List<Integer> list = new ArrayList<Integer>();
		list = Arrays.asList(ary);
		List<Integer> copy = new ArrayList<>(list);
		for(int i=0; i<n; i++){
			copy.remove(i);
			long totalCount = 0;
			Map<Integer, Long> map = copy
			.stream()
			.collect(groupingBy(identity(), counting()));
			for (Long  count: map.values()) {
				if(count >1 ){
					totalCount = totalCount + combination(count, 2);
				}
			}
			System.out.println(totalCount);
			copy = new ArrayList<>(list);
		}
	}
	public static long factorial(long n) {
		if (n <= 1)
			return 1;
		else {
			return n * factorial(n - 1);
		}
	}
	public static long combination(long n, long r) {
		long top = n;
		for (int i = 0; i < r - 1; i++) {
			top = top * (--n);
		}
		long bottom = factorial(r);
		return top / bottom;
	}
}
