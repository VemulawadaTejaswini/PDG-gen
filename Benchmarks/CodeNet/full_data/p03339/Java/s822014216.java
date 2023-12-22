import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] west = new int[n];
		int[] east = new int[n];
		int min = 500000, sum;
		String s = sc.next();
		if (s.charAt(0) == 'W') {
			west[0]++;
		} else {
			east[0]++;
		}
		for (int i = 1; i < n; i++) {
			if (s.charAt(i) == 'W') {
				west[i] = west[i - 1] + 1;
				east[i] = east[i - 1];
			} else {
				east[i] = east[i - 1] + 1;
				west[i] = west[i - 1];
			}
		}
		for (int i = 0; i < n; i++) {
			sum = west[i] + east[n - 1] - east[i];
			if (s.charAt(i) == 'W') {
				sum--;
			}
			if (min > sum) {
				min = sum;
			}
			//System.out.println(east[i] + " " + west[i]);
			///System.out.println(sum);
		}
		System.out.println(min);
	}
}