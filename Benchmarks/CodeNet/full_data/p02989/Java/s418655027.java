import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] d = new int[n];
		int count = 0;
		for (int i = 0; i < n; i++) {
			d[i] = sc.nextInt();
		}
		Arrays.sort(d);
		int min = d[n / 2 - 1];
		int max = d[n / 2];
		for (int i = min; i < max; i++) {
			count++;
		}
		System.out.println(count);
	}
}