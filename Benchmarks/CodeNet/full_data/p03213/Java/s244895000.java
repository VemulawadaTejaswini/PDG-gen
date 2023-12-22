import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

	static final int[][] FN = new int[][]{ {74, 1, 1}, {24, 2, 1}, {14, 4, 1}, {4, 4, 2}};

	public static void main(String[] args) {
		Scanner sysin = new Scanner(System.in);
		final int n = sysin.nextInt();
		sysin.close();

		//System.out.println(String.format("  N    = %3d", n));
		int[] primes = getPrime(n);
		//System.out.println(Arrays.stream(primes).boxed().map(e -> String.format("%3d", e)).collect(Collectors.joining(",", "素数   = [", "] (2 ≦ P ≦ N)")));
		List<Result> primeFactors = getPrimeFactors(n, primes);
		//System.out.println(primeFactors.stream().map(Result::toString).collect(Collectors.joining(" * ", String.format("%3d!   = ", n), "")));
		List<Results> result = dp(primeFactors).stream().distinct().sorted(Comparator.comparingDouble(Results::getValue)).collect(Collectors.toList());
		//System.out.println(result.stream().mapToDouble(Results::getValue).mapToObj(e -> String.format("%.0f", e)).collect(Collectors.joining(", ", "75数   = [", "]")));
		//System.out.println(result.stream().map(Results::toString).collect(Collectors.joining(", ", "素因数 = [", "]")));
		//System.out.println(String.format("答え   = %d個", result.stream().mapToDouble(Results::getValue).count()));
		System.out.println(result.stream().mapToDouble(Results::getValue).count());
	}

	private static final List<Results> dp(List<Result> factors) {
		List<Results> result = new ArrayList<>();

		for (int[] nums : FN) {
			List<List<Result>> entries = new ArrayList<>();
			for (int i = 0; i < 3; i++) {
				final int min = nums[i];
				if (min > 1) {
					entries.add(factors.stream()
							.filter(r -> r.getE() >= min)
							.collect(Collectors.toList()));
				} else {
					entries.add(Arrays.asList(Result.NULL));
				}
			}

			for (Result x : entries.get(0)) {
				for (Result y : entries.get(1)) {
					if (y.equals(x)) continue;
					for (Result z : entries.get(2)) {
						if (z.equals(y) || z.equals(x)) continue;
						result.add(new Results(	new Result(x, nums[0]),
												new Result(y, nums[1]),
												new Result(z, nums[2]) ));
					}
				}
			}
		}

		return result;
	}

	// 2 ~ max までの素数の一覧を求める
	private static final int[] getPrime(int max) {
		List<Integer> primes = new ArrayList<>();

		outer : for (int i = 2; i <= max; i++) {
			for (int n : primes) {
				if (i % n == 0) {
					continue outer;
				}
			}
			primes.add(i);
		}

		return primes.stream().mapToInt(Integer::intValue).toArray();
	}

	// nを素因数分解し、素因数j:指数kのマッピングを返す
	private static final Map<Integer, Integer> countPrimeFactor(int n, int[] primes) {
		int i = 0;
		Map<Integer, Integer> primeFactors = new HashMap<>();

		while (n > 0 && n >= primes[i]) {
			if (n % primes[i] == 0) {
				n /= primes[i];

				Integer v = primeFactors.get(primes[i]);
				primeFactors.put(primes[i], (v == null) ? 1 : v + 1);
			} else {
				i++;
			}
		}

		return primeFactors;
	}

	// n!を素因数分解し、素因数j:指数kのマッピングを返す
	private static final List<Result> getPrimeFactors (int n, int[] primes) {

		Map<Integer, Integer> primeFactors = new HashMap<>();
		for (int i = 2; i <= n; i++) {
			Map<Integer, Integer> m = countPrimeFactor(i, primes);

			for(Entry<Integer, Integer> e : m.entrySet()) {
				Integer v = primeFactors.get(e.getKey());
				primeFactors.put(e.getKey(), e.getValue() + ((v == null) ? 0 : v));
			}
			System.out.println(m.entrySet().stream().map(e -> String.format("(%2d^%2d)", e.getKey(), e.getValue())).collect(Collectors.joining(" * ", String.format("%3d    = ", i), "")));
		}

		return primeFactors.entrySet().stream()
				.map(e -> new Result(e.getKey(), e.getValue()))
				.sorted(Comparator.comparingInt(Result::getB))
				.collect(Collectors.toList());
	}
}

class Result {
	static Result NULL;
	static { NULL = new Result(1, 1); }

	private final int B;
	private final int E;
	public Result(int base, int exponent) {
		B = base;
		E = exponent;
	}

	public Result(Result r, int exponent) {
		B = r.B;
		E = exponent;
	}

	private final double pow(int b, int e) {
		double r = 1;
		for (int i = 0; i < e; i++) {
			r *= b;
		}
		return r;
	}

	protected final double getR() {
		return pow(B, E);
	}

	protected final int getB() {
		return B;
	}

	protected final int getE() {
		return E;
	}

	protected final boolean isNotNull() {
		return getR() != 1;
	}

	@Override
	public String toString() {
		return String.format("(%2d^%2d)", B, E);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) return false;
		if (!(obj instanceof Result)) return false;

		Result r = (Result)obj;
		return (r.isNotNull() && this.isNotNull() && (r.getR() == this.getR()));
	}
}

class Results {
	private final List<Result> RS;
	private double V;

	public Results() {
		RS = new ArrayList<>();
		calc();
	}

	public Results(Result... r) {
		this();
		Arrays.stream(r).filter(Result::isNotNull).forEach(RS::add);
		calc();
	}

	private void calc() {
		V = RS.stream().mapToDouble(Result::getR).reduce(1, (e1, e2) -> e1 * e2);
	}

	public double getValue() {
		return V;
	}

	@Override
	public String toString() {
		return RS.stream().filter(Result::isNotNull).map(Result::toString).collect(Collectors.joining(" * ", "[", "]"));
	}

	@Override
	public boolean equals(Object e) {
		return (e instanceof Results) &&
				((Results)e).getValue() == this.getValue();
	}

	@Override
	public int hashCode() {
		return 0;
	}
}

class NullEntry implements Entry<Integer, Integer> {
	public NullEntry() {
	}

	@Override
	public Integer getKey() {
		return 1;
	}

	@Override
	public Integer getValue() {
		return 1;
	}

	@Override
	public Integer setValue(Integer value) {
		return 1;
	}

	@Override
	public boolean equals(Object e) {
		return false;
	}
}