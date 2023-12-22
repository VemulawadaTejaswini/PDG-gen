import java.util.Scanner;

public class Main {

	public static int cntOdd;
	public static int[] alphabetCnt = new int[26];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();

		for (int i = 0; i < 26; i++) {
			alphabetCnt[i] = 0;
		}

		for (int i = 0; i < s.length(); i++) {
			int alphabetIdx = (int) s.charAt(i) - 97;
			alphabetCnt[alphabetIdx] ++;
		}

		for (int i = 0; i < 26; i++) {
			if(alphabetCnt[i] % 2 == 1) {
				cntOdd++;
			}
		}

		int firstIdx = 0;
		int ans = 0;
		while (firstIdx != s.length()) {
			firstIdx = findLastIdx(firstIdx, s.length() - 1, s) + 1;
			// System.out.println(firstIdx);
			ans++;
		}

		System.out.print(ans);
	}

	public static int findLastIdx(int firstIdx, int lastIdx, String s) {
		int cntOddCopy = cntOdd;
		int[] alphabetCntCopy = new int[26];
		for (int i = 0; i < 26; i++) {
			alphabetCntCopy[i] = alphabetCnt[i];
		}
		// System.out.println(cntOddCopy);
		while (true) {
			if (cntOddCopy <= 1) {
				break;
			} else if (lastIdx == firstIdx) {
				break;
			} else {
				int alphabetIdx = (int) s.charAt(lastIdx) - 97;
				if (alphabetCntCopy[alphabetIdx] % 2 == 1) {
					alphabetCntCopy[alphabetIdx]--;
					// System.out.println("minus");
					cntOddCopy--;
				} else {
					alphabetCntCopy[alphabetIdx]--;
					// System.out.println("plus");
					cntOddCopy++;
				}
				lastIdx--;
			}
		}
		// System.out.println(cntOddCopy);
		cntOdd -= cntOddCopy;
		for (int i = firstIdx; i <= lastIdx; i++) {
			int alphabetIdx = (int) s.charAt(i) - 97;
			alphabetCnt[alphabetIdx] --;
		}
		return lastIdx;
	}
}
