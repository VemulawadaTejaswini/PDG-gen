import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	static class Tuple {
		int l, r;

		Tuple(String line) {
			String[] tokens = line.split(" ");
			this.l = Integer.parseInt(tokens[0]);
			this.r = Integer.parseInt(tokens[1]);
		}
	}

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		int Q = Integer.parseInt(in.readLine());
		Tuple[] tuples = new Tuple[Q];
		for (int i = 0; i < Q; ++i) {
			tuples[i] = new Tuple(in.readLine());
		}
		// lの最小，rの最大を求める
		int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
		for (Tuple tuple : tuples) {
			min = Math.min(min, tuple.l);
			max = Math.max(max, tuple.r);
		}
		min = min / 2 - 1;
		if (min < 1) {
			min = 3;
		} else if (min % 2 == 0) {
			min += 1;
		}
		// min以上，max以下のprimesを求める
		List<Integer> primes = new ArrayList<>();
		primes.add(2);
		for (int i = min; i <= max; i = i + 2) {
			if (isPrime(i)) {
				primes.add(i);
			}
		}
		Set<Integer> set = new HashSet<>();
		set.addAll(primes);
		for (int i = 0; i < tuples.length; ++i) {
			System.out.println(calc(tuples[i], primes, set));
		}

	}

	static int calc(Tuple tuple, List<Integer> primes, Set<Integer> primeSet) {
		int result = 0;
		for (int i = 0; i < primes.size(); ++i) {
			int prime = primes.get(i);
			if (prime < tuple.l || prime > tuple.r) {
				continue;
			}
			if (primeSet.contains((prime + 1) / 2)) {
				++result;
			}
		}
		return result;
	}

	static boolean isPrime(int val) {
		for (int i = 2; i <= Math.sqrt(val) + 1; ++i) {
			if (val % i == 0) {
				return false;
			}
		}
		return true;
	}
}