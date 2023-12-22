

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		Prime prime = new Prime();
		prime.addPrime(n);
//		prime.printPrime(n);
		List<Integer> list = new ArrayList<>();
		for (int i = 1; i <= n; i++) {
			list.addAll(prime.getPrimeFactor(i));
		}
		Map<Integer, List<Integer>> map = list.stream()
			.collect(Collectors.groupingBy(i -> i));
		List<Integer> list2 = map.keySet()
			.stream()
			.map(e -> map.get(e).size())
			.collect(Collectors.toList());
		long ans = 1l;
		for (Integer integer : list2) {
			ans = (ans * (integer + 1) ) % 1000000007;
		}
		System.out.println(ans);
	}
	
	public static class Prime {
		private List<Integer> list = new ArrayList<>();
		public Prime() {
			list.add(2);
			list.add(3);
		}

		/**
		 * リストにn未満の素数があるかを判定する
		 * @return trueであればリストされている
		 */
		public boolean isListed(int n) {
			return list.get(list.size() - 1) >= n;
		}

		/**
		 * n未満の素数を表示する
		 * @param n nの数字
		 */
		public void printPrime(int n) {
			if (!isListed(n)) {
				addPrime(n);
			}
			list.stream()
				.filter(e -> e < n)
				.forEach(System.out::println);
		}

		/**
		 * n未満の整数をリストに追加する
		 * @param n
		 */
		public void addPrime(int n) {
			if (n <= 2) {
				return;
			}
			for (int i = list.get(list.size() - 1) + 2; i < n; i += 2) {
				if (new Check() {
					@Override
					public boolean accept(int i) {
						for (Integer integer : list) {
							int sq = (int) Math.sqrt(i);
							if (integer > sq) {
								return true;
							}
							if (i % integer == 0) {
								return false;
							}
						}
						return true;
					}
				}.accept(i)) {
					list.add(i);
				}
				
			}
		}

		/**
		 * @param n 素因数分解する変数を代入する
		 * @return 素因数因子のリストを返却する
		 */
		public List<Integer> getPrimeFactor(int n) {
			if (!isListed(n + 1)) {
				addPrime(n + 1);
			}
			int a = n;
			List<Integer> list = new ArrayList<>();
			for (int i = 0; i < this.list.size(); i++) {
				int b = this.list.get(i);
				if (a % b == 0) {
					list.add(b);
					i--;
					a /= b;
				}
				if (a < b ) {
					break;
				}
			}
			return list;
		}
	}
	public static interface Check{
		public boolean accept(int i);
	}
}
