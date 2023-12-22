import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//入力
		int N = sc.nextInt();

		List<String> SList = new ArrayList<String>();

		for (int i = 0; i < N; i++) {
			String S = sc.next();
			SList.add(S);
		}

		int flagM=0;
		int countM=0;

		int flagA=0;
		int countA=0;

		int flagR=0;
		int countR=0;

		int flagC=0;
		int countC=0;

		int flagH=0;
		int countH=0;

		Long answer = (long)0;

		for (int i = 0; i < N; i++) {
			if (SList.get(i).substring(0,1).equals("M")) {
				flagM = 1;
				countM++;
			}
			else if (SList.get(i).substring(0,1).equals("A")) {
				flagA = 1;
				countA++;
			}
			else if (SList.get(i).substring(0,1).equals("R")) {
				flagR = 1;
				countR++;
			}
			else if (SList.get(i).substring(0,1).equals("C")) {
				flagC = 1;
				countC++;
			}
			else if (SList.get(i).substring(0,1).equals("H")) {
				flagH = 1;
				countH++;
			}
			else {

			}
		}

		if (flagM + flagA + flagR + flagC + flagH >2) {
			answer = answer
					+ (long)((long)countM * (long)countA * (long)countR)
					+ (long)((long)countM * (long)countA * (long)countC)
					+ (long)((long)countM * (long)countA * (long)countH)
					+ (long)((long)countM * (long)countR * (long)countC)
					+ (long)((long)countM * (long)countR * (long)countH)
					+ (long)((long)countM * (long)countC * (long)countH)
					+ (long)((long)countA * (long)countR * (long)countC)
					+ (long)((long)countA * (long)countR * (long)countH)
					+ (long)((long)countR * (long)countC * (long)countH);
		}

		System.out.println(answer);
	}
}
