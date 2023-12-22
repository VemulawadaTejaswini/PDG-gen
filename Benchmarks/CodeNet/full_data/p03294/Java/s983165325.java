import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		ArrayList<Integer> list =  new ArrayList<Integer>();
		for(int i = 0; i < num; i++) {
			list.add(scanner.nextInt());
		}
		long lcm = lcmnum(list);

		int res = 0;
		for(int i = 1; i < lcm; i++) {
			int sum = 0;
			for(int j : list) {
				sum += i % j;
			}

			if(res < sum) {
				res = sum;
			}
		}

		System.out.println(res);
	}
	private static long lcmnum(ArrayList<Integer> list) {
		long i = list.get(0);
		for(int num : list) {
			i = lcm(i, num);
		}
		return i;
	}

	 private static long gcd(long m, long n) {
	        if(m < n) return gcd(n, m);
	        if(n == 0) return m;
	        return gcd(n, m % n);
	    }

	 private static long lcm(long m, long n) {
	        return m * n / gcd(m, n);
	  }

}
