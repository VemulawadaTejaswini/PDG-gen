import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long k = sc.nextLong();
		long num = sc.nextLong();
		List<Integer> primes = primeFactor(num);
		List<Integer> oks = new ArrayList<Integer>();
//		System.out.println(Arrays.toString(primes.toArray()));
		for(int i=0;i<primes.size();i++) {
			if(primes.lastIndexOf( primes.get(i) ) - i +1 >= k) {
				oks.add(primes.get(i));
//				System.out.println("get:"+primes.get(i));
			}
			i = primes.lastIndexOf( primes.get(i) );
		}
		long ans=1;
		for(long pr:oks) {
			ans*=pr;
		}
		System.out.println(ans);
	}
	static long gcd(long m, long n) {
		if(m < n) return gcd(n, m);
		if(n == 0) return m;
		return gcd(n, m % n);
	}

	static long lcm(long m, long n) {
		return m * n / gcd(m, n);
	}
	/**<h1>素因数分解のリストを作る</h1>
	 * @param num ： 素因数分解する値 (>=0)
	 * @return<b>List<Integer></b> ： 素因数分解のリスト
	 */
	public static final List<Integer> primeFactor(long num) {
		final List<Integer> list = new ArrayList<Integer>();
		if (num < 2) {    //n が2以上とわかっていれば、ここは不要
			return list;
		}

		while (num != 1 && num % 2 == 0) {    //2で割り切れるだけ割る
			list.add(2);
			num >>>= 1;        //÷2 の代わり
		}

		for (int i = 3; i * i <= num; i += 2) {    //奇数のみ [O(√n[/2])で可]
			while (num % i == 0) {
				list.add(i);
				num /= i;
			}
		}

		if (num != 1) {
			list.add((int) num);
		}
		return list;
	}


}
