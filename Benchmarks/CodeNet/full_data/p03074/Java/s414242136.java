import java.util.Arrays;
import java.util.Scanner;

public class Main {
	void run() {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int K = scan.nextInt();
		String S = scan.next();
		int[] n = new int[N];
		
		int index = 0;
		int count = 1;
		char cur = S.charAt(0);
		char cur_c = cur;
		for (int i = 0; i < N; i++) {
			if (i == N - 1 || cur != S.charAt(i + 1)) {
				n[index++] = count;
				count = 0;
				if (i != N - 1)
					cur = S.charAt(i + 1);
			}
			count++;
		}
//		System.out.println(Arrays.toString(n));
		int sum = 0;
		for (int j = 0; j < K + (K + (cur_c == '1' ? 1 : 0)); j++)
			sum += n[j];
//		System.out.println(sum);
		int max = sum;
		if (cur_c == '0') {
			max = sum;
			sum = 0;
			for (int j = 1; j < K + (K + 2); j++)
				sum += n[j];
//			System.out.println(sum);
			max = Math.max(max, sum);
		}
		for (int i = (cur_c == '1' ? 0 : 1); i < index; i+= 2) {
//			System.out.println("m: " + n[i] + ", " + n[i + 1] + ", p: " + n[i + (K * 2 + 1)] + ", " + n [i + (K * 2 + 2)]);
			sum = sum - (n[i] + n[i + 1]) + (n[i + (K * 2 + 1)] + n [i + (K * 2 + 2)]);
//			System.out.println(sum);
			max = Math.max(max, sum);
		}
		System.out.println(max);
	}
    public static void main(String[] args) {
    	new Main().run();
    }
}