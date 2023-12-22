import java.util.Scanner;

// C - Stones
public class Main {
	static int N;
	static int countTotal = 1000000;
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	N = sc.nextInt();
	String s = sc.next();
	String[] S = s.split("");


	int dot = 0;
	int shapu = 0;
	for (int i = 0; i < N; i++) {
		if (S[i].equals("#")) {
			shapu++;
		}
		if (S[i].equals(".")) {
			dot++;
		}
	}
	if (shapu > dot) {
		int count = 0;
		for (int i = 0; i < N-1 /*最後の値はみない*/; i++) {
			if (S[i].equals("#") && S[i+1].equals(".")) {
				S[i+1] = "#";
				count++;
			}
		}
		countTotal = count;
	} else {
		sub(0, S, 0);
//		for (int i = 0; i < N-1 /*最後の値はみない*/; i++) {
//			if (S[i].equals("#") && S[i+1].equals(".")) {
//				S[i] = ".";
//				count++;
//			}
//		}
	}

	System.out.println(countTotal);
	}


	static void sub(int a, String[] S, int co) {
		int count = co;
		String[] S1 = S;
		String[] S2 = S;

		for (int i = a; i < N-1 /*最後の値はみない*/; i++) {
			if (S[i].equals("#") && S[i+1].equals(".")) {
				count++;
				S1[i+1] = "#";
				S2[i] = ".";
				sub(i, S1, count);
				sub(i, S2, count);
			}
		}
		if (count <= countTotal) {
			countTotal = count;
			return;
		}
	}
}