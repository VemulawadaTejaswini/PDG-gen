import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int weights[] = new int[n];

		int group2 = 0;

		for(int i = 0; i < n; i++) {
			weights[i] = sc.nextInt();
			group2 += weights[i];
		}

		int group1 = 0;
		int t = 0;

		while(group1 < group2) {
			group1 += weights[t];
			group2 -= weights[t];
			t++;
		}

		if(Math.abs(group2 - group1) > Math.abs((group2 + weights[t - 1]) - (group1 - weights[t - 1]))) {
			group1 -= weights[t - 1];
			group2 += weights[t - 1];
		}

		System.out.println(Math.abs(group2 - group1));
	}
}
