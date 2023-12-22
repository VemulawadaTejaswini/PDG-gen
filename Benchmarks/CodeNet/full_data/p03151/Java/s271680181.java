import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);

		String line = s.nextLine();
		int N = Integer.parseInt(line);

		line = s.nextLine();
		String[] str = line.split(" ");
		long[] A = new long[N];
		long sumA = 0;
		for (int i = 0; i < N; i++) {
			A[i] = Long.parseLong(str[i]);
			sumA += A[i];
		}

		line = s.nextLine();
		str = line.split(" ");
		long[] B = new long[N];
		long sumB = 0;
		for (int i = 0; i < N; i++) {
			B[i] = Long.parseLong(str[i]);
			sumB += B[i];
		}

		if (sumB > sumA) {
			System.out.println(-1);
			return;
		}

		int changeCnt = 0;
		long penaSum = 0L;
		long[] pena = new long[N];
		for (int i = 0; i < N; i++) {
			pena[i] = B[i] - A[i];
			if (pena[i] > 0) {
				changeCnt++;
				penaSum += pena[i];
			}
		}

		long tmp = 0;
		for (int i = 0; i < N - 1; i++) {
			for (int j = i + 1; j < N; j++) {
				if (pena[i] > pena[j]) {
					tmp = pena[i];
					pena[i] = pena[j];
					pena[j] = tmp;
				}
			}
		}

		for (int i = 0; i < N; i++) {
			if (penaSum <= 0)
				break;
			else {
				penaSum += pena[i];
				changeCnt++;
			}
		}

		System.out.println(changeCnt);
	}
}