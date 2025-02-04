import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int M = 0;
		int A = 0;
		int R = 0;
		int C = 0;
		int H = 0;
		
		for(int i = 0; i < N; i++) {
			 String S = sc.next();
			if(S.charAt(0) == 'M') {
				M++;
			} else if(S.charAt(0) == 'A') {
				A++;
			} else if(S.charAt(0) == 'R') {
				R++;
			} else if(S.charAt(0) == 'C') {
				C++;
			} else if(S.charAt(0) == 'H') {
				H++;
			}
		}
		
		long MAR = M * A * R;
		long MAC = M * A * C;
		long MAH = M * A * H;
		long MRC = M * R * C;
		long MRH = M * R * H;
		long MCH = M * C * H;
		long ARC = A * R * C;
		long ARH = A * R * H;
		long ACH = A * C * H;
		long RCH = R * C * H;
		long total = MAR + MAC + MAH + MRC + MRH + MCH + ARC + ARH + ACH + RCH;
		
		System.out.println(total);
		
	}
}
