
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
	Main m = new Main();
	m.answer();
    }

    private Scanner scan = new Scanner(System.in);
    private int A;
    private int B;
    private int C;
    private int D;
    private int E;
    private int F;

    public Main() {
	A = Integer.parseInt(scan.next());
	B = Integer.parseInt(scan.next());
	C = Integer.parseInt(scan.next());
	D = Integer.parseInt(scan.next());
	E = Integer.parseInt(scan.next());
	F = Integer.parseInt(scan.next());

	scan.close();
    }

    public final void answer() {
	// int i = 1;
	// System.out.println(IntStream.rangeClosed(0, F/(100*B))
	// 		   .map(j -> 100*A*i + 100*B*j)
	// 		   .filter(w -> w <= F)
	// 		   .boxed()
	// 		   .collect(Collectors.toList()));
	Set<Integer> waterSet = IntStream.rangeClosed(0, F/(100*A))
	    .mapToObj(i -> IntStream.rangeClosed(0, F/(100*B))
		      .map(j -> 100*A*i + 100*B*j)
		      .filter(w -> w > 0 && w <= F)
		      .boxed()
		      .collect(Collectors.toSet()))
	    .reduce(new HashSet<>(),
		    (l1, l2) -> {
			l1.addAll(l2);
			return l1;
		    });

	Set<Integer> sugarSet = IntStream.rangeClosed(0, F/C)
	    .mapToObj(i -> IntStream.rangeClosed(0, F/D)
		      .map(j -> C*i + D*j)
		      .filter(s -> s <= F)
		      .boxed()
		      .collect(Collectors.toSet()))
	    .reduce(new HashSet<>(),
		    (s1, s2) -> {
			s1.addAll(s2);
			return s1;
		    });

	Solution result = waterSet.stream()
	    .mapToInt(water -> water.intValue())
	    .mapToObj(water -> sugarSet.stream()
		      .mapToInt(sugar -> sugar.intValue())
		      .filter(sugar -> sugar <= water*E/100)
		      .mapToObj(sugar -> new Solution(water, sugar))
		      .filter(sol -> sol.total <= F)
		      .max(Comparator.naturalOrder())
		      .get())
	    .max(Comparator.naturalOrder())
	    .get();

	System.out.println(String.valueOf(result.total) + ' ' + result.sugar);
	
    }

    private static class Solution implements Comparable<Solution> {
	int water;
	int sugar;
	int total;

	public Solution(int w, int s) {
	    water = w;
	    sugar = s;
	    total = w + s;
	}

	@Override
	public int compareTo(Solution o) {
	    return this.sugar*o.total - o.sugar*this.total;
	}
    }
}
