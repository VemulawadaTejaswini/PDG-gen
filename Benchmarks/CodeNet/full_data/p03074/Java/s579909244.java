import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int N = reader.nextInt();
		int K = reader.nextInt();
		String str = reader.next();
		ArrayList<Integer> zeroIndex = new ArrayList<Integer>();
		int[] zeroAcumulate = new int[N];
		int[] acumulate = new int[N];
		int ans = 0;
		for (int i = 0; i < N; i++) {
			char ch = str.charAt(i);
			int num = Character.getNumericValue(ch);
			if (ch == '0') {
				if (i > 0) {
					zeroAcumulate[i] = zeroAcumulate[i-1]+1;
				} else {
					zeroAcumulate[i] = 1;
				}
				acumulate[i] = 0;
				if (i == N-1) {
					zeroIndex.add(i);
				}
			} else {
				zeroAcumulate[i] = 0;
				acumulate[i] += num;
				if (i > 0 && zeroAcumulate[i-1] > 0) {
					zeroIndex.add(i-1);
				}
			}
			if (i+1 < N) {
				acumulate[i+1] = acumulate[i];
			}
		}
		for (int i = 0; i <= zeroIndex.size() - K; i++) {
			int tmp = 0;
			for (int j = i; j < K + i; j++) {
				int index = zeroIndex.get(j);
				tmp += zeroAcumulate[index];
				if (i > 0) {
					tmp += acumulate[index-zeroAcumulate[index]];
				}
			}
			int next = N;
			if (K+i < zeroIndex.size()) {
				next = zeroIndex.get(K+i);
			}
			tmp += acumulate[next-1];
			ans = Math.max(ans, tmp);
		}
		if (zeroIndex.size() == 0) {
			ans = 1;
		}


		System.out.println(ans);
		reader.close();

	}

}



