import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int cntFirstB = 0;
		int cntLastA = 0;
		int cntAB = 0;
		int cntFirstBLastA = 0;
		int answer = 0;

		for (int i = 0; i < N; i++) {
			String s = sc.next();
			if (s.charAt(0) == 'B')
				cntFirstB++;
			if (s.charAt(s.length() - 1) == 'A')
				cntLastA++;
			if (s.charAt(0) == 'B' && s.charAt(s.length() - 1) == 'A')
				cntFirstBLastA++;
			int startId = s.indexOf("AB");
			while (startId != -1) {
				cntAB++;
				startId = s.indexOf("AB", startId + 2);
			}
		}
		if (cntFirstBLastA == cntFirstB && cntFirstBLastA == cntLastA)
			answer = cntAB + cntFirstBLastA - 1;
		else
			answer = cntAB + Math.min(cntFirstB, cntLastA);
		sc.close();
		System.out.println(answer);
	}
}
