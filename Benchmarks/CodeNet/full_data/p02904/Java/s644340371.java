import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static int N;
	static int K;
	static int[] P;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		N = Integer.parseInt(sc.next());
		K = Integer.parseInt(sc.next());

		P = new int[N];
		for(int i = 0;i <= N - 1;i++) {
			P[i] = Integer.parseInt(sc.next());
		}
		sc.close();

		boolean[] isUp = new boolean[N];
		Arrays.fill(isUp, true);
		int nextFill = 0;
		for(int i = 0;i <= N - K;i++) {
			if(P[i] > P[i + 1]) {
//				System.out.println(i);
//				System.out.println(nextFill);
//				System.out.println(i - K + 2);
//				System.out.println("a");
				for(int j = Math.max(nextFill, i - K + 2);j <= i;j++) {
//					System.out.println(j);
					isUp[j] = false;
				}
				nextFill = i + 1;
			}
		}
		int isUpCount = 0;
		for(int i = 0;i <= N - K;i++) {
//			System.out.println(isUp[i]);
			if(isUp[i]) isUpCount++;
		}


		int count = 1;

//		int[] firstPart = Arrays.copyOfRange(P, 0, K);
//
//		for(int i = 0;i < K;i++) {
//			System.out.println(firstPart[i]);
//		}


		int[] f = check();

//		if(f[0] == 0) {
//			count++;
//		}
		int Max = f[1];
		int Min = f[2];
//		int MinIndex = f[3];
//		System.out.println("Max:" + Max);
//		System.out.println("Min:" + Min);
//		System.out.println("count" + count);

		for(int first = 1;first <= N - K;first++) {
			int last = first + K - 1;

//			for(int i = first;i <= last;i++) {
//				System.out.print(P[i] + ",");
//			}
//			System.out.println("");

			count++;


			if(isUp[first]) {
				count--;
			}else {
				if(P[last] > Max) {
					if(P[first - 1] == Min) count--;
				}
			}

			if(P[last] > Max) {
				Max = P[last];
//				count--;
			}
			if(P[last] < Min) {
				Min = P[last];
//				MinIndex = last;
			}
			if(P[first - 1] == Max) {
				Max = myMaxMin(first, last, true);
			}
			if(P[first - 1] == Min) {
				Min = myMaxMin(first, last, false);
			}

//			System.out.println("first:" + first + ",Max:" + Max + ",count:" + count);
		}

		System.out.println(count + 1);

//		String s = sc.next();






	}

	static int myMaxMin(int f, int l, boolean b) {
		int M = P[f];
		if(b) {
			for(int i = f + 1;i <= l;i++) {
				if(M < P[i]) M = P[i];
			}
		}else {
			for(int i = f + 1;i <= l;i++) {
				if(M > P[i]) M = P[i];
			}
		}
		return M;
	}

	static int[] check() {
		int flag = 1;
		int Max = P[0];
		int Min = P[0];
//		int MinIndex = 0;

		for(int i = 1;i < K;i++) {
//			System.out.println("i:" + i);
			if(P[i - 1] > P[i]) {
				flag = 0;
//				break;
			}
			if(Max < P[i]) Max = P[i];
			if(Min > P[i]) {
				Min = P[i];
//				MinIndex = i;
			}
//			System.out.println("i:" + i);
//			System.out.println("K:" + K);
		}
		int[] ret = {flag, Max, Min};
		return ret;
	}
}