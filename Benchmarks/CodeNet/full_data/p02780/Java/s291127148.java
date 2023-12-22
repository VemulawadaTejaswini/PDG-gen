import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int n, k;
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		k = scan.nextInt();
		Double[] list = new Double[n];
		for(int i = 0; i < n; i++) {
			Integer p = scan.nextInt();
			list[i] = culcExpectedValue(p);
		}
		Double maxExpectedValue = 0.0;
		Double expected = 0.0;
		for(int i = 0;i < k; i++) {
			expected += list[i];
		}
		maxExpectedValue = expected;
		for(int i = k; i < n; i++) {
			expected = expected + list[i] - list[i-k];
			if(maxExpectedValue < expected) maxExpectedValue = expected;
		}

		System.out.println(String.format("%.12f", maxExpectedValue));
		scan.close();
	}

	public static Double culcExpectedValue(int p) {
		Double ret = 0.0;
		for(int i=1;i<=p;i++) {
			ret += ((double) i) / ((double) p);
		}
		return ret;
	}

}