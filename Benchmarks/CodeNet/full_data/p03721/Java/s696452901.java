import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		List<BigAry> list = new LinkedList<BigAry>();
		for (int i = 0; i < N; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			BigAry ary = new BigAry(a, b);
			list.add(ary);
		}
		list.sort((a, b) -> a.value - b.value);
		long sum = 0;
		for (int i = 0; i < list.size(); i++) {
			sum += list.get(i).num;
			if (sum >= K) {
				System.out.println(list.get(i).value);
				return;
			}
		}
	}

	public static class BigAry {
		private int value;
		private int num;

		public BigAry(int value, int num) {
			this.value = value;
			this.num = num;
		}
	}

}