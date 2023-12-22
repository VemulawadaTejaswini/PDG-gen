import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		final long A = scan.nextLong();
		final long B = scan.nextLong();
		scan.close();

		// AとBを素因数分解する
		ArrayList<Long> primeFactorsA = primeFactorization(A);
		ArrayList<Long> primeFactorsB = primeFactorization(B);

		// 素因数の共通項を求める
		long result = countCommonTerm(primeFactorsA,primeFactorsB) + 1;
		System.out.println(result);

	}

	// 素因数分解をするメソッド・改
	private static ArrayList<Long> primeFactorization(Long n){
		ArrayList<Long> primeFactors = new ArrayList<Long>();
		long m = n;
		long d = 0;
		while(n > 1) {
			m--;
			if(n % m == 0) {
				d = n / m;
				primeFactors.add(d);
				n /= d;
				while(n % d == 0) {
					n /= d;
				}
				m = n;
			}
		}
		return primeFactors;
	}

	// 共通項の個数を求めるメソッド
	private static long countCommonTerm(ArrayList<Long> a, ArrayList<Long> b) {
		int result = 0;
		int size = 0;

		if(a.size() > b.size()) {
			size = a.size();
			HashSet<Long> bHashSet = new HashSet<Long>(b);
			for(int i = 0; i < size; i++) {
				if(bHashSet.contains(a.get(i))) {
					result++;
				}
			}
		}else {
			size = b.size();
			HashSet<Long> aHashSet = new HashSet<Long>(b);
			for(int i = 0; i < size; i++) {
				if(aHashSet.contains(a.get(i))) {
					result++;
				}
			}
		}
		return result;
	}

}
