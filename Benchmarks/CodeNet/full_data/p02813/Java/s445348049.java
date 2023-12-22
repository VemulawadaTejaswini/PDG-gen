import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] p = new int[n];
		int[] q = new int[n];
		IntStream.rangeClosed(1, n).forEach(i -> p[i - 1] = sc.nextInt());
		IntStream.rangeClosed(1, n).forEach(i -> q[i - 1] = sc.nextInt());
		int[] convertedP = convert(p);
		int[] convertedQ = convert(q);
		int diff = 0;
		for (int i = 0; i < n; i++) {
			diff = diff + (convertedP[i] - convertedQ[i]) * pow(n - i - 1);
		}
		print(abs(diff));
		sc.close();
	}

	public static int[] convert(int[] n) {
		int[] converted = new int[n.length];
		for (int i = 0; i < n.length; i++) {
			converted[i] = n[i];
			int order = n[i];
			for (int j = 0; j < i; j++) {
				if (n[j] < order) {
					converted[i] = converted[i] - 1;
				}
			}
		}
		return converted;
	}

	public static int abs(int n) {
		return n > 0 ? n : -n;
	}

	public static int pow(int n) {
		int powNum = 1;
		for (int i = 1; i <= n; i++) {
			powNum = powNum * i;
		}
		return powNum;
	}

	public static void print(Object obj) {
		System.out.println(obj);
	}

}